package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.ProcessDao;
import com.qfedu.pojo.Process;
import com.qfedu.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/20.
 */
@Service
public class ProcessServiceImpl implements ProcessService {
    @Autowired
    private ProcessDao processDao;
    @Override
    public void processadd(Process process) {
        processDao.processadd(process);
    }

    @Override
    public Map processnolist(Integer page,Integer limit,Integer checked) {
        PageHelper.startPage(page, limit);
        List<Process> list = processDao.processnolist(checked);
        // 获取总记录数
        long total = ((Page) list).getTotal();


        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }

    @Override
    public Map<String, Object> processupdate(Map map) {
        processDao.processupdate(map);
        Map<String,Object> map1=new HashMap<>();
        map1.put("code",1);
        return map1;
    }

    @Override
    public Map<String, Object> processlist(Integer page,Integer limit,String startno) {
        PageHelper.startPage(page, limit);
        List<Process> list = processDao.myprocesslist(startno);
        // 获取总记录数
        long total = ((Page) list).getTotal();


        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }

    @Override
    public Map<String, Object> processdel(Integer id) {
        processDao.processdel(id);
        Map<String, Object> map = new HashMap<>();
        map.put("code",1);
        return map;
    }
}
