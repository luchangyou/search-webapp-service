/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComShareholderServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.domain.ComShareholderVo;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.mapper.ComShareholderMapper;
import com.yiguan.search.model.ComShareholder;
import com.yiguan.search.model.ComShareholderExample;
import com.yiguan.search.model.ComShareholderTeam;
import com.yiguan.search.service.IComShareholderService;
import com.yiguan.search.service.IComShareholderTeamService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComShareholderServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00
 * 
 */
@Service("comShareholderServiceImpl")
public class ComShareholderServiceImpl implements IComShareholderService {

	@Autowired
	private ComShareholderMapper comShareholderMapper;
	@Autowired
	private IComShareholderTeamService comShareholderTeamServiceImpl;

	@Override
	public List<ComShareholder> getListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComShareholderExample example = new ComShareholderExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComShareholder> list = comShareholderMapper
				.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}

		return list;
	}

	@Override
	public List<ComShareholderVo> getComShareholderVoListByUuid(String uuid) {
		List<ComShareholderVo> comShareholderVoList = new ArrayList<ComShareholderVo>();
		List<ComShareholderTeam> comShareholderTeamList = comShareholderTeamServiceImpl
				.getListByUuid(uuid);
		if (comShareholderTeamList != null && comShareholderTeamList.size() > 0) {
			for (ComShareholderTeam comShareholderTeam : comShareholderTeamList) {
				ComShareholderVo comShareholderVo = new ComShareholderVo();
				comShareholderVo.setName(comShareholderTeam.getOname());
				comShareholderVo.setInvestment(comShareholderTeam
						.getInvestment());
				comShareholderVo.setInvestmentRate(comShareholderTeam
						.getInvestmentRate());
				comShareholderVo.setSubscriptionTime(comShareholderTeam
						.getSubscriptionTime());
				comShareholderVo.setSubscriptionAmount(comShareholderTeam
						.getSubscriptionAmount());
				comShareholderVoList.add(comShareholderVo);
			}
		}
		List<ComShareholder> comShareholderList = this.getListByUuid(uuid);
		if (comShareholderList != null && comShareholderList.size() > 0) {
			for (ComShareholder comShareholder : comShareholderList) {
				ComShareholderVo comShareholderVo = new ComShareholderVo();
				comShareholderVo.setName(comShareholder.getName());
				comShareholderVo.setInvestment(comShareholder.getInvestment());
				comShareholderVo.setInvestmentRate(comShareholder
						.getInvestmentRate());
				comShareholderVo.setSubscriptionTime(comShareholder
						.getSubscriptionTime());
				comShareholderVo.setSubscriptionAmount(comShareholder
						.getSubscriptionAmount());
				comShareholderVoList.add(comShareholderVo);
			}
		}
		return comShareholderVoList;
	}

	@Override
	public String createShareholderExcel(String uuid, WritableWorkbook wwb) {

		List<ComShareholderVo> comShareholderVoLlist = this.getComShareholderVoListByUuid(uuid);

		if(comShareholderVoLlist != null && comShareholderVoLlist.size() >0){
			String shareholderName = "公司股东信息";
			LinkedHashMap<String, String> shareholderMap = this.getShareholderMap();
			try {
				ExcelUtil.listToExcel(comShareholderVoLlist, shareholderMap, shareholderName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	@Override
	public LinkedHashMap<String, String> getShareholderMap() {
		LinkedHashMap<String, String> shareholderMap = new LinkedHashMap<>();
		shareholderMap.put("name","股东名称");
		shareholderMap.put("investment","投资金额");
		shareholderMap.put("investmentRate","出资比例");
		shareholderMap.put("subscriptionTime","认缴金额");
		shareholderMap.put("subscriptionAmount","认缴时间");
		return shareholderMap;
	}

}
