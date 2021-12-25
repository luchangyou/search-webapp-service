package com.yiguan.search.controller;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasOrganizeInfo;
import com.yiguan.search.model.OrgOrganize;
import com.yiguan.search.service.IBasOrganizeInfoService;
import com.yiguan.search.service.IOrgOrganizeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/21.
 */
@Controller
@RequestMapping("/tupu")
public class TupuController extends BaseController {
    private static final Logger logger = LoggerFactory
            .getLogger(TupuController.class);

    @Autowired
    private IOrgOrganizeService orgOrganizeServiceImpl;
    @Autowired
    private IBasOrganizeInfoService basOrganizeInfoServiceImpl;

    @RequestMapping("/tupuPage")
    public ModelAndView tupuPage(HttpServletRequest request,
                                 HttpServletResponse response, Model model){

        String uuid = request.getParameter("uuid");
        logger.info("uuid=="+uuid);

        List<BasOrganizeInfo> basOrganizeInfos = basOrganizeInfoServiceImpl.getListByUuid(uuid);
        if(basOrganizeInfos != null && basOrganizeInfos.size() >0){
            model.addAttribute("orgName",basOrganizeInfos.get(0).getOname());
            model.addAttribute("uuid",uuid);
            model.addAttribute("logo",basOrganizeInfos.get(0).getLogo());
        }



        return new ModelAndView("tupu");
    }


    @RequestMapping(value = "/gudongList", method = { RequestMethod.GET,
            RequestMethod.POST })
    @ResponseBody
    public List<OrgOrganize> getGudongList(HttpServletRequest request,
           HttpServletResponse response, Model model, @RequestBody Map<String, String> map){

        String uuid = map.get("uuid");
        logger.info("uuid=="+uuid);
        String pg = map.get("pg");
        pg = pg == null ? "1" : pg;
        Page<OrgOrganize> page = new Page<>();
        page.setLimit(10);
        page.setOffset((Integer.parseInt(pg) - 1) * 10);


        List<OrgOrganize> orgOrganizeList = orgOrganizeServiceImpl.getOrgOrganizeListByRouuidAndRtype(uuid,"股东", page);

        return orgOrganizeList;
    }

    @RequestMapping("touziList")
    @ResponseBody
    public Map<String, Object> getTouziList(HttpServletRequest request, HttpServletResponse response, Model model){

        String uuid = request.getParameter("uuid");
        logger.info("uuid=="+uuid);
        Page<OrgOrganize> page = new Page<>();
        List<OrgOrganize> orgOrganizeList = orgOrganizeServiceImpl.getOrgOrganizeListByRouuidAndRtype(uuid,"被投资", page);

        return null;
    }


}
