package com.qfedu.controller;

import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/20.
 */
@Controller
public class DepartController {

    @Autowired(required = false)
    private DepartService departService;

    @RequestMapping("departall")
    @ResponseBody
    public List<Depart> findDepart(){
        List<Depart> departList = departService.findDepart();
        return departList;
    }

    @RequestMapping("departpage.do")
    @ResponseBody
    public Map<String,Object> findByPage(Integer page, Integer limit){
        Map<String, Object> byPage = departService.findByPage(page, limit);
        return byPage;
    }
    //添加操作
    @RequestMapping("departadd.do")
    public  String addDepart(Depart depart){
        System.out.println("<<<<<<<<<<>>>>>>"+depart);
        departService.addepart(depart);
        return "redirect:/departlist.html";
    }
    //修改操作
    @RequestMapping("departupdate.do")
    public  String updateDepart(Depart depart){
        departService.updateDpart(depart);
        return "redirect:/departlist.html";
    }

    //删除操作
    @RequestMapping("departdelete.do")
    public  JsonBean deleteById(Integer id){
        departService.deleteById(id);
        return new JsonBean(1,null);
    }
}