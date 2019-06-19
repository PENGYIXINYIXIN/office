package com.qfedu.dao;

import com.qfedu.pojo.Course;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/18.
 */
public interface CourseDao {


     List<Course> findcourse();

     List<Course> findByPage();
}
