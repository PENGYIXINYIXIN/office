package com.qfedu.dao;

import com.qfedu.pojo.Grade;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/15.
 */
public interface GradeDao {

    List<Grade> findGrade();


    void delectById(Integer id);

    void updateById(Grade grade);

    void addGrade(Grade grade);
}