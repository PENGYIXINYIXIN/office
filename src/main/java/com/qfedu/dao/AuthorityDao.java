package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/19.
 */
public interface AuthorityDao {
    List<Authority> selectAtrAll();

    void addAuthority(Authority atr);

    List<Authority> getParentroot();

    void authoritydelete1(Integer id);

    void authoritydelete2(Integer id);

    List<Authority> findAuth();

    List<String> findRids(Integer id);

    void deleteRoleAuth(String id);

    void insertAuth(Map map);
}
