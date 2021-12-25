/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComSoftwarecopyrightService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:41 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.ComSoftwarecopyright;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IComSoftwarecopyrightService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:41
 * 
 */
public interface IComSoftwarecopyrightService {

	public List<ComSoftwarecopyright> getComSoftwarecopyrightList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}
