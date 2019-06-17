package com.qfedu.controller;

import com.qfedu.service.LoginlogService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
@Controller
@ResponseBody
public class LoginlogController {

    @Autowired
    private LoginlogService loginlogService;

    @RequestMapping("/loginloglist.do")
    public Map<String,Object> findLoginlog(Integer page, Integer limit){
        Map<String, Object> map = loginlogService.findAllLoginlog(page, limit);
        return map;
    }
}