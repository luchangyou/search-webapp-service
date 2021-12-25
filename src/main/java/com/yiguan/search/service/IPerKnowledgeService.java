/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerKnowledgeService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:18 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.PerKnowledge;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IPerKnowledgeService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:18
 * 
 */
public interface IPerKnowledgeService {

	public List<PerKnowledge> getListByPuuid(String puuid);

    String createPerKnowledgeExcel(String uuid, WritableWorkbook wwb);

}
