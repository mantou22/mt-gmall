package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.service.CatelogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther MT
 * @create 2019-12-21 11:21
 */

@Controller
public class CatelogController {

//    写分类查询
    @Reference
    CatelogService catelogService;

    @RequestMapping("getCatelog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatelog1(){

        return null;
    }
}
