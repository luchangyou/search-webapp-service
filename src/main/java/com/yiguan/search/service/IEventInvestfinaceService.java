/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventInvestfinaceService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:30:18 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.EventInvestfinace;

/**
 * @ClassName: IEventInvestfinaceService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:30:18
 * 
 */
public interface IEventInvestfinaceService {

	public EventInvestfinace getEventInvestfinaceByEuuid(String euuid);

}
