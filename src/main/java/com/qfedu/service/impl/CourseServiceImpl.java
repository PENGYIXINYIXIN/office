package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List<Course> courseList = courseDao.findcourse();
        int pages = ((Page) courseList).getPages();
        return null;
    }
}