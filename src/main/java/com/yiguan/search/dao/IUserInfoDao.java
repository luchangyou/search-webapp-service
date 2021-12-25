/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IUserInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:14:41 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.yiguan.search.model.UserInfo;

/**
 * @ClassName: IUserInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月7日 上午10:14:41
 * 
 */
public interface IUserInfoDao {

	public UserInfo userLogin(String userName, String passWord);

	public int signup(String userName, String passWord);
}
