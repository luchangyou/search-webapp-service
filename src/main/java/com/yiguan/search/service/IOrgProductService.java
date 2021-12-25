/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IOrgProductService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:12:34 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.OrgProduct;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IOrgProductService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:12:34
 * 
 */
public interface IOrgProductService {

	public List<OrgProduct> getOrgProductList(String uuid);

	public OrgProduct getOrgProduct(long id);

    String createOrgProductExcel(String uuid, WritableWorkbook wwb);

}
