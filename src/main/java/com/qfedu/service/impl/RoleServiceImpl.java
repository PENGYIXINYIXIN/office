package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/18.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> findRole() {
        return roleDao.findRole();
    }

    @Override
    public List<String> findRids(Integer id) {

        return  roleDao.findRids(id);
    }

    @Override
    public void deleteRole(String id) {
        roleDao.deleteRole(id);
    }

    @Override
    public void insertRole(Map map) {
      roleDao.insertRole(map);
    }

    @Override
    public Map<String, Object> getRoleAll(Integer page,Integer limit) {
        PageHelper.startPage(page, limit);
        List<Role> list = roleDao.findRole();
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
    public Map getRoleByUser(Integer page, Integer limit, Role role) {
        PageHelper.startPage(page, limit);
        List<Role> list = roleDao.findRoleByRole(role);
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
    public void deleteRoleAuth(Integer id) {
        roleDao.deleteRoleAuth1(id);
        roleDao.deleteRoleAuth2(id);
        roleDao.deleteRoleAuth3(id);
    }
}
