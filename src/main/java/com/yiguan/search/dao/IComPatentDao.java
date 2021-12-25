/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComPatentDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:52:50 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComPatent;

/**
 * @ClassName: IComPatentDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:52:50
 * 
 */
public interface IComPatentDao {

	public List<ComPatent> getComPatentList(String uuid);
}
