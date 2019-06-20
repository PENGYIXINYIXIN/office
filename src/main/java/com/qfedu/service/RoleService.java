package com.qfedu.service;

import com.qfedu.pojo.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/18.
 */
public interface RoleService {
    List<Role> findRole();

    List<String> findRids(Integer id);

    void deleteRole(String id);

    void insertRole(Map map);

    Map<String,Object> getRoleAll(Integer page,Integer limit);

    Map getRoleByUser(Integer page, Integer limit, Role role);

    void deleteRoleAuth(Integer id);
}
