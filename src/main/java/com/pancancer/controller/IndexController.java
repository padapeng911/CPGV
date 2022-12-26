package com.pancancer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/FAQ")
    public String toFAQ(){ return "help"; }
    @GetMapping("/Downloads")
    public String toDownloads(){
        return "downloads";
    }
    @GetMapping("/BrowseSomatic")
    public String toBrowseSomatic(){
        return "browseSomatic";
    }
    @GetMapping("/Browse2")
    public String toBrowse2(){
        return "browse2";
    }
    @GetMapping("/Browse3")
    public String toBrowse3(){
        return "browse3";
    }
    @GetMapping("/BrowseType")
    public String toBrowseType(){ return "browseType"; }

}
