package com.pancancer.service;

import com.pancancer.dao.SearchByGeneInfoDAO;
import com.pancancer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SearchByGeneInfoServiceImpl implements SearchByGeneInfoService{

    @Autowired(required = false)
    private SearchByGeneInfoDAO searchByGeneInfoDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchByGeneInfo> searchBySymbol(String symbol){return searchByGeneInfoDAO.searchBySymbol(symbol);}

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchBySomaticSiteInfo> searchBySomaticSite(String pid){return searchByGeneInfoDAO.searchBySomaticSite(pid);}

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchBySomaticSite> searchNumberBySomaticSite(String pid){
        List<SearchBySomaticSite> SearchBySomaticSiteList=null;
        try{
            SearchBySomaticSiteList=new ArrayList<>();
            SearchBySomaticSiteList=searchByGeneInfoDAO.searchNumberBySomaticSite(pid);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return SearchBySomaticSiteList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchBySomaticSite> searchRatioBySomaticSite(String pid){
        List<SearchBySomaticSite> SearchBySomaticSiteList=null;
        try{
            SearchBySomaticSiteList=new ArrayList<>();
            SearchBySomaticSiteList=searchByGeneInfoDAO.searchRatioBySomaticSite(pid);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return SearchBySomaticSiteList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchByGermlineSite> searchNumberByGermlineSite(String pid){
        List<SearchByGermlineSite> SearchByGermlineSiteList=null;
        try{
            SearchByGermlineSiteList=new ArrayList<>();
            SearchByGermlineSiteList=searchByGeneInfoDAO.searchNumberByGermlineSite(pid);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return SearchByGermlineSiteList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchByGermlineSite> searchRatioByGermlineSite(String pid){
        List<SearchByGermlineSite> SearchByGermlineSiteList=null;
        try{
            SearchByGermlineSiteList=new ArrayList<>();
            SearchByGermlineSiteList=searchByGeneInfoDAO.searchRatioByGermlineSite(pid);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return SearchByGermlineSiteList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchSomaticSiteByGene> selectSomaticSiteByGene(String gene){return searchByGeneInfoDAO.selectSomaticSiteByGene(gene);}

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SearchGermlineSiteByGene> selectGermlineSiteByGene(String gene){return searchByGeneInfoDAO.selectGermlineSiteByGene(gene);}
}
