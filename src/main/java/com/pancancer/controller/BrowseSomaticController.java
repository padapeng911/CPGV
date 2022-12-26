package com.pancancer.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pancancer.entity.Browse;
import com.pancancer.entity.BrowseSomatic;
import com.pancancer.service.BrowseSomaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class BrowseSomaticController {

    @Autowired
    private BrowseSomaticService browseSomaticService;

    @RequestMapping("/BrowseSomaticTableInfo")
    @ResponseBody
    public List<BrowseSomatic> findAll(){
        List<BrowseSomatic> browseSomatic =browseSomaticService.findAll();
        return browseSomatic;
    }
}
