/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComWechatService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:13 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComWechat;

/**
 * @ClassName: IComWechatService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:13
 * 
 */
public interface IComWechatDao {

	public List<ComWechat> getComWechatList(String uuid);

}
