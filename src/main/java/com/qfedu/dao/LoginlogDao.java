package com.qfedu.dao;

import com.qfedu.pojo.Loginlog;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
public interface LoginlogDao {
    public List<Loginlog> findAllLoginlog();
}