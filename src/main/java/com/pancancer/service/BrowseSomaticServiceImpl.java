package com.pancancer.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pancancer.dao.BrowseSomaticDAO;
import com.pancancer.entity.BrowseSomatic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrowseSomaticServiceImpl implements BrowseSomaticService{

    @Autowired(required = false)
    private BrowseSomaticDAO browseSomaticDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomatic> findAll(){
        return browseSomaticDAO.findAll();
    }


    @Override
    public PageInfo<BrowseSomatic> selectByPrimaryKey(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<BrowseSomatic> allOrderPresentList = browseSomaticDAO.findAll();

        PageInfo<BrowseSomatic> pageInfo = new PageInfo<>(allOrderPresentList);
        return pageInfo;
    }
}
