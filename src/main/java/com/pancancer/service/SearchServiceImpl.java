package com.pancancer.service;


import com.pancancer.dao.SearchDAO;
import com.pancancer.entity.*;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SearchServiceImpl implements SearchService{

    @Autowired(required = false)
    private SearchDAO searchDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Search1> searchByGene(String param1) {
        List<Search1> SearchList1=null;
        try{
            SearchList1=new ArrayList<>();
            if(StringUtils.isBlank(param1)){
                return SearchList1;
            }
            if(StringUtils.isNotBlank(param1)) {
                SearchList1=searchDAO.searchByGene(param1);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return SearchList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Search2> searchByType(String param2) {
        List<Search2> SearchList2=null;
        try{
            SearchList2=new ArrayList<>();
            if(StringUtils.isBlank(param2)){
                return SearchList2;
            }
            if(StringUtils.isNotBlank(param2)) {
                SearchList2=searchDAO.searchByType(param2);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return SearchList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Search3> searchByPathway(String param3) {
        List<Search3> SearchList3=null;
        try{
            SearchList3=new ArrayList<>();
            if(StringUtils.isBlank(param3)){
                return SearchList3;
            }
            if(StringUtils.isNotBlank(param3)) {
                SearchList3=searchDAO.searchByPathway(param3);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return SearchList3;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Search4> searchBySite(String param4) {
        List<Search4> SearchList4=null;
        try{
            SearchList4=new ArrayList<>();
            if(StringUtils.isBlank(param4)){
                return SearchList4;
            }
            if(StringUtils.isNotBlank(param4)) {
                SearchList4=searchDAO.searchBySite(param4);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return SearchList4;
    }
}
