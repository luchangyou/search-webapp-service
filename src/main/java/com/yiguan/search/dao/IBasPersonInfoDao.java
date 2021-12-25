/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasPersonInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:01:24 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.domain.BasPersonInfoVo;
import com.yiguan.search.model.BasPersonInfo;

import java.util.List;

/**
 * @ClassName: IBasPersonInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:01:24
 * 
 */
public interface IBasPersonInfoDao {
	/**
	 * @Description: 根据关键字获取列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年7月26日 上午11:11:37
	 *
	 */
	public List<BasPersonInfoVo> getBasPersonInfoList(String keyWord,
			Page<BasPersonInfo> page);

	public BasPersonInfo getBasPersonInfo(long id);

	public int totalNumber(String keyWord);

	public BasPersonInfo getBasPersonInfoByUuid(String uuid);

	public List<BasPersonInfoVo> getBasPersonInfoList(String keyWord,
			String personTag, Page page);

	public int totalNumber(String keyWord, String personTag);

    List<BasPersonInfo> getBasPersonInfoList(String uuid);

}
