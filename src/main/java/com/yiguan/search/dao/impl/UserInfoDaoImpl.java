/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: UserInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:14:58 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IUserInfoDao;
import com.yiguan.search.mapper.UserInfoMapper;
import com.yiguan.search.model.UserInfo;
import com.yiguan.search.model.UserInfoExample;

/**
 * @ClassName: UserInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:14:58
 * 
 */
@Repository("userInfoDaoImpl")
public class UserInfoDaoImpl implements IUserInfoDao {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo userLogin(String userName, String passWord) {
		if (Common.isEmpty(userName) || Common.isEmpty(passWord)) {
			return null;
		}

		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(userName)
				.andPassWordEqualTo(passWord);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	private UserInfo getUserInfo(String userName) {
		if (Common.isEmpty(userName)) {
			return null;
		}

		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(userName);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public int signup(String userName, String passWord) {
		// 用户名密码不能为空
		if (Common.isEmpty(userName) || Common.isEmpty(passWord)) {
			return -1;
		}

		// 用户名已存在
		UserInfo userInfo = this.getUserInfo(userName);
		if (userInfo != null) {
			return -2;
		}

		UserInfo user = new UserInfo();
		user.setUserName(userName);
		user.setPassWord(passWord);
		user.setShenfen("普通");
		int i = userInfoMapper.insertSelective(user);

		return i;
	}

}
