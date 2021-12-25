/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComInvestmentInfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:10:53 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.ComInvestmentInfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IComInvestmentInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:10:53
 * 
 */
public interface IComInvestmentInfoService {

	public List<ComInvestmentInfo> getComInvestmentInfoListByUuid(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}
