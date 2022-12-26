package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.AnalysisResultService2;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class AnalysisResult2Controller {

    @Autowired
    private AnalysisResultService2 analysisResultService2;

    @RequestMapping(value = "/AnalysisSomaticGeneNumber2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisSomaticGeneNumber2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList = analysisResultService2.analysisSomaticNumberByType(type);
        for (BrowseSomaticGeneNumber browseSomaticGeneNumber : BrowseSomaticGeneNumberList){
            list0.add(browseSomaticGeneNumber.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList1 = analysisResultService2.analysisSomaticNumberByGenes(gene,type);
        for (BrowseSomaticGeneNumber browseSomaticGeneNumber : BrowseSomaticGeneNumberList1){
            list1.add(browseSomaticGeneNumber.getGene());
            list1.add(browseSomaticGeneNumber.getType());
            list1.add(browseSomaticGeneNumber.getNumber());
        }
        return list1;

    }

    @RequestMapping(value = "/AnalysisGermlineGeneNumber2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisGermlineGeneNumber2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList = analysisResultService2.analysisGermlineNumberByType(type);
        for (BrowseGermlineGeneNumber browseGermlineGeneNumber : BrowseGermlineGeneNumberList){
            list0.add(browseGermlineGeneNumber.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList1 = analysisResultService2.analysisGermlineNumberByGenes(gene,type);
        for (BrowseGermlineGeneNumber browseGermlineGeneNumber : BrowseGermlineGeneNumberList1){
            list1.add(browseGermlineGeneNumber.getGene());
            list1.add(browseGermlineGeneNumber.getType());
            list1.add(browseGermlineGeneNumber.getNumber());
        }
        return list1;

    }

    @RequestMapping(value = "/AnalysisSomaticGeneRatio2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatio2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList = analysisResultService2.analysisSomaticRatioByType(type);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList){
            list0.add(browseSomaticGeneRatio.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList1 = analysisResultService2.analysisSomaticRatioByGenes(gene,type);
        for (BrowseSomaticGeneRatio browseSomaticGeneRatio : BrowseSomaticGeneRatioList1){
            list1.add(browseSomaticGeneRatio.getGene());
            list1.add(browseSomaticGeneRatio.getType());
            list1.add(browseSomaticGeneRatio.getRatio());
        }
        return list1;
    }

    @RequestMapping(value = "/AnalysisGermlineGeneRatio2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatio2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList = analysisResultService2.analysisGermlineRatioByType(type);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList){
            list0.add(browseGermlineGeneRatio.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList1 = analysisResultService2.analysisGermlineRatioByGenes(gene,type);
        for (BrowseGermlineGeneRatio browseGermlineGeneRatio : BrowseGermlineGeneRatioList1){
            list1.add(browseGermlineGeneRatio.getGene());
            list1.add(browseGermlineGeneRatio.getType());
            list1.add(browseGermlineGeneRatio.getRatio());
        }
        return list1;
    }

    @RequestMapping(value = "/AnalysisSomaticGeneRatioVsTcga2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatioVsTcga2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList = analysisResultService2.analysisSomaticRatioByTypeVsTcga(type);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList){
            list0.add(browseSomaticGeneRatioVsTcga.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList1 = analysisResultService2.analysisSomaticRatioByGenesVsTcga(gene,type);
        for (BrowseSomaticGeneRatioVsTcga browseSomaticGeneRatioVsTcga : BrowseSomaticGeneRatioVsTcgaList1){
            list1.add(browseSomaticGeneRatioVsTcga.getGene());
            list1.add(browseSomaticGeneRatioVsTcga.getType());
            list1.add(browseSomaticGeneRatioVsTcga.getGenecastratio());
            list1.add(browseSomaticGeneRatioVsTcga.getTcgaratio());
        }
        return list1;

    }

    @RequestMapping(value = "/AnalysisGermlineGeneRatioVsTcga2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisGermlineGeneRatioVsTcga2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList = analysisResultService2.analysisGermlineRatioByTypeVsTcga(type);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList){
            list0.add(browseGermlineGeneRatioVsTcga.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList1 = analysisResultService2.analysisGermlineRatioByGenesVsTcga(gene,type);
        for (BrowseGermlineGeneRatioVsTcga browseGermlineGeneRatioVsTcga : BrowseGermlineGeneRatioVsTcgaList1){
            list1.add(browseGermlineGeneRatioVsTcga.getGene());
            list1.add(browseGermlineGeneRatioVsTcga.getType());
            list1.add(browseGermlineGeneRatioVsTcga.getGenecastratio());
            list1.add(browseGermlineGeneRatioVsTcga.getTcgaratio());
        }
        return list1;

    }

    @RequestMapping(value = "/AnalysisSomaticGeneRatioVsGermline2", method = {RequestMethod.GET})
    @ResponseBody
    public List<String> AnalysisSomaticGeneRatioVsGermline2(@Param("type") String type){
        List<String> list0 =new ArrayList<>();
        List<String> list1 =new ArrayList<>();
        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList = analysisResultService2.analysisSomaticRatioByTypeVsGermline(type);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList){
            list0.add(browseSomaticGeneRatioVsGermline.getGene());
        }
        String temp2 = "";

        for (Object p:list0) {
            temp2 += "\"" + p + "\",";
        }
        temp2 = temp2.substring(0,temp2.length()-1);
        String gene = temp2;

        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList1 = analysisResultService2.analysisSomaticRatioByGenesVsGermline(gene,type);
        for (BrowseSomaticGeneRatioVsGermline browseSomaticGeneRatioVsGermline : BrowseSomaticGeneRatioVsGermlineList1){
            list1.add(browseSomaticGeneRatioVsGermline.getGene());
            list1.add(browseSomaticGeneRatioVsGermline.getType());
            list1.add(browseSomaticGeneRatioVsGermline.getSomatic());
            list1.add(browseSomaticGeneRatioVsGermline.getGermline());
        }
        return list1;

    }

    @RequestMapping("/BrowseSomaticTmbByTypes")
    @ResponseBody
    public List<String> BrowseSomaticTmbByTypes(@Param("type") String type){
        List<String> list5 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<Browsetmb> BrowsetmbList = analysisResultService2.findTmbByType(type);
        for (Browsetmb browsetmb : BrowsetmbList){
            list5.add(browsetmb.getType());
            list5.add(browsetmb.getNumber());
        }
        return list5;
    }

    @RequestMapping("/BrowseSomaticSignatureByTypes")
    @ResponseBody
    public List<String> BrowseSomaticSignatureByTypes(@Param ("type") String type){
        List<String> list6 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<SomaticSignature> SomaticSignatureList = analysisResultService2.findSignatureByType(type);
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

    @RequestMapping("/BrowseClinicalGenderByTypes")
    @ResponseBody
    public List<String> BrowseClinicalGenderByTypes(@Param("type") String type){
        List<String> list5 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseGender> BrowseGenderList = analysisResultService2.findGenderByType(type);
        for (BrowseGender browseGender : BrowseGenderList){
            list5.add(browseGender.getType());
            list5.add(browseGender.getPercent1());
            list5.add(browseGender.getPercent2());
        }
        return list5;
    }

    @RequestMapping("/BrowseClinicalAgeByTypes")
    @ResponseBody
    public List<String> BrowseClinicalAgeByTypes(@Param("type") String type){
        List<String> list5 =new ArrayList<>();

        String temp = "";
        String[] typelist = type.split(",");

        for (Object p:typelist) {
            temp += "\"" + p + "\",";
        }
        temp = temp.substring(0,temp.length()-1);
        type = temp;

        List<BrowseAge> BrowseAgeList = analysisResultService2.findAgeByType(type);
        for (BrowseAge browseAge : BrowseAgeList){
            list5.add(browseAge.getType());
            list5.add(browseAge.getAge());
        }
        return list5;
    }
}
