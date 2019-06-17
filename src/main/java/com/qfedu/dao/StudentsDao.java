package com.qfedu.dao;

import com.qfedu.pojo.Students;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
public interface StudentsDao {

    List<Students> findAllStu();


    int selectByNo(String no);

    void addStudent(Students students);
}
