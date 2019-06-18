package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StudentsDao;
import com.qfedu.pojo.Students;
import com.qfedu.service.StudentsService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.transaction.AfterTransaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsDao studentsDao;


    @Override
    public Map<String, Object> findStuAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);

        List<Students> studentsList = studentsDao.findAllStu();//获取总记录数
        long total = ((Page) studentsList).getTotal();
        //获取总页数
        int pages = ((Page) studentsList).getPages();

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",studentsList);
        return map;
    }

    @Override
    public void addStudent(Students students) {
        students.setFlag(1);
        studentsDao.addStudent(students);
    }

    @Override
    public void delectByNo(String no) {
        studentsDao.delectByNo(no);

    }

    @Override
    public void addstudent(List<Students> studentsList) {
        studentsDao.addBatchStudent(studentsList);
    }


}