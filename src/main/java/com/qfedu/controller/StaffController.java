package com.qfedu.controller;

import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.utils.UploadUtils;
import com.qfedu.vo.JsonBean;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/17.
 */
@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("/staffall.do")
    @ResponseBody
    public List<Staff> findAllStaff(){
        System.out.println("进入Staff controller");
        List<Staff> arr = staffService.findAllStaff();
        System.out.println("查询到员工"+arr);
        return arr;
    }

    //分页查询员工
    @RequestMapping("staffpage.do")
    @ResponseBody
    public Map<String,Object> findByPage(Integer page, Integer limit){
        Map<String, Object> map = staffService.findByPage(page, limit);
        return map;
    }

    @RequestMapping("staffdelete.do")
    @ResponseBody
    public JsonBean deleteById(String no){
        staffService.deleteById(no);
        return new JsonBean(1,null);
    }

    @RequestMapping("staffadd.do")
    public String addStaff(Staff staff){
        staffService.addStaff(staff);
        return  "redirect:/stafflist.html";
    }
    @RequestMapping("/photoupload.do")
    @ResponseBody
    public JsonBean uploadPhoto(MultipartFile file ){

        UploadUtils upload = new UploadUtils();
        String path = upload.getPath();
        String s = upload.upload(file); //
        String msg = path+"/"+s;
        return new JsonBean(1000,msg);
    }


}