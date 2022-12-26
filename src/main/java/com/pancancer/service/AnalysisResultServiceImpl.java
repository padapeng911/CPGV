package com.pancancer.service;

import com.pancancer.dao.AnalysisResultDAO;
import com.pancancer.dao.BrowseGermlineGeneDAO;
import com.pancancer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AnalysisResultServiceImpl implements AnalysisResultService{

    @Autowired(required = false)
    private AnalysisResultDAO analysisResultDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneNumber> analysisSomaticNumberByGene(String gene,String type){
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList=null;
        try{
            BrowseSomaticGeneNumberList=new ArrayList<>();
            BrowseSomaticGeneNumberList=analysisResultDAO.analysisSomaticNumberByGene(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> analysisSomaticRatioByGene(String gene,String type){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList=null;
        try{
            BrowseSomaticGeneRatioList=new ArrayList<>();
            BrowseSomaticGeneRatioList=analysisResultDAO.analysisSomaticRatioByGene(gene,type);
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
        return BrowseSomaticGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> analysisSomaticRatioByGene2(String gene,String type){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList2=null;
        try{
            BrowseSomaticGeneRatioList2=new ArrayList<>();
            BrowseSomaticGeneRatioList2=analysisResultDAO.analysisSomaticRatioByGene2(gene,type);
        }catch (Exception ex3){
            System.out.println(ex3.getMessage());
        }
        return BrowseSomaticGeneRatioList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByGeneVsTcga(String gene,String type){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList=null;
        try{
            BrowseSomaticGeneRatioVsTcgaList=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList=analysisResultDAO.analysisSomaticRatioByGeneVsTcga(gene,type);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByGeneVsTcga2(String gene,String type){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList2=null;
        try{
            BrowseSomaticGeneRatioVsTcgaList2=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList2=analysisResultDAO.analysisSomaticRatioByGeneVsTcga2(gene,type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneNumber> analysisGermlineNumberByGene(String gene,String type){
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList=null;
        try{
            BrowseGermlineGeneNumberList=new ArrayList<>();
            BrowseGermlineGeneNumberList=analysisResultDAO.analysisGermlineNumberByGene(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> analysisGermlineRatioByGene(String gene,String type){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList=null;
        try{
            BrowseGermlineGeneRatioList=new ArrayList<>();
            BrowseGermlineGeneRatioList=analysisResultDAO.analysisGermlineRatioByGene(gene,type);
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
        return BrowseGermlineGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> analysisGermlineRatioByGene2(String gene,String type){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList2=null;
        try{
            BrowseGermlineGeneRatioList2=new ArrayList<>();
            BrowseGermlineGeneRatioList2=analysisResultDAO.analysisGermlineRatioByGene2(gene,type);
        }catch (Exception ex3){
            System.out.println(ex3.getMessage());
        }
        return BrowseGermlineGeneRatioList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByGeneVsTcga(String gene,String type){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList=null;
        try{
            BrowseGermlineGeneRatioVsTcgaList=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList=analysisResultDAO.analysisGermlineRatioByGeneVsTcga(gene,type);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByGeneVsTcga2(String gene,String type){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList2=null;
        try{
            BrowseGermlineGeneRatioVsTcgaList2=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList2=analysisResultDAO.analysisGermlineRatioByGeneVsTcga2(gene,type);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsCaspmi> analysisGermlineRatioByGeneVsCaspmi(String gene,String type){
        List<BrowseGermlineGeneRatioVsCaspmi> BrowseGermlineGeneRatioVsCaspmiList=null;
        try{
            BrowseGermlineGeneRatioVsCaspmiList=new ArrayList<>();
            BrowseGermlineGeneRatioVsCaspmiList=analysisResultDAO.analysisGermlineRatioByGeneVsCaspmi(gene,type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseGermlineGeneRatioVsCaspmiList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByGeneVsGermline(String gene,String type){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList=null;
        try{
            BrowseSomaticGeneRatioVsGermlineList=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList=analysisResultDAO.analysisSomaticRatioByGeneVsGermline(gene,type);
        }catch (Exception ex7){
            System.out.println(ex7.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByGeneVsGermline2(String gene,String type){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList2=null;
        try{
            BrowseSomaticGeneRatioVsGermlineList2=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList2=analysisResultDAO.analysisSomaticRatioByGeneVsGermline2(gene,type);
        }catch (Exception ex8){
            System.out.println(ex8.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList2;
    }
}
