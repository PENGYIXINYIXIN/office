package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/19.
 */
@RestController
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;
    @RequestMapping("/authoritylist.do")
    public Map<String, Object> selectAtr(Integer page, Integer limit){
        return authorityService.selectAtr(page,limit);
    }
    @RequestMapping("/authorityadd.do")

    public Map authorityadd(Authority atr){
        authorityService.addAuthority(atr);
        Map map=new HashMap();
        map.put("code",1);
        return map;
    }
    @RequestMapping("/authorityroot.do")
    public List<Authority> getParentroot(){
        return authorityService.getParentroot();
    }
    @RequestMapping("/authoritydelete.do")
    public Map authoritydelete(Integer id){
        authorityService.authoritydelete(id);
        Map map=new HashMap();
        map.put("code",1);
        return map;
    }
}
