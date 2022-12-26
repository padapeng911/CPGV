package com.pancancer.controller;

import com.pancancer.entity.HomeSearch;
import com.pancancer.service.HomeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class HomeSearchController {

    @Autowired
    private HomeSearchService homeSearchService;

    @ResponseBody
    @RequestMapping("/HomeSearch")
    public List<String> homeSearch(@RequestParam(value = "param") String param){
        List<String> typeList = new ArrayList<>();
        List<HomeSearch> homeSearchList = homeSearchService.searchBySearchTerm(param);
        for (HomeSearch homeSearch : homeSearchList){
            typeList.add(homeSearch.getItem());
            typeList.add(homeSearch.getName());
        }
        return typeList;
    }
}
