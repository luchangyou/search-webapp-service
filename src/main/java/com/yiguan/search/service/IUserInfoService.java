/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IUserInfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:15:26 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.UserInfo;

/**
 * @ClassName: IUserInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:15:26
 * 
 */
public interface IUserInfoService {

	public UserInfo userLogin(String userName, String passWord);

	public int signup(String userName, String passWord);
}
