/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventRecruitDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:34:57 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.yiguan.search.model.EventRecruit;

/**
 * @ClassName: IEventRecruitDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:34:57
 * 
 */
public interface IEventRecruitDao {

	public EventRecruit getEventRecruitByEuuid(String euuid);

}
