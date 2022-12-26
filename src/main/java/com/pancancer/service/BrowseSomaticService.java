package com.pancancer.service;

import com.github.pagehelper.PageInfo;
import com.pancancer.entity.BrowseSomatic;

import java.util.List;

public interface BrowseSomaticService {

    List<BrowseSomatic> findAll();

    PageInfo<BrowseSomatic> selectByPrimaryKey(Integer pageNum, Integer pageSize);
}
