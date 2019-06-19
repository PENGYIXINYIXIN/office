package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by 86186 on 2019/6/19.
 */
public interface AuthorityDao {
    List<Authority> selectAtrAll();

    void addAuthority(Authority atr);

    List<Authority> getParentroot();

    void authoritydelete1(Integer id);

    void authoritydelete2(Integer id);
}
