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

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.domain.BasPersonInfoVo;
import com.yiguan.search.model.*;
import com.yiguan.search.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @ClassName: HomeController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午9:13:55
 *
 */
@Controller
public class ListController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(ListController.class);

	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	@Autowired
	private IBasBusinessInfoService basBusinessInfoServiceImpl;
	@Autowired
	private IBasKnowledgeInfoService basKnowledgeInfoServiceImpl;
	@Autowired
	private IBasOrganizeInfoService basOrganizeInfoServiceImpl;
	@Autowired
	private IBasPersonInfoService basPersonInfoServiceImpl;
	@Autowired
	private IProGameInfoService proGameInfoServiceImpl;
	@Autowired
	private IPerWorkInfoService perWorkInfoServiceImpl;
	@Autowired
	private IBasEventInfoService basEventInfoServiceImpl;
	@Autowired
	private IProOtherInfoService proOtherInfoServiceImpl;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String channel = request.getParameter("channel");
		String keyWord = request.getParameter("keyword");
		String pg = request.getParameter("pg");
		// 事件筛选条件
		String type = request.getParameter("cmethod");
		String faxing = request.getParameter("cfaxing");
		String touzi = request.getParameter("ctouzi");

		String ctime = request.getParameter("ctime");
		String cprice = request.getParameter("cprice");

		UserInfo userInfo = (UserInfo) request.getSession().getAttribute(
				"userInfo");
		if (userInfo == null) {
			return new ModelAndView("index");
		}
		String shenfen = userInfo.getShenfen();

		// 人物查询条件
		String personTag = "";
		if ("person".equals(channel)) {
			if (!"全部".equals(shenfen)) {
				personTag = shenfen;
			}
		}

		String userShenfen = "";
		if (!"game".equals(channel)) {
			if (Common.isEmpty(type)) {
				if (!"全部".equals(shenfen)) {
					type = shenfen;
				}
			}
		} else {
			// 如果用户身份不是全部，则userShenfen = shenfen;
			if (!"全部".equals(shenfen)) {
				userShenfen = shenfen;
			}
			// 否则userShenfen = "";
		}

		String types = type;

		pg = pg == null ? "1" : pg;
		/*
		 * if (Common.isEmpty(keyWord) || Common.isEmpty(channel)) {
		 * model.addAttribute("message", "请输入您要搜索的内容"); return new
		 * ModelAndView("home"); }
		 */
		logger.info("search channel: {}", channel);
		logger.info("search keyword: {}", keyWord);
		model.addAttribute("channel", channel);
		model.addAttribute("keyword", keyWord);
		model.addAttribute("pg", pg);// 当前页
		// 事件筛选条件
		model.addAttribute("cmethod", type);
		model.addAttribute("cfaxing", faxing);
		model.addAttribute("ctouzi", touzi);

		Page page = new Page();
		page.setLimit(10);
		page.setOffset((Integer.parseInt(pg) - 1) * 10);
		// 获取数据
		// List<BasBusinessInfo> basBusinessInfoList = null;
		List<BasKnowledgeInfo> basKnowledgeInfoList = null;
		List<BasOrganizeInfo> basOrganizeInfoList = null;
		List<BasPersonInfoVo> basPersonInfoList = null;
		List<ProGameInfo> proGameInfoList = null;
		List<ProOtherInfo> proOtherInfoList = null;
		List<BasEventInfo> basEventInfoList = null;
		int totalNumber = 0;
		int tp = 0;
		switch (channel) {
		case "all":

			FutureTask<List<BasEventInfo>> basEventInfoTask = new FutureTask<List<BasEventInfo>>(
					() -> {
						return basEventInfoServiceImpl.getBasEventInfoList(
								keyWord, types, page);
					});

			taskExecutor.submit(basEventInfoTask);

			FutureTask<List<BasKnowledgeInfo>> basKnowledgeInfoTask = new FutureTask<List<BasKnowledgeInfo>>(
					() -> {
						return basKnowledgeInfoServiceImpl
								.getBasKnowledgeInfoList(keyWord, page);
					});
			taskExecutor.submit(basKnowledgeInfoTask);

			FutureTask<List<BasOrganizeInfo>> basOrganizeInfoTask = new FutureTask<List<BasOrganizeInfo>>(
					() -> {
						return basOrganizeInfoServiceImpl
								.getBasOrganizeInfoListByKeyWord(keyWord, types, faxing, touzi, page);
					});
			taskExecutor.submit(basOrganizeInfoTask);

			FutureTask<List<BasPersonInfoVo>> basPersonInfoTask = new FutureTask<List<BasPersonInfoVo>>(
					() -> {
						return basPersonInfoServiceImpl.getBasPersonInfoList(
								keyWord, page);
					});
			taskExecutor.submit(basPersonInfoTask);

			FutureTask<List<ProGameInfo>> proGameInfoTask = new FutureTask<List<ProGameInfo>>(
					() -> {
						return proGameInfoServiceImpl.getProGameInfoList(
								keyWord, page);
					});
			taskExecutor.submit(proGameInfoTask);

			try {
				basEventInfoList = basEventInfoTask.get(1000,
						TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				basKnowledgeInfoList = basKnowledgeInfoTask.get(1000,
						TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				basOrganizeInfoList = basOrganizeInfoTask.get(1000,
						TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				basPersonInfoList = basPersonInfoTask.get(1000,
						TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				proGameInfoList = proGameInfoTask.get(1000,
						TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}

			model.addAttribute("basKnowledgeInfoList", basKnowledgeInfoList);
			model.addAttribute("basOrganizeInfoList", basOrganizeInfoList);
			model.addAttribute("basPersonInfoList", basPersonInfoList);
			model.addAttribute("proGameInfoList", proGameInfoList);
			model.addAttribute("basEventInfoList", basEventInfoList);
			if (basEventInfoList != null && !basEventInfoList.isEmpty()) {
				totalNumber += basEventInfoList.size();
			}
			if (basKnowledgeInfoList != null && !basKnowledgeInfoList.isEmpty()) {
				totalNumber += basKnowledgeInfoList.size();
			}
			if (basOrganizeInfoList != null && !basOrganizeInfoList.isEmpty()) {
				totalNumber += basOrganizeInfoList.size();
			}
			if (basPersonInfoList != null && !basPersonInfoList.isEmpty()) {
				totalNumber += basPersonInfoList.size();
			}
			if (proGameInfoList != null && !proGameInfoList.isEmpty()) {
				totalNumber += proGameInfoList.size();
			}
			tp = (int) Math.ceil(((float) totalNumber / (float) 10));
			model.addAttribute("tp", tp);
			model.addAttribute("tn", totalNumber);

			break;

		case "knowledge":
			basKnowledgeInfoList = basKnowledgeInfoServiceImpl
					.getBasKnowledgeInfoList(keyWord, page);
			model.addAttribute("basKnowledgeInfoList", basKnowledgeInfoList);

			int kentp = basKnowledgeInfoServiceImpl.totalNumber(keyWord);
			tp = (int) Math.ceil(((float) kentp / (float) 10));
			model.addAttribute("tp", tp);
			model.addAttribute("tn", kentp);
			break;

		case "org":
			//basOrganizeInfoList = basOrganizeInfoServiceImpl
			//		.getBasOrganizeInfoList(keyWord, type, page);
            basOrganizeInfoList = basOrganizeInfoServiceImpl.getBasOrganizeInfoListByKeyWord(keyWord, type, faxing, touzi, page);
			model.addAttribute("basOrganizeInfoList", basOrganizeInfoList);

			//int orgtp = basOrganizeInfoServiceImpl.totalNumber(keyWord, type);
			int orgtp = basOrganizeInfoServiceImpl.totalNumber(keyWord, type, faxing, touzi);
			tp = (int) Math.ceil(((float) orgtp / (float) 10));
			model.addAttribute("tp", tp);
			model.addAttribute("tn", orgtp);
			break;
		case "person":
			// 人物列表

			if (Common.isEmpty(personTag)) {
				basPersonInfoList = basPersonInfoServiceImpl
						.getBasPersonInfoList(keyWord, page);
				model.addAttribute("basPersonInfoList", basPersonInfoList);

				int pertp = basPersonInfoServiceImpl.totalNumber(keyWord);
				tp = (int) Math.ceil(((float) pertp / (float) 10));
				model.addAttribute("tp", tp);
				model.addAttribute("tn", pertp);
				break;
			} else {
				basPersonInfoList = basPersonInfoServiceImpl
						.getBasPersonInfoList(keyWord, personTag, page);
				model.addAttribute("basPersonInfoList", basPersonInfoList);

				int pertp = basPersonInfoServiceImpl.totalNumber(keyWord,
						personTag);
				tp = (int) Math.ceil(((float) pertp / (float) 10));
				model.addAttribute("tp", tp);
				model.addAttribute("tn", pertp);
				break;
			}

		case "game":

			if (Common.isEmpty(type) || "游戏".equals(type)) {
				// 如果用户身份是全部，则userShenfen = "";
				if (Common.isEmpty(userShenfen)) {
					proGameInfoList = proGameInfoServiceImpl
							.getProGameInfoList(keyWord, page);
					model.addAttribute("proGameInfoList", proGameInfoList);

					int gamtp = proGameInfoServiceImpl.totalNumber(keyWord);
					tp = (int) Math.ceil(((float) gamtp / (float) 10));
					model.addAttribute("tp", tp);
					model.addAttribute("tn", gamtp);
					break;
				} else {
					proGameInfoList = proGameInfoServiceImpl
							.getProGameInfoList(keyWord, userShenfen, page);
					model.addAttribute("proGameInfoList", proGameInfoList);

					int gamtp = proGameInfoServiceImpl.totalNumber(keyWord,
							userShenfen);
					tp = (int) Math.ceil(((float) gamtp / (float) 10));
					model.addAttribute("tp", tp);
					model.addAttribute("tn", gamtp);
					break;
				}

			}

			if ("其他".equals(type)) {
				// 如果用户身份是全部，则userShenfen = "";
				if (Common.isEmpty(userShenfen)) {
					proOtherInfoList = proOtherInfoServiceImpl
							.getProGameInfoList(keyWord, page);
					model.addAttribute("proOtherInfoList", proOtherInfoList);
					int othertp = proOtherInfoServiceImpl.totalNumber(keyWord);
					tp = (int) Math.ceil(((float) othertp / (float) 10));
					model.addAttribute("tp", tp);
					model.addAttribute("tn", othertp);
					break;
				} else {
					proOtherInfoList = proOtherInfoServiceImpl
							.getProGameInfoList(keyWord, userShenfen, page);
					model.addAttribute("proOtherInfoList", proOtherInfoList);
					int othertp = proOtherInfoServiceImpl.totalNumber(keyWord,
							userShenfen);
					tp = (int) Math.ceil(((float) othertp / (float) 10));
					model.addAttribute("tp", tp);
					model.addAttribute("tn", othertp);
					break;
				}

			}

		case "event":

			if ("活动事件".equals(type)){
				type = "活动";
			}

			basEventInfoList = basEventInfoServiceImpl.getBasEventInfoList(
					keyWord, type, page);
			model.addAttribute("basEventInfoList", basEventInfoList);

			int eventtp = basEventInfoServiceImpl.totalNumber(keyWord, type);

			tp = (int) Math.ceil(((float) eventtp / (float) 10));
			model.addAttribute("tp", tp);
			model.addAttribute("tn", eventtp);
			break;
		default:
			break;
		}
		return new ModelAndView("list");
	}

}
