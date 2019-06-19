package com.qfedu.dao;

import com.qfedu.pojo.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/18.
 */
public interface RoleDao {
    List<Role> findRole();

    List<String> findRids(Integer id);

    void deleteRole(String id);

    void insertRole(Map map);
}
