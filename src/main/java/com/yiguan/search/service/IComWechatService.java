/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IComWechatService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:13 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.ComWechat;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IComWechatService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:13
 * 
 */
public interface IComWechatService {

	public List<ComWechat> getComWechatList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}
