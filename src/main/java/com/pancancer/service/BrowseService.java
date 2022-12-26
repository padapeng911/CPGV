package com.pancancer.service;

import com.github.pagehelper.PageInfo;
import com.pancancer.entity.Browse;

import java.util.List;

public interface BrowseService {

    List<Browse> findAll();

    PageInfo<Browse> selectByPrimaryKey(Integer pageNum, Integer pageSize);
}
