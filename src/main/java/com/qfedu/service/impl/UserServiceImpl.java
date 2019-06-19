package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.pojo.UserMenu;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<UserMenu> findMenu(String no) {
        return userDao.findMenu(no);
    }

    @Override
    public Map findMap(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<User> list = userDao.findAll();
        // 获取总记录数
        System.out.println("用户集合+++++++++"+list);
        long total = ((Page) list).getTotal();


        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }

    @Override
    public Map findMapByUser(Integer page, Integer limit, User user) {
        PageHelper.startPage(page, limit);
        List<User> list = userDao.findMapByUser(user);
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
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
        userDao.deleteUserRole(id);
    }
}
