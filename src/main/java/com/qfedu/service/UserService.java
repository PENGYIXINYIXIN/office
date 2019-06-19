package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.pojo.UserMenu;

import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/17.
 */
public interface UserService {


    List<UserMenu> findMenu(String no);

    Map findMap(Integer page, Integer limit);


    Map findMapByUser(Integer page, Integer limit, User user);

    void deleteUser(Integer id);
}
