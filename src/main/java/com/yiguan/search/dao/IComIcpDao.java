/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComIcpService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:46:53 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.ComIcp;

/**
 * @ClassName: IComIcpService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:46:53
 * 
 */
public interface IComIcpDao {

	public List<ComIcp> getComIcpList(String uuid);
}
