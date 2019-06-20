package com.qfedu.dao;

import com.qfedu.pojo.Depart;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/20.
 */
public interface DepartDao {
     List<Depart> findDepart();

    List<Depart> findByPage();

    void add(Depart depart);
}