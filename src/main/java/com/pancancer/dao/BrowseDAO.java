package com.pancancer.dao;

import com.pancancer.entity.Browse;

import java.util.List;

public interface BrowseDAO {

    Browse selectByPrimaryKey(String gene);

    List<Browse> findAll();
}
