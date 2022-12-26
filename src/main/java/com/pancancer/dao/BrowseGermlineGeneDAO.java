package com.pancancer.dao;

import com.pancancer.entity.*;

import java.util.List;

public interface BrowseGermlineGeneDAO {

    List<BrowseGermlineGeneNumber> browseGermlineNumberByGene(String gene);

    List<BrowseGermlineGeneRatio> browseGermlineRatioByGene(String gene);

    List<BrowseGermlineGeneRatio> browseGermlineRatioByGene2(String gene);

    List<BrowseGermlineGeneRatioVsTcga> browseGermlineRatioByGeneVsTcga(String gene);

    List<BrowseGermlineGeneRatioVsTcga> browseGermlineRatioByGeneVsTcga2(String gene);

    List<BrowseGermlineGeneRatioVsCaspmi> browseGermlineRatioByGeneVsCaspmi(String gene);

    List<BrowseGermlineGeneCom> browseGermlineComByGene(String gene);
}
