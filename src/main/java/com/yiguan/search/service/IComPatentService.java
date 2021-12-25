/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComPatentService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:51:55 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.ComPatent;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IComPatentService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:51:55
 * 
 */
public interface IComPatentService {

	public List<ComPatent> getComPatentList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}
