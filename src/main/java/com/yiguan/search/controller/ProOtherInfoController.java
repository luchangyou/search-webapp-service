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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yiguan.search.model.ProOtherInfo;
import com.yiguan.search.service.IProOtherInfoService;

/**
 * @ClassName: ProGameInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:37:06
 * 
 */
@Controller
@RequestMapping(value = "/other")
public class ProOtherInfoController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(ProOtherInfoController.class);

	@Autowired
	private IProOtherInfoService proOtherInfoServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String id = request.getParameter("id");

		ProOtherInfo proOtherInfo = proOtherInfoServiceImpl
				.getProOtherInfo(Long.parseLong(id));

		model.addAttribute("proOtherInfo", proOtherInfo);
		model.addAttribute("channel", "game");
		String keyword = request.getParameter("keyword");
		model.addAttribute("keyword", keyword);

		return new ModelAndView("other-detail");
	}
}
