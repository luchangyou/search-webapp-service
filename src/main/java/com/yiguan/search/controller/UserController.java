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
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.model.UserInfo;
import com.yiguan.search.service.IUserInfoService;

/**
 * 
 * @ClassName: HomeController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午9:13:55
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@Autowired
	private IUserInfoService userInfoServiceImpl;

	@RequestMapping(value = "/toLoginPage")
	public ModelAndView toLoginPage(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		return new ModelAndView("index");
	}

	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, Model model, String userName,
			String passWord) {

		UserInfo userInfo = userInfoServiceImpl.userLogin(userName, passWord);
		if (userInfo == null) {
			model.addAttribute("error", "用户名或密码错误");
			return new ModelAndView("index");
		}
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(60 * 60);
		session.setAttribute("userInfo", userInfo);
		model.addAttribute("userInfo", userInfo);
		return new ModelAndView("main");
	}

	@RequestMapping(value = "/toSignupPage")
	public ModelAndView toSignupPage(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		return new ModelAndView("signup");
	}

	@RequestMapping(value = "/signup")
	public ModelAndView signup(HttpServletRequest request,
			HttpServletResponse response, Model model, String userName,
			String passWord, String passWords) {

		if (Common.isEmpty(userName) || Common.isEmpty(passWord)) {
			model.addAttribute("error", "请完整填写信息");
			return new ModelAndView("signup");
		}

		/*
		 * if (!passWord.equals(passWords)) { model.addAttribute("error",
		 * "两次密码不一致"); return new ModelAndView("signup"); }
		 */

		int i = userInfoServiceImpl.signup(userName, passWord);

		// 注册成功，跳转到登录页面
		if (i == 1) {
			return new ModelAndView("index");
		}
		if (i == -2) {
			model.addAttribute("error", "用户名已存在");
		}
		return new ModelAndView("signup");
	}

	/**
	 * 退出登录
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("LogOut")
	public ModelAndView LogOut(Model model, HttpServletRequest request) {
		request.getSession().invalidate();
		return new ModelAndView("index");
	}
}
