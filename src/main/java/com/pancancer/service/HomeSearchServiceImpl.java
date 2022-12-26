package com.pancancer.service;

import com.pancancer.dao.HomeSearchDAO;
import com.pancancer.entity.HomeSearch;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class HomeSearchServiceImpl implements HomeSearchService{

    @Autowired(required = false)
    private HomeSearchDAO homeSearchDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    /*public List<HomeSearch> searchBySearchTerm(String searchTerm){return homeSearchDAO.searchBySearchTerm(searchTerm); }*/
    public List<HomeSearch> searchBySearchTerm(String param) {
        List<HomeSearch> homeSearchList=null;
        try{
            homeSearchList=new ArrayList<>();
            if(StringUtils.isBlank(param)){
                return homeSearchList;
            }
            /*QueryWrapper<HomeSearch> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("deleted_flag",0);
            if(StringUtils.isNotBlank(param)) {
                queryWrapper.and(wrapper -> wrapper.like("materiel_number", param).or().like("materiel_name", param));
            }
            homeSearchList=homeSearchDAO.selectList(queryWrapper);*/
            if(StringUtils.isNotBlank(param)) {
                homeSearchList=homeSearchDAO.searchBySearchTerm(param);
            }
        }catch (Exception ex){
            /*Log.getInst(this).error(ex.getMessage());*/
            System.out.println(ex.getMessage());
        }
        return homeSearchList;
    }
}
