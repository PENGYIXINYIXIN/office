package com.qfedu.service;

import com.qfedu.pojo.Grade;

import java.util.List;
import java.util.Map;


/**
 * Created by PENGYIXIN on 2019/6/15.
 */
public interface  GradeService {

    List<Grade> findGrade();

    Map<String,Object> findGradePage(Integer page, Integer limit);
}