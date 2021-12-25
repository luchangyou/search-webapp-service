/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasPersonInfoVo.java
 * @Package com.yiguan.search.domain
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午1:12:52 
 * @version V1.0   
 */
package com.yiguan.search.domain;

import com.yiguan.search.model.BasPersonInfo;

/**
 * @ClassName: BasPersonInfoVo
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午1:12:52
 * 
 */
public class BasPersonInfoVo extends BasPersonInfo {

	private String job;
	private String oname;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

}
