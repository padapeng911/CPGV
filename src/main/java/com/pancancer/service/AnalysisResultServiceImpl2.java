package com.pancancer.service;

import com.pancancer.dao.AnalysisResultDAO2;
import com.pancancer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AnalysisResultServiceImpl2 implements AnalysisResultService2{

    @Autowired(required = false)
    private AnalysisResultDAO2 analysisResultDAO2;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneNumber> analysisSomaticNumberByType(String type){
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList =null;
        try {
            BrowseSomaticGeneNumberList=new ArrayList<>();
            BrowseSomaticGeneNumberList=analysisResultDAO2.analysisSomaticNumberByType(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneNumber> analysisSomaticNumberByGenes(String gene,String type){
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList1=null;
        try{
            BrowseSomaticGeneNumberList1=new ArrayList<>();
            BrowseSomaticGeneNumberList1=analysisResultDAO2.analysisSomaticNumberByGenes(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneNumberList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneNumber> analysisGermlineNumberByType(String type){
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList =null;
        try {
            BrowseGermlineGeneNumberList=new ArrayList<>();
            BrowseGermlineGeneNumberList=analysisResultDAO2.analysisGermlineNumberByType(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneNumber> analysisGermlineNumberByGenes(String gene,String type){
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList1=null;
        try{
            BrowseGermlineGeneNumberList1=new ArrayList<>();
            BrowseGermlineGeneNumberList1=analysisResultDAO2.analysisGermlineNumberByGenes(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneNumberList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> analysisSomaticRatioByType(String type){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList =null;
        try {
            BrowseSomaticGeneRatioList=new ArrayList<>();
            BrowseSomaticGeneRatioList=analysisResultDAO2.analysisSomaticRatioByType(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> analysisSomaticRatioByGenes(String gene,String type){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList1=null;
        try{
            BrowseSomaticGeneRatioList1=new ArrayList<>();
            BrowseSomaticGeneRatioList1=analysisResultDAO2.analysisSomaticRatioByGenes(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneRatioList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> analysisGermlineRatioByType(String type){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList =null;
        try {
            BrowseGermlineGeneRatioList=new ArrayList<>();
            BrowseGermlineGeneRatioList=analysisResultDAO2.analysisGermlineRatioByType(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> analysisGermlineRatioByGenes(String gene,String type){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList1=null;
        try{
            BrowseGermlineGeneRatioList1=new ArrayList<>();
            BrowseGermlineGeneRatioList1=analysisResultDAO2.analysisGermlineRatioByGenes(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneRatioList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByTypeVsTcga(String type){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList =null;
        try {
            BrowseSomaticGeneRatioVsTcgaList=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList=analysisResultDAO2.analysisSomaticRatioByTypeVsTcga(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> analysisSomaticRatioByGenesVsTcga(String gene,String type){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList1=null;
        try{
            BrowseSomaticGeneRatioVsTcgaList1=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList1=analysisResultDAO2.analysisSomaticRatioByGenesVsTcga(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByTypeVsTcga(String type){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList =null;
        try {
            BrowseGermlineGeneRatioVsTcgaList=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList=analysisResultDAO2.analysisGermlineRatioByTypeVsTcga(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> analysisGermlineRatioByGenesVsTcga(String gene,String type){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList1=null;
        try{
            BrowseGermlineGeneRatioVsTcgaList1=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList1=analysisResultDAO2.analysisGermlineRatioByGenesVsTcga(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByTypeVsGermline(String type){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList =null;
        try {
            BrowseSomaticGeneRatioVsGermlineList=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList=analysisResultDAO2.analysisSomaticRatioByTypeVsGermline(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> analysisSomaticRatioByGenesVsGermline(String gene,String type){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList1=null;
        try{
            BrowseSomaticGeneRatioVsGermlineList1=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList1=analysisResultDAO2.analysisSomaticRatioByGenesVsGermline(gene,type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList1;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Browsetmb> findTmbByType(String type){
        List<Browsetmb> BrowsetmbList =null;
        try {
            BrowsetmbList=new ArrayList<>();
            BrowsetmbList=analysisResultDAO2.findTmbByType(type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowsetmbList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SomaticSignature> findSignatureByType(String type){
        List<SomaticSignature> SomaticSignatureList =null;
        try {
            SomaticSignatureList=new ArrayList<>();
            SomaticSignatureList=analysisResultDAO2.findSignatureByType(type);
        }catch (Exception ex6){
            System.out.println(ex6.getMessage());
        }
        return SomaticSignatureList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGender> findGenderByType(String type){
        List<BrowseGender> BrowseGenderList =null;
        try {
            BrowseGenderList=new ArrayList<>();
            BrowseGenderList=analysisResultDAO2.findGenderByType(type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseGenderList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseAge> findAgeByType(String type){
        List<BrowseAge> BrowseAgeList =null;
        try {
            BrowseAgeList=new ArrayList<>();
            BrowseAgeList=analysisResultDAO2.findAgeByType(type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseAgeList;
    }
}
