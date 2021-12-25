/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerOrganizeDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午1:52:28 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.PerOrganize;

/**
 * @ClassName: IPerOrganizeDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午1:52:28
 * 
 */
public interface IPerOrganizeDao {

	public List<PerOrganize> getPerOrganizeListByPuuid(String puuid);

	public List<PerOrganize> getPerOrganizeListByOuuid(String ouuid);
}
