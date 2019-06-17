package com.qfedu.controller;

import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/17.
 */
@Controller
@ResponseBody
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("/staffall.do")
    public List<Staff> findAllStaff(){
        System.out.println("进入Staff controller");
        List<Staff> arr = staffService.findAllStaff();
        System.out.println("查询到员工"+arr);
        return arr;
    }

}