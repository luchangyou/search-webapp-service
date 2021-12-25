package com.yiguan.search.common.util;

import com.yiguan.search.exception.ExcelException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class ExcelUtil {

	/**
     * @MethodName  : listToExcel
     * @Description : 导出Excel（可以导出到本地文件系统，也可以导出到浏览器，工作表大小为2003支持的最大值）
     * @param list      数据源
     * @param fieldMap      类的英文属性和Excel中的中文列名的对应关系
     * @param wwb       操作可写工作簿
     * @throws ExcelException
     */
    public static  <T>  void   listToExcel (
            List<T> list ,
            LinkedHashMap<String,String> fieldMap,
            String sheetName,
            WritableWorkbook wwb
            ) throws ExcelException{

        listToExcel(list, fieldMap, sheetName, 65535, wwb);

    }
    
    /**
     * @MethodName  : listToExcel
     * @Description : 导出Excel（可以导出到本地文件系统，也可以导出到浏览器，可自定义工作表大小）
     * @param list      数据源
     * @param fieldMap      类的英文属性和Excel中的中文列名的对应关系
     * 如果需要的是引用对象的属性，则英文属性使用类似于EL表达式的格式
     * 如：list中存放的都是student，student中又有college属性，而我们需要学院名称，则可以这样写
     * fieldMap.put("college.collegeName","学院名称")
     * @param sheetName 工作表的名称
     * @param sheetSize 每个工作表中记录的最大个数
     * @param wwb       操作可写工作簿
     * @throws ExcelException
     */
    public static <T>  void   listToExcel (
            List<T> list ,
            LinkedHashMap<String,String> fieldMap,
            String sheetName,
            int sheetSize,
            WritableWorkbook wwb
            ) throws ExcelException {


        if(list==null || list.size()==0){
            throw new ExcelException("数据源中没有任何数据");
        }

        if(sheetSize>65535 || sheetSize<1){
            sheetSize=65535;
        }

        //创建工作簿并发送到OutputStream指定的地方
        //WritableWorkbook wwb;
        try {
            //wwb = Workbook.createWorkbook(out);

            //因为2003的Excel一个工作表最多可以有65536条记录，除去列头剩下65535条
            //所以如果记录太多，需要放到多个工作表中，其实就是个分页的过程
            //1.计算一共有多少个工作表
            double sheetNum=Math.ceil(list.size()/new Integer(sheetSize).doubleValue());

            //2.创建相应的工作表，并向其中填充数据
            for(int i=0; i<sheetNum; i++){
                //如果只有一个工作表的情况
                if(1==sheetNum){
                    WritableSheet sheet=wwb.createSheet(sheetName, i);
                    fillSheet(sheet, list, fieldMap, 0, list.size()-1);

                //有多个工作表的情况
                }else{
                    WritableSheet sheet=wwb.createSheet(sheetName+(i+1), i);

                    //获取开始索引和结束索引
                    int firstIndex=i*sheetSize;
                    int lastIndex=(i+1)*sheetSize-1>list.size()-1 ? list.size()-1 : (i+1)*sheetSize-1;
                    //填充工作表
                    fillSheet(sheet, list, fieldMap, firstIndex, lastIndex);
                }
            }

            //wwb.write();
            //wwb.close();

        }catch (Exception e) {
            e.printStackTrace();
            //如果是ExcelException，则直接抛出
            if(e instanceof ExcelException){
                throw (ExcelException)e;

            //否则将其它异常包装成ExcelException再抛出
            }else{
                throw new ExcelException("导出Excel失败");
            }
        }

    }
    
    /**
     * @MethodName  : fillSheet
     * @Description : 向工作表中填充数据
     * @param sheet     工作表 
     * @param list  数据源
     * @param fieldMap 中英文字段对应关系的Map
     * @param firstIndex    开始索引
     * @param lastIndex 结束索引
     */
    private static <T> void fillSheet(
            WritableSheet sheet,
            List<T> list,
            LinkedHashMap<String,String> fieldMap,
            int firstIndex,
            int lastIndex
            )throws Exception{

        //定义存放英文字段名和中文字段名的数组
        String[] enFields=new String[fieldMap.size()];
        String[] cnFields=new String[fieldMap.size()];

        //填充数组
        int count=0;
        for(Entry<String,String> entry:fieldMap.entrySet()){
            enFields[count]=entry.getKey();
            cnFields[count]=entry.getValue();
            count++;
        }
        //填充表头
        for(int i=0;i<cnFields.length;i++){
            Label label=new Label(i,0,cnFields[i]);
            sheet.addCell(label);
        }

        //填充内容
        int rowNo=1;
        for(int index=firstIndex;index<=lastIndex;index++){
            //获取单个对象
            T item=list.get(index);
            for(int i=0;i<enFields.length;i++){
                Object objValue=getFieldValueByNameSequence(enFields[i], item);
                String fieldValue=objValue==null ? "" : objValue.toString();
                Label label =new Label(i,rowNo,fieldValue);
                sheet.addCell(label);
            }

            rowNo++;
        }

        //设置自动列宽
        setColumnAutoSize(sheet, 5);
    }
    
    /**
     * @MethodName  : getFieldValueByNameSequence
     * @Description : 
     * 根据带路径或不带路径的属性名获取属性值
     * 即接受简单属性名，如userName等，又接受带路径的属性名，如student.department.name等
     * 
     * @param fieldNameSequence  带路径的属性名或简单属性名
     * @param o 对象
     * @return  属性值
     * @throws Exception
     */
    private static  Object getFieldValueByNameSequence(String fieldNameSequence, Object o) throws Exception{

        Object value=null;

        //将fieldNameSequence进行拆分
        String[] attributes=fieldNameSequence.split("\\.");
        if(attributes.length==1){
            value=getFieldValueByName(fieldNameSequence, o);
        }else{
            //根据属性名获取属性对象
            Object fieldObj=getFieldValueByName(attributes[0], o);
            String subFieldNameSequence=fieldNameSequence.substring(fieldNameSequence.indexOf(".")+1);
            value=getFieldValueByNameSequence(subFieldNameSequence, fieldObj);
        }
        return value; 

    } 
    
    /**
     * @MethodName  : setColumnAutoSize
     * @Description : 设置工作表自动列宽和首行加粗
     * @param ws
     */
    private static void setColumnAutoSize(WritableSheet ws,int extraWith){
        //获取本列的最宽单元格的宽度
        for(int i=0;i<ws.getColumns();i++){
            int colWith=0;
            for(int j=0;j<ws.getRows();j++){
                String content=ws.getCell(i,j).getContents().toString();
                int cellWith=content.length();
                if(colWith<cellWith){
                    colWith=cellWith;
                }
            }
            //设置单元格的宽度为最宽宽度+额外宽度
            ws.setColumnView(i, colWith+extraWith);
        }

    }
    
    /**
     * @MethodName  : getFieldValueByName
     * @Description : 根据字段名获取字段值
     * @param fieldName 字段名
     * @param o 对象
     * @return  字段值
     */
    private static  Object getFieldValueByName(String fieldName, Object o) throws Exception{

        Object value=null;
        Field field=getFieldByName(fieldName, o.getClass());

        if(field !=null){
            field.setAccessible(true);
            value=field.get(o);
        }else{
            throw new ExcelException(o.getClass().getSimpleName() + "类不存在字段名 "+fieldName);
        }

        return value;
    }
    
    /**
     * @MethodName  : getFieldByName
     * @Description : 根据字段名获取字段
     * @param fieldName 字段名
     * @param clazz 包含该字段的类
     * @return 字段
     */
    private static Field getFieldByName(String fieldName, Class<?>  clazz){
        //拿到本类的所有字段
        Field[] selfFields=clazz.getDeclaredFields();

        //如果本类中存在该字段，则返回
        for(Field field : selfFields){
            if(field.getName().equals(fieldName)){
                return field;
            }
        }

        //否则，查看父类中是否存在此字段，如果有则返回
        Class<?> superClazz=clazz.getSuperclass();
        if(superClazz!=null  &&  superClazz !=Object.class){
            return getFieldByName(fieldName, superClazz);
        }

        //如果本类和父类都没有，则返回空
        return null;
    }

    //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-");//设置日期格式
    //System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

    public static String exportExcel(String excelName,HttpServletRequest request){
        //获取到报表的储存路径
        //String path = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
        File file =new File(request.getSession().getServletContext().getRealPath("/excel/"));
        if  (!file .exists()  && !file .isDirectory()){
            file .mkdir();
        }
        String path = request.getSession().getServletContext().getRealPath("/excel/");
        path = path.replace("/","\\\\");
        String yyyyMMddHHmmss = DateUtil.dateTimeNow("yyyy-MM-dd-HHmmss");
        path=path.substring(0,0)+path.substring(2,path.length());
        path+=excelName + "_" + yyyyMMddHHmmss + ".xls";
        return path;
    }
}

