/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComInvestmentInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:11:55 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComInvestmentInfo;

/**
 * @ClassName: IComInvestmentInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:11:55
 * 
 */
public interface IComInvestmentInfoDao {

	public List<ComInvestmentInfo> getComInvestmentInfoListByUuid(String uuid);
}
