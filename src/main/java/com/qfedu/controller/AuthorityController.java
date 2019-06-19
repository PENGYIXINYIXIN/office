package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
