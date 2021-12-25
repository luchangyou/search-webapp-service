/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: UserInfoServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:15:43 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiguan.search.dao.IUserInfoDao;
import com.yiguan.search.model.UserInfo;
import com.yiguan.search.service.IUserInfoService;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:15:43
 * 
 */
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private IUserInfoDao userInfoDaoImpl;

	@Override
	public UserInfo userLogin(String userName, String passWord) {
		return userInfoDaoImpl.userLogin(userName, passWord);
	}

	@Override
	public int signup(String userName, String passWord) {
		return userInfoDaoImpl.signup(userName, passWord);
	}
}
