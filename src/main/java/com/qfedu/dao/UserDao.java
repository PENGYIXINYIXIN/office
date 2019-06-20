package com.qfedu.dao;

import com.qfedu.pojo.User;
import com.qfedu.pojo.UserMenu;

import java.util.List;


/**
 * Created by 86186 on 2019/6/14.
 */
public interface UserDao {

    public User findByName(String name);
    //根据用户查询用户拥有的角色
    public List<String> findRolesByName(String name);
    //查询用户拥有的权限
    public List<String> findAuthorityByName(String name);
    //查找菜单
    List<UserMenu> findMenu(String no);


    List<User> findAll();

    List<User> findMapByUser(User user);

    void deleteUser(Integer id);

    void deleteUserRole(Integer id);

    String selectUserName(String startno);

    List<User> selectDepart();

    Integer findUserId(String startno);
}
