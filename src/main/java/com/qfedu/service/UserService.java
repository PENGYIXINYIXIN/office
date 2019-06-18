package com.qfedu.service;

import com.qfedu.pojo.UserMenu;

import java.util.List;

/**
 * Created by 86186 on 2019/6/17.
 */
public interface UserService {


    List<UserMenu> findMenu(String no);
}
