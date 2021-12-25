/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComShareholderVo.java
 * @Package com.yiguan.search.domain
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:40:31 
 * @version V1.0   
 */
package com.yiguan.search.domain;

import java.io.Serializable;

/**
 * @ClassName: ComShareholderVo
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:40:31
 * 
 */
public class ComShareholderVo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String investment;
	private String investmentRate;
	private String subscriptionTime;
	private String subscriptionAmount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getInvestmentRate() {
		return investmentRate;
	}

	public void setInvestmentRate(String investmentRate) {
		this.investmentRate = investmentRate;
	}

	public String getSubscriptionTime() {
		return subscriptionTime;
	}

	public void setSubscriptionTime(String subscriptionTime) {
		this.subscriptionTime = subscriptionTime;
	}

	public String getSubscriptionAmount() {
		return subscriptionAmount;
	}

	public void setSubscriptionAmount(String subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
	}

}
