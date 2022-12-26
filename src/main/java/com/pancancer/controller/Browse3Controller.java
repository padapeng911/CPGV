package com.pancancer.controller;

import com.pancancer.entity.Browse2;
import com.pancancer.entity.Browse3;
import com.pancancer.service.Browse3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class Browse3Controller {

    @Autowired
    private Browse3Service browse3Service;

    @RequestMapping("/Browse3Table")
    @ResponseBody
    public List<Browse3> findAll(){
        List<Browse3> list =browse3Service.findAll();
        return list;
    }
}
