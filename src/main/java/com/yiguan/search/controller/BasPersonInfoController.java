/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasPersonInfoController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:36:20 
 * @version V1.0   
 */
package com.yiguan.search.controller;

import com.yiguan.search.model.*;
import com.yiguan.search.service.*;
import jxl.Workbook;
import jxl.write.WritableWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: BasPersonInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:36:20
 * 
 */
@Controller
@RequestMapping(value = "/person")
public class BasPersonInfoController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(BasPersonInfoController.class);

	@Autowired
	private IBasPersonInfoService basPersonInfoServiceImpl;
	@Autowired
	private IPerEducationInfoService perEducationInfoServiceImpl;
	@Autowired
	private IPerWorkInfoService perWorkInfoServiceImpl;
	@Autowired
	private IPerKnowledgeService perKnowledgeServiceImpl;
	@Autowired
	private IPerOrganizeService perOrganizeServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView detail(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String id = request.getParameter("id");
		String keyword = request.getParameter("keyword");
		// 人物信息
		BasPersonInfo basPersonInfo = basPersonInfoServiceImpl
				.getBasPersonInfo(Long.parseLong(id));

		// 学习信息
		List<PerEducationInfo> perEducationInfoList = null;
		// 知识
		List<PerKnowledge> perKnowledgeList = null;
		// 工作
		List<PerWorkInfo> perWorkInfoList = null;
		// 组织
		List<PerOrganize> perOrganizeList = null;
		if (basPersonInfo != null) {
			String uuid = basPersonInfo.getUuid();
			// 学习信息
			perEducationInfoList = perEducationInfoServiceImpl
					.getPerEducationInfoList(uuid);
			// 工作
			perWorkInfoList = perWorkInfoServiceImpl.getPerWorkInfoList(uuid);

			// 知识
			perKnowledgeList = perKnowledgeServiceImpl.getListByPuuid(uuid);

			// 组织
			perOrganizeList = perOrganizeServiceImpl
					.getPerOrganizeListByPuuid(uuid);
		}

		PerEducationInfo perEducationInfo = null;
		if (perEducationInfoList != null) {
			perEducationInfo = perEducationInfoList.get(0);
		}
		PerWorkInfo perWorkInfo = null;
		if (perWorkInfoList != null) {
			perWorkInfo = perWorkInfoList.get(0);
		}

		model.addAttribute("basPersonInfo", basPersonInfo);
		model.addAttribute("perEducationInfo", perEducationInfo);
		model.addAttribute("perEducationInfoList", perEducationInfoList);
		model.addAttribute("perWorkInfo", perWorkInfo);
		model.addAttribute("perWorkInfoList", perWorkInfoList);
		model.addAttribute("perKnowledgeList", perKnowledgeList);
		model.addAttribute("perOrganizeList", perOrganizeList);
		model.addAttribute("channel", "person");
		model.addAttribute("keyword", keyword);

		return new ModelAndView("person-detail");
	}

	@RequestMapping(value = "/detailByUuid")
	public ModelAndView detailByUuid(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String uuid = request.getParameter("uuid");
		String keyword = request.getParameter("keyword");
		// 人物信息
		BasPersonInfo basPersonInfo = basPersonInfoServiceImpl
				.getBasPersonInfoByUuid(uuid);

		// 学习信息
		List<PerEducationInfo> perEducationInfoList = null;
		// 知识
		List<PerKnowledge> perKnowledgeList = null;
		// 工作
		List<PerWorkInfo> perWorkInfoList = null;
		// 组织
		List<PerOrganize> perOrganizeList = null;
		if (basPersonInfo != null) {
			// 学习信息
			perEducationInfoList = perEducationInfoServiceImpl
					.getPerEducationInfoList(uuid);
			// 工作
			perWorkInfoList = perWorkInfoServiceImpl.getPerWorkInfoList(uuid);

			// 知识
			perKnowledgeList = perKnowledgeServiceImpl.getListByPuuid(uuid);

			// 组织
			perOrganizeList = perOrganizeServiceImpl
					.getPerOrganizeListByPuuid(uuid);
		}

		PerEducationInfo perEducationInfo = null;
		if (perEducationInfoList != null) {
			perEducationInfo = perEducationInfoList.get(0);
		}
		PerWorkInfo perWorkInfo = null;
		if (perWorkInfoList != null) {
			perWorkInfo = perWorkInfoList.get(0);
		}

		model.addAttribute("basPersonInfo", basPersonInfo);
		model.addAttribute("perEducationInfo", perEducationInfo);
		model.addAttribute("perEducationInfoList", perEducationInfoList);
		model.addAttribute("perWorkInfo", perWorkInfo);
		model.addAttribute("perWorkInfoList", perWorkInfoList);
		model.addAttribute("perKnowledgeList", perKnowledgeList);
		model.addAttribute("perOrganizeList", perOrganizeList);
		model.addAttribute("channel", "person");
		model.addAttribute("keyword", keyword);

		return new ModelAndView("person-detail");
	}

	@RequestMapping(value = "/createPerExcel")
	public void createPerExcel(HttpServletRequest request,
							   HttpServletResponse response, Model model) {

		String uuid = request.getParameter("uuid");

		logger.info("uuid="+uuid);

		try {

			//设置默认文件名为当前时间：年月日时分秒
			String fileName=new String("人物信息".getBytes("utf-8"), "ISO8859-1")+new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()).toString();
			//设置response头信息
			response.reset();
			response.setContentType("application/vnd.ms-excel");        //改成输出excel文件
			response.setHeader("Content-disposition","attachment; filename="+fileName+".xls" );
			OutputStream out=response.getOutputStream();
			WritableWorkbook wwb = Workbook.createWorkbook(out);

			logger.info("fileName="+fileName);

			//人物信息
			String basPersonInfoExcel = basPersonInfoServiceImpl.createBasPersonInfoExcel(uuid, wwb);
			// 学习信息
			String perEducationInfoExcel = perEducationInfoServiceImpl.createPerEducationInfoExcel(uuid, wwb);
			// 知识信息
			String perKnowledgeExcel = perKnowledgeServiceImpl.createPerKnowledgeExcel(uuid, wwb);
			// 工作
			String perWorkInfoExcel = perWorkInfoServiceImpl.createPerWorkInfoExcel(uuid, wwb);
			// 组织
			String perOrganizeExcel = perOrganizeServiceImpl.createPerOrganizeExcelByPuuid(uuid, wwb);


			wwb.write();
			wwb.close();
			out.close();

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
