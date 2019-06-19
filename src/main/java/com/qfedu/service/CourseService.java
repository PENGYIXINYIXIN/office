package com.qfedu.service;

import com.qfedu.pojo.Course;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/19.
 */
public interface CourseService {

    List<Course> findcourse();

    Map<String,Object> findByPage(Integer page, Integer limit);

    void deleteById(Integer id);

    void updateById(Course course);

    void addCourse(Course course);
}
