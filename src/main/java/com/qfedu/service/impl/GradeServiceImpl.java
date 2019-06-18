package com.qfedu.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Students;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/15.
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Override
    public List<Grade> findGrade() {
        List<Grade> gradeList = gradeDao.findGrade();
        return gradeList;
    }

    @Override
    public Map<String, Object> findGradePage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Grade> gradeList = gradeDao.findGrade();
        System.out.println("班级列表"+gradeList);
        long total = ((Page) gradeList).getTotal();
        //获取总页数
        int pages = ((Page) gradeList).getPages();

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",gradeList);
        return map;
    }
}