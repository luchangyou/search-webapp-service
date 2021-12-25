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

import com.yiguan.search.common.util.URLAvailability;
import com.yiguan.search.model.ProGameInfo;
import com.yiguan.search.service.IProGameInfoService;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: ProGameInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:37:06
 * 
 */
@Controller
@RequestMapping(value = "/game")
public class ProGameInfoController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(ProGameInfoController.class);

	@Autowired
	private IProGameInfoService proGameInfoServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String id = request.getParameter("id");

		ProGameInfo proGameInfo = proGameInfoServiceImpl.getProGameInfo(Long
				.parseLong(id));

		List<String> urlList = new ArrayList<String>();
		String picture = proGameInfo.getPicture();
		if (null != picture) {
			String[] pics = picture.split(",");
			for (String url : pics) {
				if (URLAvailability.isConnect(url)) {
					urlList.add(url);
				}
			}
		}
		model.addAttribute("pics", urlList);

		model.addAttribute("proGameInfo", proGameInfo);
		model.addAttribute("channel", "game");
		String keyword = request.getParameter("keyword");
		model.addAttribute("keyword", keyword);

		return new ModelAndView("gsdata-detail");
	}

	@RequestMapping(value = "/createGameExcel")
	public void createGameExcel(HttpServletRequest request,
							   HttpServletResponse response, Model model) {

		String uuid = request.getParameter("uuid");

		logger.info("uuid=" + uuid);

		try {

			//设置默认文件名为当前时间：年月日时分秒
			String fileName=new String("产品信息".getBytes("utf-8"), "ISO8859-1")+new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()).toString();
			//设置response头信息
			response.reset();
			response.setContentType("application/vnd.ms-excel");        //改成输出excel文件
			response.setHeader("Content-disposition","attachment; filename="+fileName+".xls" );
			OutputStream out=response.getOutputStream();
			WritableWorkbook wwb = Workbook.createWorkbook(out);

			logger.info("fileName="+fileName);

			String proGameInfoExcel = proGameInfoServiceImpl.createProGameInfoExcel(uuid, wwb);

			wwb.write();
			wwb.close();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
