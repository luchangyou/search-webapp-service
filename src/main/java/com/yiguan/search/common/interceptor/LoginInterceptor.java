package com.yiguan.search.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	// @Autowired
	// private ISessionProvider sessionProviderImpl;
	// @Autowired
	// private IAdminService adminServiceImpl;

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception {
		// 如果是登录的controller请求则放行
		if (request.getRequestURI().indexOf("/login") > 0) {
			return true;
		}

		if (request.getRequestURI().indexOf("/index") > 0) {
			return true;
		}

		if (request.getRequestURI().indexOf("/toSignupPage") > 0) {
			return true;
		}

		if (request.getRequestURI().indexOf("/signup") > 0) {
			return true;
		}

		// 判断session中是否有用户登录信息，如果有则放行，如果没有则跳转到登录页面，让用户进行重新登录
		if (request.getSession().getAttribute("userInfo") != null) {
			return true;
		}
		// 从共享服务器获取用户登录信息，如果有则放行，如果没有跳转到登录页面
		/*
		 * String username =
		 * sessionProviderImpl.getAttributeForUserName(RequestUtils
		 * .getCSESSIONID(request, response)); if(username != null){ //AdminUser
		 * user = adminServiceImpl.getUser(username);
		 * //request.getSession().setAttribute("adminUser", user); return true;
		 * }
		 */
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(
				request, response);
		return false;

	}

}
