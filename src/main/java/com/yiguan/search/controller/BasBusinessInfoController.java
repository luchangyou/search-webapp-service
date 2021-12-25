/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasBusinessInfoController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:34:53 
 * @version V1.0   
 */
package com.yiguan.search.controller;

import com.yiguan.search.model.BasBusinessInfo;
import com.yiguan.search.service.IBasBusinessInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: BasBusinessInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:34:53
 * 
 */
@Controller
@RequestMapping(value = "/business")
public class BasBusinessInfoController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(BasBusinessInfoController.class);
	@Autowired
	private IBasBusinessInfoService basBusinessInfoServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView businessDetail(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String id = request.getParameter("id");

		BasBusinessInfo basBusinessInfo = basBusinessInfoServiceImpl
				.getBasBusinessInfo(Integer.parseInt(id));

		model.addAttribute("basBusinessInfo", basBusinessInfo);

		return new ModelAndView("event-detail");
	}
}
