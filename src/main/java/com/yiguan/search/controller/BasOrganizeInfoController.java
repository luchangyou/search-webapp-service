/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasOrganizeInfoController.java
 * @Package com.yiguan.search.controller
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:35:56 
 * @version V1.0   
 */
package com.yiguan.search.controller;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.domain.ComShareholderVo;
import com.yiguan.search.model.*;
import com.yiguan.search.po.OrgEventPo;
import com.yiguan.search.service.*;
import jxl.Workbook;
import jxl.write.WritableWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: BasOrganizeInfoController
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月29日 上午10:35:56
 * 
 */
@Controller
@RequestMapping(value = "/organize")
public class BasOrganizeInfoController extends BaseController {
	private static final Logger logger = LoggerFactory
			.getLogger(BasOrganizeInfoController.class);

	@Autowired
	private IBasBusinessInfoService basBusinessInfoServiceImpl;
	@Autowired
	private IComShareholderTeamService comShareholderTeamServiceImpl;
	@Autowired
	private IComShareholderService comShareholderServiceImpl;
	@Autowired
	private IComExecutiveInfoService comExecutiveInfoServiceImpl;
	@Autowired
	private IComChangeInfoService comChangeInfoServiceImpl;
	@Autowired
	private IBasOrganizeInfoService basOrganizeInfoServiceImpl;
	@Autowired
	private IProGameInfoService proGameInfoServiceImpl;
	@Autowired
	private IBasEventInfoService basEventInfoServiceImpl;
	@Autowired
	private IOrgKnowledgeService orgKnowledgeServiceImpl;
	@Autowired
	private IOrgOrganizeService orgOrganizeServiceImpl;
	@Autowired
	private IPerOrganizeService perOrganizeServiceImpl;
	@Autowired
	private IComWechatService comWechatServiceImpl;
	@Autowired
	private IComIcpService comIcpServiceImpl;
	@Autowired
	private IComSoftwarecopyrightService comSoftwarecopyrightServiceImpl;
	@Autowired
	private IOrgProductService orgProductServiceImpl;
	@Autowired
	private IComCopyrightworkService comCopyrightworkServiceImpl;
	@Autowired
	private IComTminfoService comTminfoServiceImpl;
	@Autowired
	private IComPatentService comPatentServiceImpl;
	@Autowired
	private IComInvestmentInfoService comInvestmentInfoServiceImpl;
	@Autowired
	private IComAbnormaloperationService comAbnormaloperationServiceImpl;
	@Autowired
	private IComEquitypledgedpagenumService comEquitypledgedpagenumServiceImpl;
    @Autowired
    private IInvestcomInfoService investcomInfoServiceImpl;
    @Autowired
    private IOrgEventService orgEventServiceImpl;

	@RequestMapping(value = "/detail")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		String uuid = request.getParameter("uuid");
		String keyword = request.getParameter("keyword");
		String oname = null;
		// 获取组织详情
		BasOrganizeInfo basOrganizeInfo = null;
		List<BasOrganizeInfo> basOrganizeInfoList = basOrganizeInfoServiceImpl
				.getListByUuid(uuid);
		if (basOrganizeInfoList != null && basOrganizeInfoList.size() > 0) {
			basOrganizeInfo = basOrganizeInfoList.get(0);
			oname = basOrganizeInfo.getOname();
		}
        InvestcomInfo investcomInfo = null;
        if (basOrganizeInfo != null && !Common.isEmpty(basOrganizeInfo.getTag())){
            if(basOrganizeInfo.getTag().indexOf("泛娱乐投资公司")!=-1){
                investcomInfo = investcomInfoServiceImpl.getInvestcomInfo(uuid);
            }
        }
        model.addAttribute("investcomInfo", investcomInfo);

		// 工商信息组织详情
		BasBusinessInfo basBusinessInfo = null;
		List<BasBusinessInfo> busBuessInfoList = basBusinessInfoServiceImpl
				.getListByUuid(uuid);
		if (busBuessInfoList != null && busBuessInfoList.size() > 0) {
			basBusinessInfo = busBuessInfoList.get(0);
		}

		// 获取公司股东信息
		List<ComShareholderVo> comShareholderVoList = comShareholderServiceImpl.getComShareholderVoListByUuid(uuid);

