package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.BrowseSomaticGeneService;
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
public class BrowseSomaticGeneController {

    @Autowired
    private SearchByGeneInfoService searchByGeneInfoService;

    @Autowired
    private BrowseSomaticGeneService browseSomaticGeneService;

    @RequestMapping("/BrowseSomaticGeneNumber")
    @ResponseBody
    public List<String> BrowseSomaticGeneNumber(@Param ("gene") String gene){
        List<String> list1 =new ArrayList<>();

        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList = browseSomaticGeneService.browseSomaticNumberByGene(gene);
        for (BrowseSomaticGeneNumber browseSomaticGeneNumber : BrowseSomaticGeneNumberList){
            list1.add(browseSomaticGeneNumber.getType());
            list1.add(browseSomaticGeneNumber.getNumber());
        }
        return list1;
    }

    @RequestMapping("/BrowseSomaticGeneRatio")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatio(@Param ("gene") String gene){
        List<String> list2 =new ArrayList<>();

        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList = browseSomaticGeneService.browseSomaticRatioByGene(gene);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList){
            list2.add(browseSomaticGeneRatio.getType());
            list2.add(browseSomaticGeneRatio.getRatio());
        }
        return list2;
    }

    @RequestMapping("/BrowseSomaticGeneCom")
    @ResponseBody
    public List<String> BrowseSomaticGeneCom(@Param ("gene") String gene){
        List<String> list8 =new ArrayList<>();

        List<BrowseSomaticGeneCom> BrowseSomaticGeneComList = browseSomaticGeneService.browseSomaticComByGene(gene);
        for (BrowseSomaticGeneCom browseSomaticGeneCom : BrowseSomaticGeneComList){
            list8.add(browseSomaticGeneCom.getAgew());
            list8.add(browseSomaticGeneCom.getAgem());
            list8.add(browseSomaticGeneCom.getGenderf());
            list8.add(browseSomaticGeneCom.getGenderm());
            list8.add(browseSomaticGeneCom.getCcfw());
            list8.add(browseSomaticGeneCom.getCcfm());
            list8.add(browseSomaticGeneCom.getTmbw());
            list8.add(browseSomaticGeneCom.getTmbm());
        }
        return list8;
    }

    @RequestMapping("/BrowseSomaticGeneRatio2")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatio2(@Param ("gene") String gene){
        List<String> list3 =new ArrayList<>();

        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList2 = browseSomaticGeneService.browseSomaticRatioByGene2(gene);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList2){
            list3.add(browseSomaticGeneRatio.getLog2odds0());
            list3.add(browseSomaticGeneRatio.getLog10fdr0());
            list3.add(browseSomaticGeneRatio.getType());
            list3.add(browseSomaticGeneRatio.getFdr());

        }
        return list3;
    }

    @RequestMapping("/BrowseSomaticGeneRatioVsTcga")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioVsTcga(@Param ("gene") String gene){
        List<String> list4 =new ArrayList<>();

        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList = browseSomaticGeneService.browseSomaticRatioByGeneVsTcga(gene);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList){
            list4.add(browseSomaticGeneRatioVsTcga.getLog2odds0());
            list4.add(browseSomaticGeneRatioVsTcga.getLog10fdr0());
            list4.add(browseSomaticGeneRatioVsTcga.getType());
            list4.add(browseSomaticGeneRatioVsTcga.getFdr());
        }
        return list4;
    }

    @RequestMapping("/BrowseSomaticGeneRatioVsTcga2")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioVsTcga2(@Param ("gene") String gene){
        List<String> list5 =new ArrayList<>();

        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList2 = browseSomaticGeneService.browseSomaticRatioByGeneVsTcga2(gene);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList2){
            list5.add(browseSomaticGeneRatioVsTcga.getGenecastratio());
            list5.add(browseSomaticGeneRatioVsTcga.getTcgaratio());
            list5.add(browseSomaticGeneRatioVsTcga.getType());
            list5.add(browseSomaticGeneRatioVsTcga.getFdr());
        }
        return list5;
    }

     @RequestMapping("/BrowseSomaticGeneRatioVsGermline")
     @ResponseBody
    public List<String> BrowseSomaticGeneRatioVsGermline(@Param ("gene") String gene){
        List<String> list6 =new ArrayList<>();

        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList = browseSomaticGeneService.browseSomaticRatioByGeneVsGermline(gene);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList){
            list6.add(browseSomaticGeneRatioVsGermline.getSomatic());
            list6.add(browseSomaticGeneRatioVsGermline.getGermline());
            list6.add(browseSomaticGeneRatioVsGermline.getType());
            list6.add(browseSomaticGeneRatioVsGermline.getFdr());
        }
        return list6;
    }

    @RequestMapping("/BrowseSomaticGeneRatioVsGermline2")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioVsGermline2(@Param ("gene") String gene){
        List<String> list7 =new ArrayList<>();

        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList2 = browseSomaticGeneService.browseSomaticRatioByGeneVsGermline2(gene);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList2){
            list7.add(browseSomaticGeneRatioVsGermline.getLog2odds0());
            list7.add(browseSomaticGeneRatioVsGermline.getLog10fdr0());
            list7.add(browseSomaticGeneRatioVsGermline.getType());
            list7.add(browseSomaticGeneRatioVsGermline.getFdr());
        }
        return list7;
    }

    @RequestMapping("/BrowseSomaticGene")
    public String resultByGene(@Param("gene")String gene, Model model){
        List<SearchByGeneInfo> searchByGeneInfos =searchByGeneInfoService.searchBySymbol(gene);
        model.addAttribute("searchByGeneInfos",searchByGeneInfos);
        return "browseSomaticGene";
    }

}
