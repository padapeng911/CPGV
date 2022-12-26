package com.pancancer.dao;

import com.pancancer.entity.*;

import java.util.List;

public interface BrowseTypeDAO {

    List<BrowseSomaticGeneNumber> browseSomaticNumberByType(String type);

    List<BrowseSomaticGeneRatio> browseSomaticRatioByType(String type);

    List<BrowseSomaticGeneRatio> browseSomaticRatioByType2(String type);

    List<BrowseSomaticGeneRatioVsTcga> browseSomaticRatioByTypeVsTcga(String type);

    List<BrowseGermlineGeneNumber> browseGermlineNumberByType(String type);

    List<BrowseGermlineGeneRatio> browseGermlineRatioByType(String type);

    List<BrowseGermlineGeneRatio> browseGermlineRatioByType2(String type);

    List<BrowseGermlineGeneRatioVsTcga> browseGermlineRatioByTypeVsTcga(String type);

    List<Browsetmb> findTmbByType(String type);

    List<SomaticSignature> findSignatureByType(String type);

    List<BrowseAge> findAgeByType(String type);

    List<BrowseGender> findGenderByType(String type);

    List<BrowseSomaticGeneRatioVsGermline> browseSomaticRatioByTypeVsGermline(String type);
}
