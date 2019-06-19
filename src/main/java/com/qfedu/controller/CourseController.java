package com.qfedu.controller;

import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/19.
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    //选择下拉框
    @RequestMapping("courseall.do")
    @ResponseBody
    public List<Course> courseall(){
        List<Course> arr = courseService.findcourse();
        return arr;
    }
    //分页显示内容
    @RequestMapping("coursepage.do")
    @ResponseBody
    public  Map<String,Object> findByPage(Integer page,Integer limit){
        Map<String, Object> map = courseService.findByPage(page, limit);
        return map;
    }

}