package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：mengchao
 * @date ：Created in 2020/2/14 13:46
 * @description：测试
 */
@Controller
@RequestMapping("testController")
public class TestController {
    @RequestMapping("test")
    public@ResponseBody
    String test(){
        return "TestController::test";
    }
    @RequestMapping("testHtml")
    public String testHtml(){
        return "testHtml";
    }
    @RequestMapping("testjsp")
    public String testjsp(){
        return "jsp";
    }
}
