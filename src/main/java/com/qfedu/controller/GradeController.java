package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import com.qfedu.vo.JsonBean;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/15.
 */
@Controller
@ResponseBody
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/gradeall.do")
    public  List<Grade> findGrade(){
        System.out.println("查询班级信息");
        List<Grade> arr = gradeService.findGrade();
        System.out.println("查询达到的班级为"+arr);
        return arr;
    }


    @RequestMapping("/gradepage.do")
    public Map<String,Object> findAllGrade(Integer page, Integer limit){
        Map<String, Object> map = gradeService.findGradePage(page,limit);
        return map;
    }

}