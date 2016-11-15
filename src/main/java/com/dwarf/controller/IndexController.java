package com.dwarf.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzx on 16/11/15.
 */
@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public void index(){
        JSONObject jsonObject = null;
        System.out.println(jsonObject.get("a"));
        logger.info("test-----------------------");
        System.out.println(1);
    }

}
