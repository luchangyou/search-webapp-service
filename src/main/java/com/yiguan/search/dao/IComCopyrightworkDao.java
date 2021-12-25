/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComCopyrightworkDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:50:51 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComCopyrightwork;

/**
 * @ClassName: IComCopyrightworkDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:50:51
 * 
 */
public interface IComCopyrightworkDao {

	public List<ComCopyrightwork> getComCopyrightworkList(String uuid);
}
