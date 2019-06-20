package com.qfedu.service;

import com.qfedu.pojo.Depart;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/20.
 */
public interface DepartService {

    List<Depart> findDepart();

    Map<String, Object> findByPage(Integer page, Integer limit);

    void addepart(Depart depart);

    void updateDpart(Depart depart);

    void deleteById(Integer id);
}