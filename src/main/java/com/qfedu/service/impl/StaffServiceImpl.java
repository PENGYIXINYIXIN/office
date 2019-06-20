package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/17.
 */

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired(required=true)
    private StaffDao staffDao;
    @Override
    public List<Staff> findAllStaff() {
        List<Staff> staffList = staffDao.findAllStaff();
        return staffList;
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Staff> staffList = staffDao.findAllStaffByPage();
        long total = ((Page) staffList).getTotal();
        //获取总页数
        int pages = ((Page) staffList).getPages();

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",staffList);
        return map;
    }

    @Override
    public void deleteById(String id) {
        staffDao.deleteById(id);
    }
}