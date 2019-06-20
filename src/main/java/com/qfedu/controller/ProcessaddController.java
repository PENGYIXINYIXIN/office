package com.qfedu.controller;

import com.qfedu.pojo.Process;
import com.qfedu.service.ProcessService;
import com.qfedu.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by 86186 on 2019/6/20.
 */
@Controller
public class ProcessaddController {
    @Autowired
    private UserService userService;
    @Autowired
    private ProcessService processService;

    @RequestMapping("/processadd.do")
    public String processadd(Process process){
        String startno=(String) SecurityUtils.getSubject().getPrincipal();
        String startname=userService.selectUserName(startno);
        Random random=new Random();
        Integer i=random.nextInt(1000);
        process.setStartname(startname);
        process.setStartno(startno);
        process.setPid(i);
        process.setFlag(1);
        System.out.println(process);
        processService.processadd(process);
        return "redirect:/suc.html";
    }
    @ResponseBody
    @RequestMapping("/processnolist.do")
    public Map<String,Object> processnolist(Integer page,Integer limit){
        String startno=(String) SecurityUtils.getSubject().getPrincipal();
        Integer checkId=userService.findUserId(startno);
       return processService.processnolist(page,limit,checkId);
    }
    @ResponseBody
    @RequestMapping("/processupdate.do")
    public Map<String,Object> processupdate(Integer id,Integer flag){
        Map map=new HashMap();
        map.put("id",id);
        map.put("flag",flag);
        return processService.processupdate(map);
    }
    @ResponseBody
    @RequestMapping("/processlist.do")
    public Map<String,Object> processlist(Integer page,Integer limit) {
        String startno = (String) SecurityUtils.getSubject().getPrincipal();

        return processService.processlist(page, limit, startno);
    }
    @ResponseBody
    @RequestMapping("/processdel.do")
    public Map<String,Object> processdel(Integer id) {


        return processService.processdel(id);
    }
}
