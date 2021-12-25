/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IProOtherInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午2:48:17 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ProOtherInfo;

/**
 * @ClassName: IProOtherInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午2:48:17
 * 
 */
public interface IProOtherInfoDao {

	List<ProOtherInfo> getProGameInfoList(String keyWord,
			Page<ProOtherInfo> page);

	int totalNumber(String keyWord);

	ProOtherInfo getProOtherInfo(long id);

	List<ProOtherInfo> getProOtherInfoByUuid(String uuid);

	List<ProOtherInfo> getProGameInfoList(String keyWord, String userShenfen,
			Page page);

	int totalNumber(String keyWord, String userShenfen);

}
