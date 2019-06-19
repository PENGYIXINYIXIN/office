package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/19.
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    //下拉框
    @Override
    public List<Course> findcourse() {
        return courseDao.findcourse();
    }
    //分页查询
    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Course> courseList = courseDao.findByPage();
        int pages = ((Page) courseList).getPages();
        long total = ((Page) courseList).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",courseList);
        return map;

    }

    @Override
    public void deleteById(Integer id) {
        courseDao.deleteById(id);
    }

    @Override
    public void updateById(Course course) {
        courseDao.updateById(course);
    }

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}