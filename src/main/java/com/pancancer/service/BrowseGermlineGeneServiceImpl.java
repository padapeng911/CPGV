package com.pancancer.service;

import com.pancancer.dao.BrowseGermlineGeneDAO;
import com.pancancer.dao.BrowseSomaticGeneDAO;
import com.pancancer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BrowseGermlineGeneServiceImpl implements BrowseGermlineGeneService{

    @Autowired(required = false)
    private BrowseGermlineGeneDAO browseGermlineGeneDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneNumber> browseGermlineNumberByGene(String gene){
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList=null;
        try{
            BrowseGermlineGeneNumberList=new ArrayList<>();
            BrowseGermlineGeneNumberList=browseGermlineGeneDAO.browseGermlineNumberByGene(gene);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> browseGermlineRatioByGene(String gene){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList=null;
        try{
            BrowseGermlineGeneRatioList=new ArrayList<>();
            BrowseGermlineGeneRatioList=browseGermlineGeneDAO.browseGermlineRatioByGene(gene);
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
        return BrowseGermlineGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> browseGermlineRatioByGene2(String gene){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList2=null;
        try{
            BrowseGermlineGeneRatioList2=new ArrayList<>();
            BrowseGermlineGeneRatioList2=browseGermlineGeneDAO.browseGermlineRatioByGene2(gene);
        }catch (Exception ex3){
            System.out.println(ex3.getMessage());
        }
        return BrowseGermlineGeneRatioList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> browseGermlineRatioByGeneVsTcga(String gene){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList=null;
        try{
            BrowseGermlineGeneRatioVsTcgaList=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList=browseGermlineGeneDAO.browseGermlineRatioByGeneVsTcga(gene);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> browseGermlineRatioByGeneVsTcga2(String gene){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList2=null;
        try{
            BrowseGermlineGeneRatioVsTcgaList2=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList2=browseGermlineGeneDAO.browseGermlineRatioByGeneVsTcga2(gene);
        }catch (Exception ex6){
            System.out.println(ex6.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsCaspmi> browseGermlineRatioByGeneVsCaspmi(String gene){
        List<BrowseGermlineGeneRatioVsCaspmi> BrowseGermlineGeneRatioVsCaspmiList=null;
        try{
            BrowseGermlineGeneRatioVsCaspmiList=new ArrayList<>();
            BrowseGermlineGeneRatioVsCaspmiList=browseGermlineGeneDAO.browseGermlineRatioByGeneVsCaspmi(gene);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseGermlineGeneRatioVsCaspmiList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneCom> browseGermlineComByGene(String gene){
        List<BrowseGermlineGeneCom> BrowseGermlineGeneComList=null;
        try{
            BrowseGermlineGeneComList=new ArrayList<>();
            BrowseGermlineGeneComList=browseGermlineGeneDAO.browseGermlineComByGene(gene);
        }catch (Exception ex7){
            System.out.println(ex7.getMessage());
        }
        return BrowseGermlineGeneComList;
    }
}
