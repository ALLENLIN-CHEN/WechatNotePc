package com.project.controller;

import com.project.service.TestService;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by clin on 2017/9/3.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;


    @ApiOperation(value = "返回用户信息", httpMethod = "GET", notes = "返回用户信息")
    @RequestMapping("/getTest")
    @ResponseBody
    public Map<String,Object> getTest(){
        Map<String,Object> result = new HashMap<>();
        String name = testService.getTest();
        System.out.print(name);
        String id = "hi";
        result.put(id,name);
        return result;
    }
}
