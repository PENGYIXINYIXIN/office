package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/19.
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityDao authorityDao;
    @Override
    public Map<String, Object> selectAtr(Integer page,Integer limit) {
        PageHelper.startPage(page, limit);
        List<Authority> list = authorityDao.selectAtrAll();
        // 获取总记录数
        long total = ((Page) list).getTotal();


        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }

    @Override
    public void addAuthority(Authority atr) {
        authorityDao.addAuthority(atr);
    }

    @Override
    public List<Authority> getParentroot() {
        return authorityDao.getParentroot();
    }

    @Override
    public void authoritydelete(Integer id) {
        authorityDao.authoritydelete1(id);
        authorityDao.authoritydelete2(id);
    }

    @Override
    public List<Authority> findAuth() {
        return authorityDao.findAuth();
    }

    @Override
    public List<String> findRids(Integer id) {
        return authorityDao.findRids(id);
    }

    @Override
    public void deleteRoleAuth(String id) {
        authorityDao.deleteRoleAuth(id);
    }

    @Override
    public void insertAuth(Map map) {
        authorityDao.insertAuth(map);
    }
}
