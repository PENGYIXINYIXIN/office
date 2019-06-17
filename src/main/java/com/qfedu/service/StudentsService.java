package com.qfedu.service;

import com.github.pagehelper.Page;
import com.qfedu.pojo.Students;
import com.qfedu.vo.JsonBean;

import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
public interface StudentsService {
   public Map<String,Object>  findStuAll(Integer page, Integer limit);

  JsonBean addStudent(Students students);
}
