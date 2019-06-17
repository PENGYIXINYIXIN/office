package com.qfedu.service.impl;

import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/17.
 */

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired(required=true)
    private StaffDao staffDao;
    @Override
    public List<Staff> findAllStaff() {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        List<Staff> staffList = staffDao.findAllStaff();
        return staffList;
    }
}