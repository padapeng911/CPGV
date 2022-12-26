package com.pancancer.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pancancer.entity.Browse;
import com.pancancer.entity.BrowseSomatic;
import com.pancancer.service.BrowseService;
import org.apache.ibatis.annotations.Param;
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
public class BrowseController {

    @Autowired
    private BrowseService browseService;

    @GetMapping("/Browse")
    public String findAll(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,
                          @RequestParam(value="pageSize",defaultValue="10")Integer pageSize,
                          Model model){
        //为了程序的严谨性，判断非空：
        if(pageNum == null){
            pageNum = 1;   //设置默认当前页
        }
        if(pageNum <= 0){
            pageNum = 1;
        }
        if(pageSize == null){
            pageSize = 10;    //设置默认每页显示的数据数
        }
        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
        Page p= PageHelper.startPage(pageNum,pageSize);
        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
        try {
            //传入从第几页查询，每页查几条
            List<Browse> browses = browseService.findAll();
            //查询中最好只有一次查询，不要进行多次查询，pageHelper 默认操作第一次查询的结果集
            PageInfo info = new PageInfo(browses);
            //将List转换为pageInfo对象，这样可以更方便的在页面中进行分页操作
            System.out.println(info);
            model.addAttribute("pageInfo", info);
        }finally {
            PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全
        }
        return "browse";
    }

    @RequestMapping("/BrowseTableInfo")
    @ResponseBody
    public List<Browse> findAll(){
        List<Browse> browse =browseService.findAll();
        return browse;
    }
}