		// 获取公司高管信息
		List<ComExecutiveInfo> comExecutiveInfoList = comExecutiveInfoServiceImpl
				.getListByUuid(uuid);
		// 获取变更记录信息
		List<ComChangeInfo> comChangeInfoList = comChangeInfoServiceImpl
				.getListByUuid(uuid);

		// 获取产品信息
		// List<ProGameInfo> proGameInfoList = proGameInfoServiceImpl
		// .getProGameInfoListByDevelopCom(oname);
		List<OrgProduct> orgProductList = orgProductServiceImpl
				.getOrgProductList(uuid);

		model.addAttribute("basOrganizeInfo", basOrganizeInfo);
		model.addAttribute("basBusinessInfo", basBusinessInfo);
		model.addAttribute("comShareholderVoLlist", comShareholderVoList);
		model.addAttribute("comExecutiveInfoList", comExecutiveInfoList);
		model.addAttribute("comChangeInfoList", comChangeInfoList);
		// model.addAttribute("proGameInfoList", proGameInfoList);
		model.addAttribute("orgProductList", orgProductList);
		model.addAttribute("channel", "org");
		model.addAttribute("keyword", keyword);
		// 组织事件
		List<BasEventInfo> basEventInfoList = basEventInfoServiceImpl
				.getBasEventInfoListByOuuid(uuid);
		List<BasEventInfo> eventRecruitList = new ArrayList<BasEventInfo>();
		//List<BasEventInfo> eventInvestfinaceList = new ArrayList<BasEventInfo>();
		List<BasEventInfo> eventMergerList = new ArrayList<BasEventInfo>();
		List<BasEventInfo> eventLawList = new ArrayList<BasEventInfo>();
		if (basEventInfoList != null && !basEventInfoList.isEmpty()) {
			for (BasEventInfo basEventInfo : basEventInfoList) {
				if ("招聘事件".equals(basEventInfo.getType())) {
					eventRecruitList.add(basEventInfo);
				} /*else if ("投融资事件".equals(basEventInfo.getType())) {
					eventInvestfinaceList.add(basEventInfo);
				}*/ else if ("并购事件".equals(basEventInfo.getType())) {
					eventMergerList.add(basEventInfo);
				} else if ("法律事件".equals(basEventInfo.getType())) {
					eventLawList.add(basEventInfo);
				}
			}
		}

		//投融资事件
        List<OrgEventPo> orgEventList = orgEventServiceImpl.getOrgEventPoList(uuid);
        model.addAttribute("orgEventList", orgEventList);

        model.addAttribute("eventRecruitList", eventRecruitList);
		//model.addAttribute("eventInvestfinaceList", eventInvestfinaceList);
		model.addAttribute("eventMergerList", eventMergerList);
		model.addAttribute("eventLawList", eventLawList);

		// 组织知识
		List<OrgKnowledge> orgKnowledgeList = orgKnowledgeServiceImpl
				.getListByOUuid(uuid);
		// 关联组织
		List<OrgOrganize> orgOrganizeList = orgOrganizeServiceImpl
				.getListByROUuid(uuid);
		model.addAttribute("orgKnowledgeList", orgKnowledgeList);
		model.addAttribute("orgOrganizeList", orgOrganizeList);

		// 关联人
		List<PerOrganize> perOrganizeList = perOrganizeServiceImpl
				.getPerOrganizeListByOuuid(uuid);
		model.addAttribute("perOrganizeList", perOrganizeList);

		// 公众号信息
		List<ComWechat> comWechatList = comWechatServiceImpl
				.getComWechatList(uuid);
		model.addAttribute("comWechatList", comWechatList);

		// icp信息
		List<ComIcp> comIcpList = comIcpServiceImpl.getComIcpList(uuid);
		model.addAttribute("comIcpList", comIcpList);

		// 著作权
		List<ComSoftwarecopyright> comSoftwarecopyrightList = comSoftwarecopyrightServiceImpl
				.getComSoftwarecopyrightList(uuid);
		model.addAttribute("comSoftwarecopyrightList", comSoftwarecopyrightList);

		// 商标
		List<ComTminfo> comTminfoList = comTminfoServiceImpl
				.getComTminfoList(uuid);
		model.addAttribute("comTminfoList", comTminfoList);

		// 作品著作权
		List<ComCopyrightwork> comCopyrightworkList = comCopyrightworkServiceImpl
				.getComCopyrightworkList(uuid);
		model.addAttribute("comCopyrightworkList", comCopyrightworkList);

