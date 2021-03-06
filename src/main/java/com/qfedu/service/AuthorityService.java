package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/19.
 */
public interface AuthorityService {
    Map<String,Object> selectAtr(Integer page, Integer limit);

    void addAuthority(Authority atr);

    List<Authority> getParentroot();

    void authoritydelete(Integer id);

    List<Authority> findAuth();

    List<String> findRids(Integer id);

    void deleteRoleAuth(String id);

    void insertAuth(Map map);
}
