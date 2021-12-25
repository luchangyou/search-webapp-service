/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventInvestfinaceDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:33:56 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.yiguan.search.model.EventInvestfinace;

/**
 * @ClassName: IEventInvestfinaceDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:33:56
 * 
 */
public interface IEventInvestfinaceDao {

	public EventInvestfinace getEventInvestfinaceByEuuid(String euuid);

}
