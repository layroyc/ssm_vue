package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
    @RequestMapping("/main")
    public String main(){
        return "/main";
    }
    //addComponent01
    @RequestMapping("/addComponent01")
    public String addComponent01(){
        return "/addComponent01";
    }
    //selectAllCom
    @RequestMapping("/selectAllCom")
    public String selectAllCom(){
        return "/selectAllCom";
    }
    //computerAll
    @RequestMapping("/computerAll")
    public String computerAll(){
        return "/computerAll";
    }
    //addComputer
    @RequestMapping("/addComputer")
    public String addComputer(){
        return "/addComputer";
    }

}
