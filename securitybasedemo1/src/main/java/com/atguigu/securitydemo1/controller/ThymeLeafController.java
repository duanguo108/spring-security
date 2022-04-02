package com.atguigu.securitydemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;


/**
 *  * 对应templates下的页面
 */
@RequestMapping("/user")
@Controller
public class ThymeLeafController {

    /**
     * 利用thymeleaf
     * @return
     */
    @RequestMapping("login")
    public String thymeleaf(ModelMap map, HttpSession httpSession){
        return "on";
    }

    /**
     * 利用thymeleaf
     * @return
     */
    @RequestMapping("csrf")
    public String csrf(ModelMap map, HttpSession httpSession){
        return "csrf";
    }


}
