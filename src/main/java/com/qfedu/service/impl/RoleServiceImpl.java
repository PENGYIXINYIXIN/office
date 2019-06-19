package com.qfedu.service.impl;

import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
