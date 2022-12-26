package com.pancancer.service;

import com.pancancer.dao.BrowseSomaticGeneDAO;
import com.pancancer.dao.BrowseTypeDAO;
import com.pancancer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BrowseTypeServiceImpl implements BrowseTypeService{

    @Autowired(required = false)
    private BrowseTypeDAO browseTypeDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneNumber> browseSomaticNumberByType(String type){
        List<BrowseSomaticGeneNumber> BrowseSomaticGeneNumberList=null;
        try{
            BrowseSomaticGeneNumberList=new ArrayList<>();
            BrowseSomaticGeneNumberList=browseTypeDAO.browseSomaticNumberByType(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseSomaticGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> browseSomaticRatioByType(String type){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList=null;
        try{
            BrowseSomaticGeneRatioList=new ArrayList<>();
            BrowseSomaticGeneRatioList=browseTypeDAO.browseSomaticRatioByType(type);
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
        return BrowseSomaticGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatio> browseSomaticRatioByType2(String type){
        List<BrowseSomaticGeneRatio> BrowseSomaticGeneRatioList2=null;
        try{
            BrowseSomaticGeneRatioList2=new ArrayList<>();
            BrowseSomaticGeneRatioList2=browseTypeDAO.browseSomaticRatioByType2(type);
        }catch (Exception ex3){
            System.out.println(ex3.getMessage());
        }
        return BrowseSomaticGeneRatioList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsTcga> browseSomaticRatioByTypeVsTcga(String type){
        List<BrowseSomaticGeneRatioVsTcga> BrowseSomaticGeneRatioVsTcgaList=null;
        try{
            BrowseSomaticGeneRatioVsTcgaList=new ArrayList<>();
            BrowseSomaticGeneRatioVsTcgaList=browseTypeDAO.browseSomaticRatioByTypeVsTcga(type);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseSomaticGeneRatioVsTcgaList;
    }

    //germline
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneNumber> browseGermlineNumberByType(String type){
        List<BrowseGermlineGeneNumber> BrowseGermlineGeneNumberList=null;
        try{
            BrowseGermlineGeneNumberList=new ArrayList<>();
            BrowseGermlineGeneNumberList=browseTypeDAO.browseGermlineNumberByType(type);
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        return BrowseGermlineGeneNumberList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> browseGermlineRatioByType(String type){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList=null;
        try{
            BrowseGermlineGeneRatioList=new ArrayList<>();
            BrowseGermlineGeneRatioList=browseTypeDAO.browseGermlineRatioByType(type);
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
        return BrowseGermlineGeneRatioList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatio> browseGermlineRatioByType2(String type){
        List<BrowseGermlineGeneRatio> BrowseGermlineGeneRatioList2=null;
        try{
            BrowseGermlineGeneRatioList2=new ArrayList<>();
            BrowseGermlineGeneRatioList2=browseTypeDAO.browseGermlineRatioByType2(type);
        }catch (Exception ex3){
            System.out.println(ex3.getMessage());
        }
        return BrowseGermlineGeneRatioList2;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGermlineGeneRatioVsTcga> browseGermlineRatioByTypeVsTcga(String type){
        List<BrowseGermlineGeneRatioVsTcga> BrowseGermlineGeneRatioVsTcgaList=null;
        try{
            BrowseGermlineGeneRatioVsTcgaList=new ArrayList<>();
            BrowseGermlineGeneRatioVsTcgaList=browseTypeDAO.browseGermlineRatioByTypeVsTcga(type);
        }catch (Exception ex4){
            System.out.println(ex4.getMessage());
        }
        return BrowseGermlineGeneRatioVsTcgaList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Browsetmb> findTmbByType(String type){
        List<Browsetmb> BrowsetmbList =null;
        try {
            BrowsetmbList=new ArrayList<>();
            BrowsetmbList=browseTypeDAO.findTmbByType(type);
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
            SomaticSignatureList=browseTypeDAO.findSignatureByType(type);
        }catch (Exception ex6){
            System.out.println(ex6.getMessage());
        }
        return SomaticSignatureList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseAge> findAgeByType(String type){
        List<BrowseAge> BrowseAgeList =null;
        try {
            BrowseAgeList=new ArrayList<>();
            BrowseAgeList=browseTypeDAO.findAgeByType(type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseAgeList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseGender> findGenderByType(String type){
        List<BrowseGender> BrowseGenderList =null;
        try {
            BrowseGenderList=new ArrayList<>();
            BrowseGenderList=browseTypeDAO.findGenderByType(type);
        }catch (Exception ex5){
            System.out.println(ex5.getMessage());
        }
        return BrowseGenderList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomaticGeneRatioVsGermline> browseSomaticRatioByTypeVsGermline(String type){
        List<BrowseSomaticGeneRatioVsGermline> BrowseSomaticGeneRatioVsGermlineList=null;
        try{
            BrowseSomaticGeneRatioVsGermlineList=new ArrayList<>();
            BrowseSomaticGeneRatioVsGermlineList=browseTypeDAO.browseSomaticRatioByTypeVsGermline(type);
        }catch (Exception ex7){
            System.out.println(ex7.getMessage());
        }
        return BrowseSomaticGeneRatioVsGermlineList;
    }
}
