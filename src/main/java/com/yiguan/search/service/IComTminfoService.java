/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComTminfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:49:03 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.ComTminfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IComTminfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:49:03
 * 
 */
public interface IComTminfoService {

	public List<ComTminfo> getComTminfoList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}
