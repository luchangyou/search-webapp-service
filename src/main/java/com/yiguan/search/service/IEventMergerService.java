/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventMergerService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:30:41 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.EventMerger;

/**
 * @ClassName: IEventMergerService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:30:41
 * 
 */
public interface IEventMergerService {

	public EventMerger getEventMergerByEuuid(String euuid);

}
