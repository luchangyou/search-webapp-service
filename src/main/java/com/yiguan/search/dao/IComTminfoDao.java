/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComTminfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:50:36 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComTminfo;

/**
 * @ClassName: IComTminfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:50:36
 * 
 */
public interface IComTminfoDao {

	public List<ComTminfo> getComTminfoList(String uuid);
}
