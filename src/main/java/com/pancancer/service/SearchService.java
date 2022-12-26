package com.pancancer.service;

import com.pancancer.entity.*;

import java.util.List;

public interface SearchService {

    List<Search1> searchByGene(String param1);
    List<Search2> searchByType(String param2);
    List<Search3> searchByPathway(String param3);
    List<Search4> searchBySite(String param4);
}
