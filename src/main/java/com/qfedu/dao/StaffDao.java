package com.qfedu.dao;

import com.qfedu.pojo.Staff;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/17.
 */
public interface StaffDao {
    public List<Staff> findAllStaff();

    List<Staff> findAllStaffByPage();

    void deleteById(String  id);

    void addStaff(Staff staff);

    void addStaffList(List<Staff> studentsList);
}
