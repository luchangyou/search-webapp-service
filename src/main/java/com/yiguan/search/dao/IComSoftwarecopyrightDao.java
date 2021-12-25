/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComSoftwarecopyrightService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:41 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComSoftwarecopyright;

/**
 * @ClassName: IComSoftwarecopyrightService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:41
 * 
 */
public interface IComSoftwarecopyrightDao {

	public List<ComSoftwarecopyright> getComSoftwarecopyrightList(String uuid);
}
