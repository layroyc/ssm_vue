package com.hp.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Component;
import com.hp.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/component")
public class ComponentController {
    @Autowired
    private ComponentService componentService;

    @RequestMapping("/selectTable")
    @ResponseBody
    public Map selectTable(){
        List<Map> maps =  componentService.selectComponentAdd();
        Map codeMap = new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",maps);
        return codeMap;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insert(@RequestBody Component component){
        Map codeMap = new HashMap();
        int i = componentService.insertSelective(component);
        if(i==1){
            codeMap.put("code",0);
            codeMap.put("msg","添加成功");
        }else{
            codeMap.put("code",400);
            codeMap.put("msg","添加失败");
        }
        return codeMap;
    }

    @RequestMapping("/selectAllCom")
    @ResponseBody
    public Map selectAllCom(){
        List<Component> components = componentService.selectByExample(null);
        Map codeMap = new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",components);
        return codeMap;
    }

    //分页
    @RequestMapping("/selectByPage")
    @ResponseBody
    public Map selectByPage(@RequestParam(defaultValue = "1",required = true,name="page") Integer page,
                            @RequestParam(defaultValue = "5",required = true,name="pageSize")Integer pageSize){
        //该分页可以分多表查询 但是只能用于mybatis
        // 使用的是  pageHelper 分页， 基于 aop拦截
        // page 是当前页， 默认值 应该是1， pageSize 是值的条数
        //如果没有动态查询， 直接让 Example 为null 就可以了
        PageHelper.startPage(page,pageSize); // 这个PageHelper 拿到前端的 参数
        List<Component> component=componentService.selectByExample(null);//查询的全部数据
        PageInfo<Component> pageInfo=new PageInfo<>(component); // PageHelper 进行拦截
        long total= pageInfo.getTotal(); //拿到总条数
        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",pageInfo);
        codeMap.put("total",total);

        return codeMap;

    }

    //添加电脑查询
    @RequestMapping("/selectTwoTable")
    @ResponseBody
    public Map selectTwoTable(){
        List<Map> mapList = componentService.selectTwoTable();
        Map codeMap = new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",mapList);
        return codeMap;
    }
}
