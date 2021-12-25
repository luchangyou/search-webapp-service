/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventLawDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:12:40 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.yiguan.search.model.EventLaw;

/**
 * @ClassName: IEventLawDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:12:40
 * 
 */
public interface IEventLawDao {

	public EventLaw getEventLawByEuuid(String euuid);
}
