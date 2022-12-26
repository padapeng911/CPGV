package com.pancancer.controller;

import com.pancancer.entity.*;
import com.pancancer.service.BrowsePathwayService;
import com.pancancer.service.SearchByGeneInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class SearchItemController {

    @GetMapping("/Search")
    public String searchForm(Model model) {
        model.addAttribute("searchItem", new SearchItem());
        return "search";
    }

    @GetMapping("/Search2")
    public String searchForm2(Model model) {
        model.addAttribute("searchItem", new SearchItem());
        return "search2";
    }

    @GetMapping("/Search3")
    public String searchForm3(Model model) {
        model.addAttribute("searchItem", new SearchItem());
        return "search3";
    }

    @GetMapping("/Search4")
    public String searchForm4(Model model) {
        model.addAttribute("searchItem", new SearchItem());
        return "search4";
    }

    @Autowired
    private SearchByGeneInfoService searchByGeneInfoService;

    @Autowired
    private BrowsePathwayService browsePathwayService;
    static String canshu;
    @RequestMapping("/SearchItem")
    public String searchSubmit(@ModelAttribute SearchItem searchItem, Model model) {
        int select = Integer.parseInt(searchItem.getItem());
        String names = searchItem.getName();
        if (select == 1) {
            List<SearchByGeneInfo> searchByGeneInfos =searchByGeneInfoService.searchBySymbol(names);
            model.addAttribute("searchByGeneInfos",searchByGeneInfos);
            return "searchbygene";
        } else if (select == 2) {
            return "searchbytype";
        } else if (select == 3) {
            List<String> list1 =new ArrayList<String>();
            List<BrowsePathway> browsePathways = browsePathwayService.findGeneByPathway(names);

            model.addAttribute("browsePathways",browsePathways);
            for(BrowsePathway browsePathway : browsePathways){
                list1.add(browsePathway.getGene());
            }
            String gene = list1.get(0);

            String temp = "";
            String[] genelist = gene.split(",");

            for (Object p:genelist) {
                temp += "\"" + p + "\",";
            }
            temp = temp.substring(0,temp.length()-1);
            gene = temp;
            canshu = gene;
            return "searchbypathway";
        } else {
            List<SearchBySomaticSiteInfo> searchBySomaticSiteInfos =searchByGeneInfoService.searchBySomaticSite(names);
            model.addAttribute("searchBySomaticSiteInfos",searchBySomaticSiteInfos);
            return "searchbysite";
        }

    }

    @RequestMapping("/SearchPathwaySomaticTableInfo")
    @ResponseBody
    public List<BrowseSomatic> findByGene(@Param("gene") String gene){
        List<BrowseSomatic> browseSomatics =browsePathwayService.findByGene(canshu);
        return browseSomatics;
    }

    @RequestMapping("/SearchPathwayGermlineTableInfo")
    @ResponseBody
    public List<Browse> findByGene2(@Param("gene") String gene){
        List<Browse> browse =browsePathwayService.findByGene2(canshu);
        return browse;
    }

    @RequestMapping("/SearchSomaticSiteNumber")
    @ResponseBody
    public List<String> SearchSomaticSiteNumber(@Param("pid") String pid){
        List<String> list1 =new ArrayList<>();
        List<SearchBySomaticSite> SearchBySomaticSiteList = searchByGeneInfoService.searchNumberBySomaticSite(pid);
        for (SearchBySomaticSite searchBySomaticSite : SearchBySomaticSiteList){
            list1.add(searchBySomaticSite.getType());
            list1.add(searchBySomaticSite.getNumber());
        }
        return list1;
    }

    @RequestMapping("/SearchSomaticSiteRatio")
    @ResponseBody
    public List<String> SearchSomaticSiteRatio(@Param("pid") String pid){
        List<String> list1 =new ArrayList<>();

        List<SearchBySomaticSite> SearchBySomaticSiteList = searchByGeneInfoService.searchRatioBySomaticSite(pid);
        for (SearchBySomaticSite searchBySomaticSite : SearchBySomaticSiteList){
            list1.add(searchBySomaticSite.getType());
            list1.add(searchBySomaticSite.getRatio());
        }
        return list1;
    }

    @RequestMapping("/SearchGermlineSiteNumber")
    @ResponseBody
    public List<String> SearchGermlineSiteNumber(@Param("pid") String pid){

        List<String> list1 =new ArrayList<>();

        List<SearchByGermlineSite> SearchByGermlineSiteList = searchByGeneInfoService.searchNumberByGermlineSite(pid);
        for (SearchByGermlineSite searchByGermlineSite : SearchByGermlineSiteList){
            list1.add(searchByGermlineSite.getType());
            list1.add(searchByGermlineSite.getNumber());
        }
        return list1;
    }

    @RequestMapping("/SearchGermlineSiteRatio")
    @ResponseBody
    public List<String> SearchGermlineSiteRatio(@Param("pid") String pid){
        List<String> list1 =new ArrayList<>();
        List<SearchByGermlineSite> SearchByGermlineSiteList = searchByGeneInfoService.searchRatioByGermlineSite(pid);
        for (SearchByGermlineSite searchByGermlineSite : SearchByGermlineSiteList){
            list1.add(searchByGermlineSite.getType());
            list1.add(searchByGermlineSite.getRatio());
        }
        return list1;

    }

    @RequestMapping("/SearchSomaticMutationsByGene")
    @ResponseBody
    public List<SearchSomaticSiteByGene> selectSomaticSiteByGene(@Param("gene") String gene){
        List<SearchSomaticSiteByGene> list =searchByGeneInfoService.selectSomaticSiteByGene(gene);
        return list;
    }

    @RequestMapping("/SearchGermlineMutationsByGene")
    @ResponseBody
    public List<SearchGermlineSiteByGene> selectGermlineSiteByGene(@Param("gene") String gene){
        List<SearchGermlineSiteByGene> list =searchByGeneInfoService.selectGermlineSiteByGene(gene);
        return list;
    }

    @RequestMapping("/BrowseSomaticSite")
    public String resultBySite(@Param("site")String site,Model model){
        List<SearchBySomaticSiteInfo> searchBySomaticSiteInfos =searchByGeneInfoService.searchBySomaticSite(site);
        model.addAttribute("searchBySomaticSiteInfos",searchBySomaticSiteInfos);
        return "browseSomaticSite";
    }

    @RequestMapping("/BrowseGermlineSite")
    public String resultBySite2(@Param("site")String site,Model model){
        List<SearchBySomaticSiteInfo> searchBySomaticSiteInfos =searchByGeneInfoService.searchBySomaticSite(site);
        model.addAttribute("searchBySomaticSiteInfos",searchBySomaticSiteInfos);
        return "browseGermlineSite";
    }
}

