package com.pancancer.dao;

import com.pancancer.entity.*;

import java.util.List;

public interface AnalysisResultDAO {

    List<BrowseSomaticGeneNumber> analysisSomaticNumberByGene(String gene,String type);

    List<BrowseSomaticGeneRatio> analysisSomaticRatioByGene(String gene,String type);

    List<BrowseSomaticGeneRatio> analysisSomaticRatioByGene2(String gene,String type);

    List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByGeneVsTcga(String gene,String type);

    List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByGeneVsTcga2(String gene,String type);

    List<BrowseGermlineGeneNumber> analysisGermlineNumberByGene(String gene,String type);

    List<BrowseGermlineGeneRatio> analysisGermlineRatioByGene(String gene,String type);

    List<BrowseGermlineGeneRatio> analysisGermlineRatioByGene2(String gene,String type);

    List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByGeneVsTcga(String gene,String type);

    List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByGeneVsTcga2(String gene,String type);

    List<BrowseGermlineGeneRatioVsCaspmi> analysisGermlineRatioByGeneVsCaspmi(String gene,String type);

    List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByGeneVsGermline(String gene,String type);

    List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByGeneVsGermline2(String gene,String type);
}
