package com.qfedu.service;

import com.qfedu.pojo.Staff;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/17.
 */
public  interface  StaffService {
    public List<Staff> findAllStaff();

    public Map<String,Object> findByPage(Integer page, Integer limit);

    void deleteById(String id);

    void addStaff(Staff staff);

    void addStaffList(List<Staff> studentsList);
}