package com.pancancer.controller;

import com.pancancer.entity.Search1;
import com.pancancer.entity.Search2;
import com.pancancer.entity.Search3;
import com.pancancer.entity.Search4;
import com.pancancer.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/SearchByParamGene")
    @ResponseBody
    public List<String> SearchByParamGene(@RequestParam(value = "param1") String param1){
        List<String> paramList1 = new ArrayList<>();
        List<Search1> SearchList1 = searchService.searchByGene(param1);
        for (Search1 search1 : SearchList1){
            paramList1.add(search1.getGene());
        }
        return paramList1;
    }

    @RequestMapping("/SearchByParamType")
    @ResponseBody
    public List<String> SearchByParamType(@RequestParam(value = "param2") String param2){
        List<String> paramList2 = new ArrayList<>();
        List<Search2> SearchList2 = searchService.searchByType(param2);
        for (Search2 search2 : SearchList2){
            paramList2.add(search2.getType());
        }
        return paramList2;
    }

    @RequestMapping("/SearchByParamPathway")
    @ResponseBody
    public List<String> SearchByParamPathway(@RequestParam(value = "param3") String param3){
        List<String> paramList3 = new ArrayList<>();
        List<Search3> SearchList3 = searchService.searchByPathway(param3);
        for (Search3 search3 : SearchList3){
            paramList3.add(search3.getPathway());
        }
        return paramList3;
    }

    @RequestMapping("/SearchByParamSite")
    @ResponseBody
    public List<String> SearchByParamSite(@RequestParam(value = "param4") String param4){
        List<String> paramList4 = new ArrayList<>();
        List<Search4> SearchList4 = searchService.searchBySite(param4);
        for (Search4 search4 : SearchList4){
            paramList4.add(search4.getSite());
        }
        return paramList4;
    }
}
