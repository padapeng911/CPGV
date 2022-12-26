package com.pancancer.controller;


import com.pancancer.dao.BrowsePathwayGeneInfoDAO;
import com.pancancer.entity.*;
import com.pancancer.service.BrowsePathwayService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class BrowsePathwayGeneInfoController {

    @Resource
    private BrowsePathwayGeneInfoDAO browsePathwayGeneInfoDao;

    //后端分页

    @RequestMapping("/BrowsePathwaySomaticTable")
    @ResponseBody
    public ReturnData<BrowsePathwayGeneInfo> getAll(BrowsePathwayGeneInfo browsePathwayGeneInfo){
        ReturnData<BrowsePathwayGeneInfo> browsePathwayGeneInfoData = new ReturnData<BrowsePathwayGeneInfo>();
        //得到总页数
        int totle = browsePathwayGeneInfoDao.getTatlo();
        browsePathwayGeneInfoData.setTotal(totle);
        //得到user数据对象
        List<BrowsePathwayGeneInfo> plist = browsePathwayGeneInfoDao.getAll(browsePathwayGeneInfo);
        browsePathwayGeneInfoData.setRows(plist);
        return  browsePathwayGeneInfoData;
    }

}
