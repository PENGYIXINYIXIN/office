package com.qfedu.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.pojo.Students;
import com.qfedu.service.StudentsService;
import com.qfedu.utils.ExcelUtils;
import com.qfedu.vo.JsonBean;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
@Controller

@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentsService studentsService;
    //分页查询学生列表
    @ResponseBody
    @RequestMapping("/studentpage.do")
    public Map<String,Object> findAllStudents(Integer page, Integer limit){
        Map<String, Object> map = studentsService.findStuAll(page, limit);
        return map;
    }
    //添加学生
    @RequestMapping("/studentadd.do")
    /*public JsonBean studentAdd(Students students){
        System.out.println("进入添加的页面");
        System.out.println("添加的用户信息是"+students);
        studentsService.addStudent(students);
        return new JsonBean(1,null);
    }*/
    public  String addstu(Students students){
        System.out.println("进入后台添加学生");
        studentsService.addStudent(students);
        return "redirect:/studentlist.html";
    }

    //根据id删除学生
    @RequestMapping("/studentdelete.do")
    public  JsonBean delectstu(String no){
        System.out.println("进入后台删除啊学生");
        studentsService.delectByNo(no);
        return new JsonBean(1,null);
    }
    //批量导入

    @RequestMapping("studentbatch.do")
    @ResponseBody
    public JsonBean importExcel(@RequestParam MultipartFile mFile){
        System.out.println("进入批量上传");
        // 获取上传文件的文件名
        String fileName = mFile.getOriginalFilename();

        // 获取上传文件的输入流
        try {
            InputStream inputStream = mFile.getInputStream();
            // 读取excel内容
            List<Map<String, Object>> maps = ExcelUtils.readExcel(fileName, inputStream);
            // 通过jackson进行操作
            ObjectMapper objectMapper = new ObjectMapper();
            // 将对象转为json格式字符串
            String jsonStr = objectMapper.writeValueAsString(maps);
            // 将json字符串转为指定类型的对象
            List<Students> studentsList = objectMapper.readValue(jsonStr, new TypeReference<List<Students>>() {});
            System.out.println("++++++++++"+studentsList);
            // 批量插入
            studentsService.addstudent(studentsList);

        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0, e.getMessage());
        }

        return new JsonBean(1, null);
    }

}