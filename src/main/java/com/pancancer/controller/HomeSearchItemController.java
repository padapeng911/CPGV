package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.BrowsePathwayService;
import com.pancancer.service.SearchByGeneInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class HomeSearchItemController {

    @GetMapping("/")
    public String homeSearchForm(Model model) {
        model.addAttribute("homeSearchItem", new HomeSearchItem());
        return "index1";
    }

    @Autowired
    private SearchByGeneInfoService searchByGeneInfoService;

    @Autowired
    private BrowsePathwayService browsePathwayService;
    static String canshu;
    @PostMapping("/HomeSearchItem")
    public String searchSubmit(@ModelAttribute HomeSearchItem homeSearchItem,Model model) {
        int select = Integer.parseInt(homeSearchItem.getItem());
        String names = homeSearchItem.getSelectedval();
            if (select == 1) {
                List<SearchByGeneInfo> searchByGeneInfos =searchByGeneInfoService.searchBySymbol(names);
                model.addAttribute("searchByGeneInfos",searchByGeneInfos);
                return "homesearchbygene";
            } else if (select == 2) {
                return "homesearchbytype";
            } else if (select == 3) {
                List<String> list1 =new ArrayList<String>();
                List<BrowsePathway> browsePathways = browsePathwayService.findGeneByPathway(names);
                model.addAttribute("browsePathways",browsePathways);
                for(BrowsePathway browsePathway : browsePathways){
                    list1.add(browsePathway.getGene());
                }

                String gene = list1.get(0);
                String temp = "";
                String[] genelist = gene.split(",");

                for (Object p:genelist) {
                    temp += "\"" + p + "\",";
                }
                temp = temp.substring(0,temp.length()-1);
                gene = temp;
                canshu = gene;
                return "homesearchbypathway";
            } else {
                List<SearchBySomaticSiteInfo> searchBySomaticSiteInfos =searchByGeneInfoService.searchBySomaticSite(names);
                model.addAttribute("searchBySomaticSiteInfos",searchBySomaticSiteInfos);
                return "homesearchbysite";
            }
    }

    @RequestMapping("/HomeSearchPathwaySomaticTableInfo")
    @ResponseBody
    public List<BrowseSomatic> findByGene(@Param("gene") String gene){
        List<BrowseSomatic> browseSomatics =browsePathwayService.findByGene(canshu);
        return browseSomatics;
    }

    @RequestMapping("/HomeSearchPathwayGermlineTableInfo")
    @ResponseBody
    public List<Browse> findByGene2(@Param("gene") String gene){
        List<Browse> browse =browsePathwayService.findByGene2(canshu);
        return browse;
    }
}

