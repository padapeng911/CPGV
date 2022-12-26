package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.BrowseSomaticGeneService;
import com.pancancer.service.BrowseTypeService;
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
public class BrowseTypeController {

    @Autowired
    private BrowseTypeService browseTypeService;

    @RequestMapping("/BrowseSomaticGeneNumberByType")
    @ResponseBody
    public List<String> BrowseSomaticGeneNumberByType(@Param ("type") String type){
        List<String> list1 =new ArrayList<>();
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList = browseTypeService.browseSomaticNumberByType(type);
        for (BrowseSomaticGeneNumber browseSomaticGeneNumber : BrowseSomaticGeneNumberList){
            list1.add(browseSomaticGeneNumber.getGene());
            list1.add(browseSomaticGeneNumber.getNumber());
        }
        return list1;
    }

    @RequestMapping("/BrowseSomaticGeneRatioByType")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioByType(@Param ("type") String type){
        List<String> list2 =new ArrayList<>();
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList = browseTypeService.browseSomaticRatioByType(type);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList){
            list2.add(browseSomaticGeneRatio.getGene());
            list2.add(browseSomaticGeneRatio.getRatio());
        }
        return list2;
    }

    @RequestMapping("/BrowseSomaticGeneRatioByType2")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioByType2(@Param ("type") String type){
        List<String> list3 =new ArrayList<>();
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList2 = browseTypeService.browseSomaticRatioByType2(type);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList2){
            list3.add(browseSomaticGeneRatio.getLog2odds0());
            list3.add(browseSomaticGeneRatio.getLog10fdr0());
            list3.add(browseSomaticGeneRatio.getGene());
            list3.add(browseSomaticGeneRatio.getFdr());

        }
        return list3;
    }

    @RequestMapping("/BrowseSomaticGeneRatioVsTcgaByType")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioVsTcgaByType(@Param ("type") String type){
        List<String> list4 =new ArrayList<>();
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList = browseTypeService.browseSomaticRatioByTypeVsTcga(type);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList){
            list4.add(browseSomaticGeneRatioVsTcga.getGenecastratio());
            list4.add(browseSomaticGeneRatioVsTcga.getTcgaratio());
            list4.add(browseSomaticGeneRatioVsTcga.getGene());
            list4.add(browseSomaticGeneRatioVsTcga.getFdr());
        }
        return list4;
    }

    //germline
    @RequestMapping("/BrowseGermlineGeneNumberByType")
    @ResponseBody
    public List<String> BrowseGermlineGeneNumberByType(@Param ("type") String type){
        List<String> list1 =new ArrayList<>();
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList = browseTypeService.browseGermlineNumberByType(type);
        for (BrowseGermlineGeneNumber browseGermlineGeneNumber : BrowseGermlineGeneNumberList){
            list1.add(browseGermlineGeneNumber.getGene());
            list1.add(browseGermlineGeneNumber.getNumber());
        }
        return list1;
    }

    @RequestMapping("/BrowseGermlineGeneRatioByType")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatioByType(@Param ("type") String type){
        List<String> list2 =new ArrayList<>();
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList = browseTypeService.browseGermlineRatioByType(type);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList){
            list2.add(browseGermlineGeneRatio.getGene());
            list2.add(browseGermlineGeneRatio.getRatio());
        }
        return list2;
    }

    @RequestMapping("/BrowseGermlineGeneRatioByType2")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatioByType2(@Param ("type") String type){
        List<String> list3 =new ArrayList<>();
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList2 = browseTypeService.browseGermlineRatioByType2(type);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList2){
            list3.add(browseGermlineGeneRatio.getLog2odds0());
            list3.add(browseGermlineGeneRatio.getLog10fdr0());
            list3.add(browseGermlineGeneRatio.getGene());
            list3.add(browseGermlineGeneRatio.getFdr());

        }
        return list3;
    }

    @RequestMapping("/BrowseGermlineGeneRatioVsTcgaByType")
    @ResponseBody
    public List<String> BrowseGermlineGeneRatioVsTcgaByType(@Param ("type") String type){
        List<String> list4 =new ArrayList<>();
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList = browseTypeService.browseGermlineRatioByTypeVsTcga(type);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList){
            list4.add(browseGermlineGeneRatioVsTcga.getGenecastratio());
            list4.add(browseGermlineGeneRatioVsTcga.getTcgaratio());
            list4.add(browseGermlineGeneRatioVsTcga.getGene());
            list4.add(browseGermlineGeneRatioVsTcga.getFdr());
        }
        return list4;
    }

    @RequestMapping("/BrowseSomaticTmbByType")
    @ResponseBody
    public List<String> BrowseSomaticTmbByType(@Param ("type") String type){
        List<String> list5 =new ArrayList<>();
        List<Browsetmb> BrowsetmbList = browseTypeService.findTmbByType(type);
        for (Browsetmb browsetmb : BrowsetmbList){
            list5.add(browsetmb.getType());
            list5.add(browsetmb.getNumber());
        }
        return list5;
    }

    @RequestMapping("/BrowseSomaticSignatureByType")
    @ResponseBody
    public List<String> BrowseSomaticSignatureByType(@Param ("type") String type){
        List<String> list6 =new ArrayList<>();

        List<SomaticSignature> SomaticSignatureList = browseTypeService.findSignatureByType(type);
        for (SomaticSignature somaticSignature : SomaticSignatureList){
            list6.add(somaticSignature.getType());
            list6.add(somaticSignature.getSignature1());
            list6.add(somaticSignature.getSignature2());
            list6.add(somaticSignature.getSignature3());
            list6.add(somaticSignature.getSignature4());
            list6.add(somaticSignature.getSignature5());
            list6.add(somaticSignature.getSignature6());
            list6.add(somaticSignature.getSignature7());
            list6.add(somaticSignature.getSignature8());
            list6.add(somaticSignature.getSignature9());
            list6.add(somaticSignature.getSignature10());
            list6.add(somaticSignature.getSignature11());
            list6.add(somaticSignature.getSignature12());
            list6.add(somaticSignature.getSignature13());
            list6.add(somaticSignature.getSignature14());
            list6.add(somaticSignature.getSignature15());
            list6.add(somaticSignature.getSignature16());
            list6.add(somaticSignature.getSignature17());
            list6.add(somaticSignature.getSignature18());
            list6.add(somaticSignature.getSignature19());
            list6.add(somaticSignature.getSignature20());
            list6.add(somaticSignature.getSignature21());
            list6.add(somaticSignature.getSignature22());
            list6.add(somaticSignature.getSignature23());
            list6.add(somaticSignature.getSignature24());
            list6.add(somaticSignature.getSignature25());
            list6.add(somaticSignature.getSignature26());
            list6.add(somaticSignature.getSignature27());
            list6.add(somaticSignature.getSignature28());
            list6.add(somaticSignature.getSignature29());
            list6.add(somaticSignature.getSignature30());
        }
        return list6;
    }

    @RequestMapping("/BrowseClinicalAgeByType")
    @ResponseBody
    public List<String> BrowseClinicalAgeByType(@Param ("type") String type){
        List<String> list8 =new ArrayList<>();
        List<BrowseAge> BrowseAgeList = browseTypeService.findAgeByType(type);
        for (BrowseAge browseAge : BrowseAgeList){
            list8.add(browseAge.getType());
            list8.add(browseAge.getAge());
        }
        return list8;
    }

    @RequestMapping("/BrowseClinicalGenderByType")
    @ResponseBody
    public List<String> BrowseClinicalGenderByType(@Param ("type") String type){
        List<String> list9 =new ArrayList<>();
        List<BrowseGender> BrowseGenderList = browseTypeService.findGenderByType(type);
        for (BrowseGender browseGender : BrowseGenderList){
            list9.add(browseGender.getType());
            list9.add(browseGender.getFemale());
            list9.add(browseGender.getMale());
        }
        return list9;
    }

    @RequestMapping("/BrowseSomaticGeneRatioVsGermlineByType")
    @ResponseBody
    public List<String> BrowseSomaticGeneRatioVsGermlineByType(@Param ("type") String type){
        List<String> list7 =new ArrayList<>();

        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList = browseTypeService.browseSomaticRatioByTypeVsGermline(type);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList){
            list7.add(browseSomaticGeneRatioVsGermline.getSomatic());
            list7.add(browseSomaticGeneRatioVsGermline.getGermline());
            list7.add(browseSomaticGeneRatioVsGermline.getGene());
            list7.add(browseSomaticGeneRatioVsGermline.getLog2odds0());
        }
        return list7;
    }

}
