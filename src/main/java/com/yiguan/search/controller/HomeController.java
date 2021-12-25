/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: TestController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午9:13:55
 * @version V1.0   
 */
package com.yiguan.search.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: HomeController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午9:13:55
 *
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(value = "/home")
	public ModelAndView home(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		return new ModelAndView("home");
	}

}
