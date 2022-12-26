package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.BrowseGermlineGeneService;
import com.pancancer.service.BrowseSomaticGeneService;
import com.pancancer.service.SearchByGeneInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class BrowseGermlineGeneController {

    @Autowired
    private SearchByGeneInfoService searchByGeneInfoService;

    @Autowired
    private BrowseGermlineGeneService browseGermlineGeneService;

    @RequestMapping("/BrowseGermlineGeneNumber")
    @ResponseBody
    public List<String> BrowseGermlineGeneNumber(@Param ("gene") String gene){
        List<String> list1 =new ArrayList<>();

        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList = browseGermlineGeneService.browseGermlineNumberByGene(gene);
        for (BrowseGermlineGeneNumber browseGermlineGeneNumber : BrowseGermlineGeneNumberList){
            list1.add(browseGermlineGeneNumber.getType());
            list1.add(browseGermlineGeneNumber.getNumber());
        }
        return list1;
    }

    @RequestMapping("/BrowseGermlineGeneRatio")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatio(@Param ("gene") String gene){
        List<String> list2 =new ArrayList<>();

        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList = browseGermlineGeneService.browseGermlineRatioByGene(gene);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList){
            list2.add(browseGermlineGeneRatio.getType());
            list2.add(browseGermlineGeneRatio.getRatio());
        }
        return list2;
    }

    @RequestMapping("/BrowseGermlineGeneCom")
    @ResponseBody
    public List<String> BrowseGermlineGeneCom(@Param ("gene") String gene){
        List<String> list7 =new ArrayList<>();

        List<BrowseGermlineGeneCom> BrowseGermlineGeneComList = browseGermlineGeneService.browseGermlineComByGene(gene);
        for (BrowseGermlineGeneCom browseGermlineGeneCom : BrowseGermlineGeneComList){
            list7.add(browseGermlineGeneCom.getAgew());
            list7.add(browseGermlineGeneCom.getAgem());
            list7.add(browseGermlineGeneCom.getGenderf());
            list7.add(browseGermlineGeneCom.getGenderm());
            list7.add(browseGermlineGeneCom.getCcfw());
            list7.add(browseGermlineGeneCom.getCcfm());
            list7.add(browseGermlineGeneCom.getTmbw());
            list7.add(browseGermlineGeneCom.getTmbm());
        }
        return list7;
    }

    @RequestMapping("/BrowseGermlineGeneRatio2")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatio2(@Param ("gene") String gene){
        List<String> list3 =new ArrayList<>();

        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList2 = browseGermlineGeneService.browseGermlineRatioByGene2(gene);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList2){
            list3.add(browseGermlineGeneRatio.getLog2odds0());
            list3.add(browseGermlineGeneRatio.getLog10fdr0());
            list3.add(browseGermlineGeneRatio.getType());
            list3.add(browseGermlineGeneRatio.getFdr());

        }
        return list3;
    }

    @RequestMapping("/BrowseGermlineGeneRatioVsTcga")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatioVsTcga(@Param ("gene") String gene){
        List<String> list4 =new ArrayList<>();

        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList = browseGermlineGeneService.browseGermlineRatioByGeneVsTcga(gene);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList){
            list4.add(browseGermlineGeneRatioVsTcga.getLog2odds0());
            list4.add(browseGermlineGeneRatioVsTcga.getLog10fdr0());
            list4.add(browseGermlineGeneRatioVsTcga.getType());
            list4.add(browseGermlineGeneRatioVsTcga.getFdr());
        }
        return list4;
    }

    @RequestMapping("/BrowseGermlineGeneRatioVsTcga2")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatioVsTcga2(@Param ("gene") String gene){
        List<String> list6 =new ArrayList<>();

        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList2 = browseGermlineGeneService.browseGermlineRatioByGeneVsTcga2(gene);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList2){
            list6.add(browseGermlineGeneRatioVsTcga.getGenecastratio());
            list6.add(browseGermlineGeneRatioVsTcga.getTcgaratio());
            list6.add(browseGermlineGeneRatioVsTcga.getType());
            list6.add(browseGermlineGeneRatioVsTcga.getFdr());
        }
        return list6;
    }

    @RequestMapping("/BrowseGermlineGeneRatioVsCaspmi")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatioVsCaspmi(@Param ("gene") String gene){
        List<String> list5 =new ArrayList<>();

        List<BrowseGermlineGeneRatioVsCaspmi> BrowseGermlineGeneRatioVsCaspmiList = browseGermlineGeneService.browseGermlineRatioByGeneVsCaspmi(gene);
        for (BrowseGermlineGeneRatioVsCaspmi browseGermlineGeneRatioVsCaspmi : BrowseGermlineGeneRatioVsCaspmiList){
            list5.add(browseGermlineGeneRatioVsCaspmi.getMafInGenecast());
            list5.add(browseGermlineGeneRatioVsCaspmi.getMafInCaspmi());
            list5.add(browseGermlineGeneRatioVsCaspmi.getAachange());
            list5.add(browseGermlineGeneRatioVsCaspmi.getGene());
        }
        return list5;
    }

    @RequestMapping("/BrowseGermlineGene")
    public String resultByGene(@Param("gene")String gene, Model model){
        List<SearchByGeneInfo> searchByGeneInfos =searchByGeneInfoService.searchBySymbol(gene);
        model.addAttribute("searchByGeneInfos",searchByGeneInfos);
        return "browseGermlineGene";
    }




}
