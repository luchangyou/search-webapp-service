/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IOrgProductDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:13:18 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.OrgProduct;

/**
 * @ClassName: IOrgProductDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:13:18
 * 
 */
public interface IOrgProductDao {

	public List<OrgProduct> getOrgProductList(String uuid);

	public OrgProduct getOrgProduct(long id);
}
