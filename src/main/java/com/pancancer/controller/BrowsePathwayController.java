package com.pancancer.controller;


import com.pancancer.entity.*;
import com.pancancer.service.BrowsePathwayService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class BrowsePathwayController {

    @Autowired
    private BrowsePathwayService browsePathwayService;
    static String canshu;
     @RequestMapping("//BrowsePathway")
     public String findGeneByPathway(@Param("pathway")String pathway, Model model){
         List<String> list1 =new ArrayList<String>();
         List<BrowsePathway> browsePathways = browsePathwayService.findGeneByPathway(pathway);

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
         return "browsePathway";
     }

    @RequestMapping("/BrowsePathwaySomaticTableInfo")
    @ResponseBody
    public List<BrowseSomatic> findByGene(@Param("gene") String gene){
        List<BrowseSomatic> browseSomatics =browsePathwayService.findByGene(canshu);
        return browseSomatics;
    }

    @RequestMapping("/BrowsePathwayGermlineTableInfo")
    @ResponseBody
    public List<Browse> findByGene2(@Param("gene") String gene){
        List<Browse> browse =browsePathwayService.findByGene2(canshu);
        return browse;
    }

}
