package com.zgjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return "list";
    }

    @RequestMapping("/map")
    @ResponseBody
    public Map map(){
        Map map=new HashMap();
        map.put("key","value");
        return map;
    }
}
