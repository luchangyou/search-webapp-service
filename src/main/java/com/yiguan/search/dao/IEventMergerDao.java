/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventMergerDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:34:26 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.yiguan.search.model.EventMerger;

/**
 * @ClassName: IEventMergerDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:34:26
 * 
 */
public interface IEventMergerDao {

	public EventMerger getEventMergerByEuuid(String euuid);

}
