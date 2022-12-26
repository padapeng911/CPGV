package com.pancancer.dao;

import com.pancancer.entity.*;

import java.util.List;

public interface BrowseSomaticGeneDAO {

    List<BrowseSomaticGeneNumber> browseSomaticNumberByGene(String gene);

    List<BrowseSomaticGeneRatio> browseSomaticRatioByGene(String gene);

    List<BrowseSomaticGeneRatio> browseSomaticRatioByGene2(String gene);

    List<BrowseSomaticGeneRatioVsTcga> browseSomaticRatioByGeneVsTcga(String gene);

    List<BrowseSomaticGeneRatioVsTcga> browseSomaticRatioByGeneVsTcga2(String gene);

    List<BrowseSomaticGeneRatioVsGermline> browseSomaticRatioByGeneVsGermline(String gene);

    List<BrowseSomaticGeneRatioVsGermline> browseSomaticRatioByGeneVsGermline2(String gene);

    List<BrowseSomaticGeneCom> browseSomaticComByGene(String gene);
}
