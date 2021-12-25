/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasKnowledgeInfoController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:35:27 
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

import com.yiguan.search.model.BasKnowledgeInfo;
import com.yiguan.search.service.IBasKnowledgeInfoService;

/**
 * @ClassName: BasKnowledgeInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:35:27
 * 
 */
@Controller
@RequestMapping(value = "/knowledge")
public class BasKnowledgeInfoController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(BasKnowledgeInfoController.class);

	@Autowired
	private IBasKnowledgeInfoService basKnowledgeInfoServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String uuid = request.getParameter("uuid");
		String keyword = request.getParameter("keyword");

		BasKnowledgeInfo basKnowledgeInfo = basKnowledgeInfoServiceImpl
				.getBasKnowledgeInfo(uuid);

		model.addAttribute("basKnowledgeInfo", basKnowledgeInfo);
		model.addAttribute("channel", "knowledge");
		model.addAttribute("keyword", keyword);
		return new ModelAndView("knowledge-detail");
	}

}
