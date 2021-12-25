/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IProGameInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:02:01 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ProGameInfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IProGameInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:02:01
 * 
 */
public interface IProGameInfoService {
	/**
	 * @Description: 根据关键字获取列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年7月26日 上午11:11:37
	 *
	 */
	public List<ProGameInfo> getProGameInfoList(String keyWord,
			Page<ProGameInfo> page);

	public ProGameInfo getProGameInfo(long id);

	public int totalNumber(String keyWord);

	public List<ProGameInfo> getProGameInfoListByUuid(String uuid);

	public List<ProGameInfo> getProGameInfoListByDevelopCom(String developCom);

	public List<ProGameInfo> getProGameInfoList(String keyWord,
			String userShenfen, Page page);

	public int totalNumber(String keyWord, String userShenfen);

    String createProGameInfoExcel(String uuid, WritableWorkbook wwb);

}
