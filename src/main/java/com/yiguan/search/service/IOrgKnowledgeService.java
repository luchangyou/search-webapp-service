/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IOrgKnowledgeService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:06 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.OrgKnowledge;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IOrgKnowledgeService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:06
 * 
 */
public interface IOrgKnowledgeService {

	public List<OrgKnowledge> getListByOUuid(String ouuid);

    String createOrgKnowledgeExcel(String uuid, WritableWorkbook wwb);

}
