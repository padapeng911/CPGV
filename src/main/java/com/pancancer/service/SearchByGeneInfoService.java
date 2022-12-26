package com.pancancer.service;

import com.pancancer.entity.*;

import java.util.List;

public interface SearchByGeneInfoService {

    List<SearchByGeneInfo> searchBySymbol(String symbol);

    List<SearchBySomaticSiteInfo> searchBySomaticSite(String pid);

    List<SearchBySomaticSite> searchNumberBySomaticSite(String pid);

    List<SearchBySomaticSite> searchRatioBySomaticSite(String pid);

    List<SearchByGermlineSite> searchNumberByGermlineSite(String pid);

    List<SearchByGermlineSite> searchRatioByGermlineSite(String pid);

    List<SearchSomaticSiteByGene> selectSomaticSiteByGene(String gene);

    List<SearchGermlineSiteByGene> selectGermlineSiteByGene(String gene);
}
