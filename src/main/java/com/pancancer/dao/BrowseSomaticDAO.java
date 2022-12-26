package com.pancancer.dao;

import com.github.pagehelper.PageInfo;
import com.pancancer.entity.BrowseSomatic;

import java.util.List;

public interface BrowseSomaticDAO {

    PageInfo<BrowseSomatic> selectByPrimaryKey(Integer pageNum, Integer pageSize);

    List<BrowseSomatic> findAll();
}
