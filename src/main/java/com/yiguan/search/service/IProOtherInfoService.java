/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IProOtherInfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:00:55 
 * @version V1.0   
 */
package com.yiguan.search.service;

import java.util.List;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ProOtherInfo;

/**
 * @ClassName: IProOtherInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:00:55
 * 
 */
public interface IProOtherInfoService {

	public List<ProOtherInfo> getProGameInfoList(String keyWord,
			Page<ProOtherInfo> page);

	public int totalNumber(String keyWord);

	public ProOtherInfo getProOtherInfo(long id);

	public List<ProOtherInfo> getProOtherInfoByUuid(String uuid);

	public List<ProOtherInfo> getProGameInfoList(String keyWord,
			String userShenfen, Page page);

	public int totalNumber(String keyWord, String userShenfen);
}
