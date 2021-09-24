package com.hp.controller;

import com.hp.bean.ComponentType;
import com.hp.service.ComponentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private ComponentTypeService componentTypeService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public Map selectAll(){
        List<ComponentType> types = componentTypeService.selectByExample(null);
        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",types);
        return codeMap;
    }
}
