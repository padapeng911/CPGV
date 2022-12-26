package com.pancancer.service;

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
public class BrowseSomaticGeneServiceImpl implements BrowseSomaticGeneService{

    @Autowired(required = false)
    private BrowseSomaticGeneDAO browseSomaticGeneDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneNumber> browseSomaticNumberByGene(String gene){
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList=null;
        try{
            BrowseSomaticGeneNumberList=new ArrayList<>();
            BrowseSomaticGeneNumberList=browseSomaticGeneDAO.browseSomaticNumberByGene(gene);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> browseSomaticRatioByGene(String gene){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList=null;
        try{
            BrowseSomaticGeneRatioList=new ArrayList<>();
            BrowseSomaticGeneRatioList=browseSomaticGeneDAO.browseSomaticRatioByGene(gene);
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
        return BrowseSomaticGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> browseSomaticRatioByGene2(String gene){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList2=null;
        try{
            BrowseSomaticGeneRatioList2=new ArrayList<>();
            BrowseSomaticGeneRatioList2=browseSomaticGeneDAO.browseSomaticRatioByGene2(gene);
        }catch (Exception ex3){
            System.out.println(ex3.getMessage());
        }
        return BrowseSomaticGeneRatioList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> browseSomaticRatioByGeneVsTcga(String gene){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList=null;
        try{
            BrowseSomaticGeneRatioVsTcgaList=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList=browseSomaticGeneDAO.browseSomaticRatioByGeneVsTcga(gene);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> browseSomaticRatioByGeneVsTcga2(String gene){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList2=null;
        try{
            BrowseSomaticGeneRatioVsTcgaList2=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList2=browseSomaticGeneDAO.browseSomaticRatioByGeneVsTcga2(gene);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> browseSomaticRatioByGeneVsGermline(String gene){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList=null;
        try{
            BrowseSomaticGeneRatioVsGermlineList=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList=browseSomaticGeneDAO.browseSomaticRatioByGeneVsGermline(gene);
        }catch (Exception ex6){
            System.out.println(ex6.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> browseSomaticRatioByGeneVsGermline2(String gene){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList2=null;
        try{
            BrowseSomaticGeneRatioVsGermlineList2=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList2=browseSomaticGeneDAO.browseSomaticRatioByGeneVsGermline2(gene);
        }catch (Exception ex7){
            System.out.println(ex7.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneCom> browseSomaticComByGene(String gene){
        List<BrowseSomaticGeneCom> BrowseSomaticGeneComList=null;
        try{
            BrowseSomaticGeneComList=new ArrayList<>();
            BrowseSomaticGeneComList=browseSomaticGeneDAO.browseSomaticComByGene(gene);
        }catch (Exception ex8){
            System.out.println(ex8.getMessage());
        }
        return BrowseSomaticGeneComList;
    }
}
