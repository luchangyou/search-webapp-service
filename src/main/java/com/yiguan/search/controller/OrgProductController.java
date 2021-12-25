/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ProGameInfoController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:37:06 
 * @version V1.0   
 */
package com.yiguan.search.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yiguan.search.model.ProGameInfo;
import com.yiguan.search.model.ProOtherInfo;
import com.yiguan.search.service.IProGameInfoService;
import com.yiguan.search.service.IProOtherInfoService;

/**
 * @ClassName: ProGameInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:37:06
 * 
 */
@Controller
@RequestMapping(value = "/orgPro")
public class OrgProductController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(OrgProductController.class);

	@Autowired
	private IProGameInfoService proGameInfoServiceImpl;
	@Autowired
	private IProOtherInfoService proOtherInfoServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String uuid = request.getParameter("prUuid");

		List<ProGameInfo> proGameInfoList = proGameInfoServiceImpl
				.getProGameInfoListByUuid(uuid);

		String keyword = request.getParameter("keyword");
		model.addAttribute("keyword", keyword);

		if (proGameInfoList != null && proGameInfoList.size() > 0) {
			ProGameInfo proGameInfo = proGameInfoList.get(0);
			model.addAttribute("proGameInfo", proGameInfo);
			model.addAttribute("channel", "org");
			return new ModelAndView("gsdata-detail");
		}

		List<ProOtherInfo> proOtherInfoList = proOtherInfoServiceImpl
				.getProOtherInfoByUuid(uuid);
		ProOtherInfo proOtherInfo = null;
		if (proOtherInfoList != null && proOtherInfoList.size() > 0) {
			proOtherInfo = proOtherInfoList.get(0);
		}
		model.addAttribute("proOtherInfo", proOtherInfo);
		model.addAttribute("channel", "org");

		return new ModelAndView("other-detail");
	}
}
