package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.LoginlogDao;
import com.qfedu.pojo.Loginlog;
import com.qfedu.service.LoginlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */

@Service
public class LoginlogServiceImpl implements LoginlogService {

    @Autowired
    private LoginlogDao loginlogDao;

    @Override
    public Map<String,Object> findAllLoginlog(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Loginlog> loginlogList = loginlogDao.findAllLoginlog();
        //获取总记录数
        long total = ((Page) loginlogList).getTotal();
        //获取总页数
        int pages = ((Page) loginlogList).getPages();

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",loginlogList);
        return map;
    }
}