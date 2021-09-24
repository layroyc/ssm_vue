package com.hp.controller;

import com.hp.bean.Computer;
import com.hp.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/computer")
public class ComputerController {
    @Autowired
    private ComputerService computerService;

    //全查
    @RequestMapping("/queryAll")
    @ResponseBody
    public Map queryAll(){
        List<Computer> computers = computerService.selectByExample(null);
        Map codeMap = new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",computers);
        return codeMap;
    }

    //删除
    @RequestMapping("delete")
    @ResponseBody
    public Map delete(@RequestBody Integer computerId){
        Map codeMap = new HashMap();
        int i = computerService.deleteByPrimaryKey(computerId);
        if(i==1){
            codeMap.put("code",0);
            codeMap.put("msg","删除成功");
        }else{
            codeMap.put("code",400);
            codeMap.put("msg","删除失败");
        }
        return codeMap;
    }
    //修改
    @RequestMapping("/update")
    @ResponseBody
    public Map update(@RequestBody Computer computer){
        Map codeMap = new HashMap();
        int i = computerService.updateByPrimaryKeySelective(computer);
        if(i==1){
            codeMap.put("code",0);
            codeMap.put("msg","修改成功");
        }else{
            codeMap.put("code",400);
            codeMap.put("msg","修改失败");
        }
        return codeMap;
    }
}
