package com.pancancer.service;

import com.pancancer.entity.HomeSearch;

import java.util.List;

public interface HomeSearchService {

    List<HomeSearch> searchBySearchTerm(String param);
}
