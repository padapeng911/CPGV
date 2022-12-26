package com.pancancer.dao;

import com.pancancer.entity.HomeSearch;

import java.util.List;

public interface HomeSearchDAO {

    List<HomeSearch> searchBySearchTerm(String name);
}
