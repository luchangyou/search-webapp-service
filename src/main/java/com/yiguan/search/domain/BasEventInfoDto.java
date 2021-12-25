/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasEventInfoDto.java
 * @Package com.yiguan.search.domain
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午9:42:05 
 * @version V1.0   
 */
package com.yiguan.search.domain;

import java.io.Serializable;

import com.yiguan.search.model.BasEventInfo;

/**
 * @ClassName: BasEventInfoDto
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午9:42:05
 * 
 */
public class BasEventInfoDto extends BasEventInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String financiers;

	private String time;

	private String industry;

	private String classLb;

	private String domain;

	private String round;

	private String quota;

	private String investors;

	private String acquiree;

	private String equity;

	private String buyers;

	private String name;

	private String salary;

	private String education;

	private String workexp;

	private String abs;

	public String getFinanciers() {
		return financiers;
	}

	public void setFinanciers(String financiers) {
		this.financiers = financiers;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getClassLb() {
		return classLb;
	}

	public void setClassLb(String classLb) {
		this.classLb = classLb;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

	public String getInvestors() {
		return investors;
	}

	public void setInvestors(String investors) {
		this.investors = investors;
	}

	public String getAcquiree() {
		return acquiree;
	}

	public void setAcquiree(String acquiree) {
		this.acquiree = acquiree;
	}

	public String getEquity() {
		return equity;
	}

	public void setEquity(String equity) {
		this.equity = equity;
	}

	public String getBuyers() {
		return buyers;
	}

	public void setBuyers(String buyers) {
		this.buyers = buyers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getWorkexp() {
		return workexp;
	}

	public void setWorkexp(String workexp) {
		this.workexp = workexp;
	}

	public String getAbs() {
		return abs;
	}

	public void setAbs(String abs) {
		this.abs = abs;
	}

}
