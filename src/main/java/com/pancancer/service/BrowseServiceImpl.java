package com.pancancer.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pancancer.dao.BrowseDAO;
import com.pancancer.entity.Browse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrowseServiceImpl implements BrowseService{

    @Autowired(required = false)
    private BrowseDAO browseDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Browse> findAll(){
        return browseDAO.findAll();
    }


    @Override
    public PageInfo<Browse> selectByPrimaryKey(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<Browse> allOrderPresentList = browseDAO.findAll();

        PageInfo<Browse> pageInfo = new PageInfo<>(allOrderPresentList);
        return pageInfo;
    }
}
