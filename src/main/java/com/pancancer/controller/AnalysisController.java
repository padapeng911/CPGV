package com.pancancer.controller;

import com.pancancer.entity.Analysis;
import com.pancancer.entity.Browsetmb;
import com.pancancer.entity.SearchByGeneInfo;
import com.pancancer.service.SearchByGeneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class AnalysisController {

    @GetMapping("/Pan-cancer Analysis")
    public String analysisForm(Model model) {
        model.addAttribute("analysis", new Analysis());
        return "pancancer";
    }

    @Autowired
    private SearchByGeneInfoService searchByGeneInfoService;

    @RequestMapping("/Analysis")
    public String analysisSubmit(@ModelAttribute Analysis analysis, Model model) {
        String types = analysis.getType();
        String names = analysis.getGene();
        if (names == null) {
            return "pancancer0";
        } else {
            List<SearchByGeneInfo> searchByGeneInfos =searchByGeneInfoService.searchBySymbol(names);
            model.addAttribute("searchByGeneInfos",searchByGeneInfos);
            return "pancancer1";
        }

    }
}

