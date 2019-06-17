package com.qfedu.controller;

import com.qfedu.pojo.Students;
import com.qfedu.service.StudentsService;
import com.qfedu.vo.JsonBean;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
@Controller
@ResponseBody
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentsService studentsService;
    //分页查询学生列表
    @RequestMapping("/studentpage.do")
    public Map<String,Object> findAllStudents(Integer page, Integer limit){
        Map<String, Object> map = studentsService.findStuAll(page, limit);
        return map;
    }
    //添加学生
    @RequestMapping("/studentadd.do")
    public JsonBean studentAdd(Students students){
        System.out.println("进入添加的页面");
        System.out.println("添加的用户信息是"+students);
        studentsService.addStudent(students);
        return new JsonBean(1,null);
    }


}