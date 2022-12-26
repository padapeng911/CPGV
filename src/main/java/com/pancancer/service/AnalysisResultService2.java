package com.pancancer.service;

import com.pancancer.entity.*;

import java.util.List;

public interface AnalysisResultService2 {

    List<BrowseSomaticGeneNumber> analysisSomaticNumberByType(String type);

    List<BrowseSomaticGeneNumber> analysisSomaticNumberByGenes(String gene,String type);

    List<BrowseGermlineGeneNumber> analysisGermlineNumberByType(String type);

    List<BrowseGermlineGeneNumber> analysisGermlineNumberByGenes(String gene,String type);

    List<BrowseSomaticGeneRatio> analysisSomaticRatioByType(String type);

    List<BrowseSomaticGeneRatio> analysisSomaticRatioByGenes(String gene,String type);

    List<BrowseGermlineGeneRatio> analysisGermlineRatioByType(String type);

    List<BrowseGermlineGeneRatio> analysisGermlineRatioByGenes(String gene,String type);

    List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByTypeVsTcga(String type);

    List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByGenesVsTcga(String gene,String type);

    List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByTypeVsTcga(String type);

    List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByGenesVsTcga(String gene,String type);

    List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByTypeVsGermline(String type);

    List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByGenesVsGermline(String gene,String type);

    List<Browsetmb> findTmbByType(String type);

    List<SomaticSignature> findSignatureByType(String type);

    List<BrowseGender> findGenderByType(String type);

    List<BrowseAge> findAgeByType(String type);
}
