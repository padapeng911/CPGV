package com.pancancer.controller;

import com.pancancer.entity.Browse2;
import com.pancancer.entity.SearchGermlineSiteByGene;
import com.pancancer.service.Browse2Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class Browse2Controller {

    @Autowired
    private Browse2Service browse2Service;

    @RequestMapping("/Browse2Table")
    @ResponseBody
    public List<Browse2> findAll(){
        List<Browse2> list =browse2Service.findAll();
        return list;
    }
}
