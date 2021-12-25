/**
 * Created at 2015-09-27.
 * Info:
 * @Tiantanhehe (C)2011-3011 Tiantanhehe
 * @Author huke <huke@tiantanhehe.com>
 */
package com.yiguan.search.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.yiguan.search.common.core.ApplicationContextHolder;

/**
 * 
 * @ClassName: BaseController
 * @Description: Controller层基类，大多数Controller可以通过集成该基类实现
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月25日 下午4:20:54
 *
 */
@Controller
public class BaseController {
	@Autowired
	private HttpServletRequest request;

	@Autowired
	private HttpSession session;

	private static ApplicationContext applicationContext = ApplicationContextHolder
			.getApplicationContext();

	/**
	 * 获取HttpServletRequest请求对象。
	 * 
	 * @return HttpServletRequest请求对象。
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * 设置HttpServletRequest请求对象。它由Spring负责实例化并自动注入。
	 * 
	 * @param request
	 *            HttpServletRequest请求对象。
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * 获取HttpSession会话对象。
	 * 
	 * @return HttpSession会话对象。
	 */
	public HttpSession getSession() {
		return session;
	}

	/**
	 * 设置HttpSession会话对象。它由Spring负责实例化并自动注入。
	 * 
	 * @param session
	 *            HttpSession请求对象。
	 */
	public void setSession(HttpSession session) {
		this.session = session;
	}

	/**
	 * 获取当前登录系统用户使用的本地化语言信息。
	 * 
	 * @return 当前登录系统用户使用的本地化语言信息。
	 */
	public Locale getCurrentAccountLocale() {

		return null;
	}

	/**
	 * 功能：根据给定的Key、本地语言的类型，获取给定Key对应的本地语言的信息串。
	 * 
	 * 用法：InternationalizationUtil.getI18nMessage(key, Locale.[US|CHINESE|...]);
	 * 
	 * @param i18nKey
	 *            Properties国际化资源文件中的Key。
	 * 
	 * @return 给定Key对应的本地语言的信息串。
	 */
	public String getMessage(String i18nKey) {
		return applicationContext.getMessage(i18nKey, null,
				getCurrentAccountLocale());
	}

	/**
	 * 功能：根据给定的Key、本地语言的类型，获取给定Key对应的本地语言的信息串。
	 * 
	 * 用法：InternationalizationUtil.getI18nMessage(key, Locale.[US|CHINESE|...]);
	 * 
	 * @param i18nKey
	 *            Properties国际化资源文件中的Key。
	 * 
	 * @param locale
	 *            本地语言的类型，取值为java.util.Locale的静态变量。如Locale.CHINESE、Locale.US等。
	 * 
	 * @return 给定Key对应的本地语言的信息串。
	 */
	public String getMessage(String i18nKey, Locale locale) {
		return applicationContext.getMessage(i18nKey, null, locale);
	}

	/**
	 * 功能：根据给定的Key、替换Properties国际化资源文件中占位符的信息串数组，以及本地语言的类型，获取给定Key对应的本地语言的信息串。
	 * 
	 * 用法：I18Util.getI18nMessage(key, new Object(){"替换占位符0的信息", "替换占位符1的信息",
	 * ...}, Locale.[US|CHINESE|...]);
	 * 
	 * @param i18nKey
	 *            Properties文件中的Key。
	 * 
	 * @param args
	 *            Properties文件中的{index}占位符。
	 * 
	 * @return 给定Key对应的本地语言的信息串。
	 */
	public String getMessage(String i18nKey, Object[] args) {
		return applicationContext.getMessage(i18nKey, args,
				getCurrentAccountLocale());
	}

	/**
	 * 功能：根据给定的Key、替换Properties国际化资源文件中占位符的信息串数组，以及本地语言的类型，获取给定Key对应的本地语言的信息串。
	 * 
	 * 用法：I18Util.getI18nMessage(key, new Object(){"替换占位符0的信息", "替换占位符1的信息",
	 * ...}, Locale.[US|CHINESE|...]);
	 * 
	 * @param i18nKey
	 *            Properties文件中的Key。
	 * 
	 * @param args
	 *            Properties文件中的{index}占位符。
	 * 
	 * @param locale
	 *            本地语言的类型。如CN、US等。
	 * 
	 * @return 给定Key对应的本地语言的信息串。
	 */
	public String getMessage(String i18nKey, Object[] args, Locale locale) {
		return applicationContext.getMessage(i18nKey, args, locale);
	}

}
