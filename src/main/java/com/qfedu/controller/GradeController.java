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
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/gradeall.do")
    @ResponseBody
    public  List<Grade> findGrade(){
        //System.out.println("查询班级信息");
        List<Grade> arr = gradeService.findGrade();
        //System.out.println("查询达到的班级为"+arr);
        return arr;
    }


    @RequestMapping("/gradepage.do")
    @ResponseBody
    public Map<String,Object> findAllGrade(Integer page, Integer limit){
        System.out.println();
        Map<String, Object> map = gradeService.findGradePage(page,limit);
        return map;
    }

    //根据id删除
    @RequestMapping("gradedelete.do")
    @ResponseBody
    public JsonBean delete(Integer id ){
        gradeService.delectById(id);
        return  new JsonBean(1,null);
    }


    //根据id修改班级信息
    @RequestMapping("gradeupdate.do")
    public String  update(Grade grade){
        System.out.println("进入修改");
        System.out.println("修改拿到的信息是"+grade);
        gradeService.update(grade);
        return "redirect:/gradelist.html";
    }

    //添加班级信息
    @RequestMapping("gradeadd.do")
    public String add(Grade grade){
        gradeService.addGrade(grade);
        return "redirect:/gradelist.html";
    }


}