package com.dwarf.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzx on 16/11/15.
 */
@Controller
public class IndexController {

    private Logger logger = LogManager.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public void index(){
        JSONObject jsonObject = null;
        System.out.println(jsonObject.get("a"));
        logger.info("test-----------------------{}" ,1);
        System.out.println(1);
    }

}