		// 专利信息
		List<ComPatent> comPatentList = comPatentServiceImpl
				.getComPatentList(uuid);
		model.addAttribute("comPatentList", comPatentList);

		// 对外投资
		List<ComInvestmentInfo> comInvestmentInfoList = comInvestmentInfoServiceImpl
				.getComInvestmentInfoListByUuid(uuid);
		model.addAttribute("comInvestmentInfoList", comInvestmentInfoList);

		//经营异常
		List<ComAbnormaloperation> comAbnormaloperationList = comAbnormaloperationServiceImpl.getComAbnormaloperationList(uuid);
		model.addAttribute("comAbnormaloperationList", comAbnormaloperationList);

		//股权出质
		List<ComEquitypledgedpagenum> comEquitypledgedpagenumList = comEquitypledgedpagenumServiceImpl.getComEquitypledgedpagenumList(uuid);
		model.addAttribute("comEquitypledgedpagenumList", comEquitypledgedpagenumList);

		return new ModelAndView("org-detail");
	}

	/**
	 * 导出数据
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "/createOrgExcel")
    @ResponseBody
	public void createOrgExcel(HttpServletRequest request,
							  HttpServletResponse response, Model model) {

		String uuid = request.getParameter("uuid");

		logger.info("uuid="+uuid);

        try {

            //设置默认文件名为当前时间：年月日时分秒
            String fileName=new String("组织信息".getBytes("utf-8"), "ISO8859-1")+new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()).toString();
            //设置response头信息
            response.reset();
            response.setContentType("application/vnd.ms-excel");        //改成输出excel文件
            response.setHeader("Content-disposition","attachment; filename="+fileName+".xls" );
            OutputStream out=response.getOutputStream();
            WritableWorkbook wwb = Workbook.createWorkbook(out);

			logger.info("fileName="+fileName);
            //导出公司基本信息
			String orgExcel = basOrganizeInfoServiceImpl.createOrgExcel(uuid, wwb);
			//导出工商基本信息
			String businessExcel = basBusinessInfoServiceImpl.createBusinessExcel(uuid, wwb);
			//股东信息
			String shareholderExcel = comShareholderServiceImpl.createShareholderExcel(uuid, wwb);
			// 获取公司高管信息
			String executiveInfoExcel = comExecutiveInfoServiceImpl.createExecutiveInfoExcel(uuid, wwb);
			// 获取变更记录信息
			String changeInfoExcel = comChangeInfoServiceImpl.createChangeInfoExcel(uuid, wwb);
			// 获取产品信息
			String orgProductExcel = orgProductServiceImpl.createOrgProductExcel(uuid, wwb);
			// 公司事件信息
			String eventInfoExcel = basEventInfoServiceImpl.createEventInfoExcel(uuid, wwb);
			// 组织知识
			String orgKnowledgeExcel = orgKnowledgeServiceImpl.createOrgKnowledgeExcel(uuid, wwb);
			// 关联组织
			String orgOrganizeExcel = orgOrganizeServiceImpl.createOrgOrganizeExcel(uuid, wwb);
			// 关联人
			String perOrganizeExcel = perOrganizeServiceImpl.createPerOrganizeExcel(uuid, wwb);
			// 公众号信息
			String comWechatExcel = comWechatServiceImpl.createExcel(uuid, wwb);
			// icp信息
			String comIcpExcel = comIcpServiceImpl.createExcel(uuid, wwb);
			// 著作权
			String comSoftwarecopyrightExcel = comSoftwarecopyrightServiceImpl.createExcel(uuid, wwb);
			// 商标
			String comTminfoExcel = comTminfoServiceImpl.createExcel(uuid, wwb);
			// 作品著作权
			String comCopyrightworkExcel = comCopyrightworkServiceImpl.createExcel(uuid, wwb);
			// 专利信息
			String comPatentExcel  = comPatentServiceImpl.createExcel(uuid, wwb);
			// 对外投资
			String comInvestmentExcel  = comInvestmentInfoServiceImpl.createExcel(uuid, wwb);
			//经营异常
			String comAbnormaloperationExcel = comAbnormaloperationServiceImpl.createExcel(uuid, wwb);
			//股权出质
			String comEquitypledgedpagenumExcel  = comEquitypledgedpagenumServiceImpl.createExcel(uuid, wwb);

			wwb.write();
			wwb.close();
			out.close();

		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
