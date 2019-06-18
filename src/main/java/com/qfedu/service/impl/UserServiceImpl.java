package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.pojo.UserMenu;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
