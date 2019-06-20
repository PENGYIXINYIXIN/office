package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/20.
 */

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired(required = false)
    private DepartDao departDao;

    @Override
    public List<Depart> findDepart() {

        List<Depart> depart = departDao.findDepart();
        return depart;
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Depart> departList = departDao.findByPage();
        int pages = ((Page) departList).getPages();
        long total = ((Page) departList).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",departList);
        return map;

    }

    @Override
    public void addepart(Depart depart) {
        departDao.add(depart);
    }

    @Override
    public void updateDpart(Depart depart) {
        departDao.updateDepart(depart);
    }

    @Override
    public void deleteById(Integer id) {
        departDao.deleteById(id);
    }
}