package com.qfedu.service;

import com.qfedu.pojo.Process;

import java.util.Map;

/**
 * Created by 86186 on 2019/6/20.
 */
public interface ProcessService {
    void processadd(Process process);

    Map processnolist(Integer page,Integer limit,Integer checkId);

    Map<String,Object> processupdate(Map map);

    Map<String,Object> processlist(Integer page,Integer limit,String startno);

    Map<String,Object> processdel(Integer id);
}
