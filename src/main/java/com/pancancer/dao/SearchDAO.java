package com.pancancer.dao;

import com.pancancer.entity.*;

import java.util.List;

public interface SearchDAO {

    List<Search1> searchByGene(String gene);
    List<Search2> searchByType(String type);
    List<Search3> searchByPathway(String pathway);
    List<Search4> searchBySite(String site);

}
