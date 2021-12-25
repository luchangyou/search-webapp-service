/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasEventInfoController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午9:54:36 
 * @version V1.0   
 */
package com.yiguan.search.controller;

import com.yiguan.search.model.*;
import com.yiguan.search.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: BasEventInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午9:54:36
 * 
 */
@Controller
@RequestMapping(value = "/event")
public class BasEventInfoController extends BaseController {

	@Autowired
	private IBasEventInfoService basEventInfoServiceImpl;
	@Autowired
	private IEventInvestfinaceService eventInvestfinaceServiceImpl;
	@Autowired
	private IEventMergerService eventMergerServiceImpl;
	@Autowired
	private IEventRecruitService eventRecruitServiceImpl;
	@Autowired
	private IEventLawService eventLawServiceImpl;
    @Autowired
    private IEventActivityService eventActivityServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView detail(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String id = request.getParameter("id");
		String keyword = request.getParameter("keyword");

		BasEventInfo basEventInfo = basEventInfoServiceImpl
				.getBasEventInfo(Integer.parseInt(id));

		String euuid = null;
		String type = null;
		if (basEventInfo != null) {
			euuid = basEventInfo.getEuuid();
			type = basEventInfo.getType();
		}

		EventInvestfinace eventInvestfinace = null;
		EventRecruit eventRecruit = null;
		EventMerger eventMerger = null;
		EventLaw eventLaw = null;
        EventActivity eventActivity = null;
		if ("投融资事件".equals(type)) {
			eventInvestfinace = eventInvestfinaceServiceImpl
					.getEventInvestfinaceByEuuid(euuid);
		} else if ("招聘事件".equals(type)) {
			eventRecruit = eventRecruitServiceImpl
					.getEventRecruitByEuuid(euuid);
		} else if ("并购事件".equals(type)) {
			eventMerger = eventMergerServiceImpl.getEventMergerByEuuid(euuid);
		} else if ("法律事件".equals(type)) {
			eventLaw = eventLawServiceImpl.getEventLawByEuuid(euuid);
		} else if ("活动".equals(type)) {
            eventActivity = eventActivityServiceImpl.getEventActivityByEuuid(euuid);
		}

		model.addAttribute("basEventInfo", basEventInfo);
		model.addAttribute("eventInvestfinace", eventInvestfinace);
		model.addAttribute("eventRecruit", eventRecruit);
		model.addAttribute("eventMerger", eventMerger);
		model.addAttribute("eventLaw", eventLaw);
		model.addAttribute("eventActivity", eventActivity);
		model.addAttribute("channel", "event");
		model.addAttribute("keyword", keyword);

		return new ModelAndView("event-detail");
	}

	@RequestMapping(value = "/investfinaceDetail")
	public ModelAndView investfinaceDetail(HttpServletRequest request,
							  HttpServletResponse response, Model model) {

		String euuid = request.getParameter("euuid");
		String keyword = request.getParameter("keyword");
		BasEventInfo basEventInfo = basEventInfoServiceImpl.getBasEventInfoListByEuuid(euuid);
		EventInvestfinace eventInvestfinace = eventInvestfinaceServiceImpl
				.getEventInvestfinaceByEuuid(euuid);

		model.addAttribute("basEventInfo", basEventInfo);
		model.addAttribute("eventInvestfinace", eventInvestfinace);
		model.addAttribute("keyword", keyword);
		model.addAttribute("channel", "event");

		return new ModelAndView("event-detail");
	}
}
