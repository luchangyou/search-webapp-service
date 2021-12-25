/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IOerKnowledgeDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:00:13 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.OrgOrganize;

import java.util.List;

/**
 * @ClassName: IOerKnowledgeDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:00:13
 * 
 */
public interface IOrgOrganizeDao {

	public List<OrgOrganize> getListByROUuid(String ouuid);

	public List<OrgOrganize> getListByRtype(String rtype);

	List<OrgOrganize> getOrgOrganizeListByRouuidAndRtype(String uuid, String rtype, Page<OrgOrganize> page);

}
