/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventLawService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:11:53 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.EventLaw;

/**
 * @ClassName: IEventLawService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:11:53
 * 
 */
public interface IEventLawService {

	public EventLaw getEventLawByEuuid(String euuid);
}
