/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IEventRecruitService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:31:05 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.EventRecruit;

/**
 * @ClassName: IEventRecruitService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:31:05
 * 
 */
public interface IEventRecruitService {

	public EventRecruit getEventRecruitByEuuid(String euuid);

}
