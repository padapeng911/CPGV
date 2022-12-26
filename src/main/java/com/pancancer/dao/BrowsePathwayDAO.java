package com.pancancer.dao;


import com.pancancer.entity.Browse;
import com.pancancer.entity.BrowsePathway;
import com.pancancer.entity.BrowseSomatic;
import com.pancancer.entity.Browsetmb;

import java.util.List;

public interface BrowsePathwayDAO {

    List<BrowsePathway> findGeneByPathway(String pathway);

    List<BrowseSomatic> findByGene(String gene);

    List<Browse> findByGene2(String gene);
}
