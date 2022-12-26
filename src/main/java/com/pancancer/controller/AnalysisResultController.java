package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.AnalysisResultService;
import com.pancancer.service.BrowseSomaticGeneService;
import com.pancancer.service.SearchByGeneInfoService;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.var;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class AnalysisResultController {

    @Autowired
    private AnalysisResultService analysisResultService;

    @RequestMapping(value = "/AnalysisSomaticGeneNumber", method = {RequestMethod.POST})
    @ResponseBody
    public List<String> AnalysisSomaticGeneNumber(@Param("gene") String gene, @Param("type") String type){
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");
        for (Object p:typelist) {
              temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList = analysisResultService.analysisSomaticNumberByGene(gene,type);
        for (BrowseSomaticGeneNumber browseSomaticGeneNumber : BrowseSomaticGeneNumberList){
            list1.add(browseSomaticGeneNumber.getType());
            list1.add(browseSomaticGeneNumber.getNumber());
        }
        return list1;
    }

    @RequestMapping("/AnalysisSomaticGeneRatio")
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatio(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list2 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList = analysisResultService.analysisSomaticRatioByGene(gene,type);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList){
            list2.add(browseSomaticGeneRatio.getType());
            list2.add(browseSomaticGeneRatio.getRatio());
        }
        return list2;
    }

    @RequestMapping("/AnalysisSomaticGeneRatio12")
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatio12(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list3 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList2 = analysisResultService.analysisSomaticRatioByGene2(gene,type);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList2){
            list3.add(browseSomaticGeneRatio.getLog2odds0());
            list3.add(browseSomaticGeneRatio.getLog10fdr0());
            list3.add(browseSomaticGeneRatio.getType());
            list3.add(browseSomaticGeneRatio.getFdr());

        }
        return list3;
    }

    @RequestMapping("/AnalysisSomaticGeneRatioVsTcga")
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatioVsTcga(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list4 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList = analysisResultService.analysisSomaticRatioByGeneVsTcga(gene,type);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList){
            list4.add(browseSomaticGeneRatioVsTcga.getLog2odds0());
            list4.add(browseSomaticGeneRatioVsTcga.getLog10fdr0());
            list4.add(browseSomaticGeneRatioVsTcga.getType());
            list4.add(browseSomaticGeneRatioVsTcga.getFdr());
        }
        return list4;
    }

    @RequestMapping("/AnalysisSomaticGeneRatioVsTcga12")
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatioVsTcga12(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list5 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList2 = analysisResultService.analysisSomaticRatioByGeneVsTcga2(gene,type);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList2){
            list5.add(browseSomaticGeneRatioVsTcga.getGenecastratio());
            list5.add(browseSomaticGeneRatioVsTcga.getTcgaratio());
            list5.add(browseSomaticGeneRatioVsTcga.getType());
            list5.add(browseSomaticGeneRatioVsTcga.getFdr());
        }
        return list5;
    }

    @RequestMapping("/AnalysisGermlineGeneNumber")
    @ResponseBody
    public List<String> AnalysisGermlineGeneNumber(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list1 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList = analysisResultService.analysisGermlineNumberByGene(gene,type);
        for (BrowseGermlineGeneNumber browseGermlineGeneNumber : BrowseGermlineGeneNumberList){
            list1.add(browseGermlineGeneNumber.getType());
            list1.add(browseGermlineGeneNumber.getNumber());
        }
        return list1;
    }

    @RequestMapping("/AnalysisGermlineGeneRatio")
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatio(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list2 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList = analysisResultService.analysisGermlineRatioByGene(gene,type);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList){
            list2.add(browseGermlineGeneRatio.getType());
            list2.add(browseGermlineGeneRatio.getRatio());
        }
        return list2;
    }

    @RequestMapping("/AnalysisGermlineGeneRatio12")
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatio12(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list3 =new ArrayList<>();

        String temp = "";

        String[] typelist = type.split(",");
        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList2 = analysisResultService.analysisGermlineRatioByGene2(gene,type);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList2){
            list3.add(browseGermlineGeneRatio.getLog2odds0());
            list3.add(browseGermlineGeneRatio.getLog10fdr0());
            list3.add(browseGermlineGeneRatio.getType());
            list3.add(browseGermlineGeneRatio.getFdr());

        }
        return list3;
    }

    @RequestMapping("/AnalysisGermlineGeneRatioVsTcga")
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatioVsTcga(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list4 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList = analysisResultService.analysisGermlineRatioByGeneVsTcga(gene,type);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList){
            list4.add(browseGermlineGeneRatioVsTcga.getLog2odds0());
            list4.add(browseGermlineGeneRatioVsTcga.getLog10fdr0());
            list4.add(browseGermlineGeneRatioVsTcga.getType());
            list4.add(browseGermlineGeneRatioVsTcga.getFdr());
        }
        return list4;
    }

    @RequestMapping("/AnalysisGermlineGeneRatioVsTcga12")
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatioVsTcga12(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list5 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList2 = analysisResultService.analysisGermlineRatioByGeneVsTcga2(gene,type);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList2){
            list5.add(browseGermlineGeneRatioVsTcga.getGenecastratio());
            list5.add(browseGermlineGeneRatioVsTcga.getTcgaratio());
            list5.add(browseGermlineGeneRatioVsTcga.getType());
            list5.add(browseGermlineGeneRatioVsTcga.getFdr());
        }
        return list5;
    }

    @RequestMapping("/AnalysisGermlineGeneRatioVsCaspmi")
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatioVsCaspmi(@Param ("gene") String gene,@Param ("type")String type){
        List<String> list5 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGermlineGeneRatioVsCaspmi> BrowseGermlineGeneRatioVsCaspmiList = analysisResultService.analysisGermlineRatioByGeneVsCaspmi(gene,type);
        for (BrowseGermlineGeneRatioVsCaspmi browseGermlineGeneRatioVsCaspmi : BrowseGermlineGeneRatioVsCaspmiList){
            list5.add(browseGermlineGeneRatioVsCaspmi.getMafInGenecast());
            list5.add(browseGermlineGeneRatioVsCaspmi.getMafInCaspmi());
            list5.add(browseGermlineGeneRatioVsCaspmi.getAachange());
            list5.add(browseGermlineGeneRatioVsCaspmi.getGene());
        }
        return list5;
    }

    @RequestMapping("/AnalysisSomaticGeneRatioVsGermline")
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatioVsGermline(@Param ("gene") String gene,@Param ("type") String type){
        List<String> list7 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");
        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList = analysisResultService.analysisSomaticRatioByGeneVsGermline(gene,type);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList){
            list7.add(browseSomaticGeneRatioVsGermline.getSomatic());
            list7.add(browseSomaticGeneRatioVsGermline.getGermline());
            list7.add(browseSomaticGeneRatioVsGermline.getType());
            list7.add(browseSomaticGeneRatioVsGermline.getLog2odds0());
        }
        return list7;
    }

    @RequestMapping("/AnalysisSomaticGeneRatioVsGermline12")
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatioVsGermline12(@Param ("gene") String gene,@Param ("type") String type){
        List<String> list8 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList2 = analysisResultService.analysisSomaticRatioByGeneVsGermline2(gene,type);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList2){
            list8.add(browseSomaticGeneRatioVsGermline.getLog2odds0());
            list8.add(browseSomaticGeneRatioVsGermline.getLog10fdr0());
            list8.add(browseSomaticGeneRatioVsGermline.getType());
            list8.add(browseSomaticGeneRatioVsGermline.getFdr());
        }
        return list8;
    }

}
