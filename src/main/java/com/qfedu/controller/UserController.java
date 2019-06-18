package com.qfedu.controller;

import com.qfedu.pojo.UserMenu;
import com.qfedu.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 86186 on 2019/6/14.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login.do")
    public String login(Model model,String no, String password){
        System.out.println(password);
        UsernamePasswordToken token=new UsernamePasswordToken(no,password);

        Subject subject= SecurityUtils.getSubject();
        try {
            subject.login(token);
            System.out.println("+++++++++++++++=");
            model.addAttribute("no",no);

            return "redirect:/index.jsp";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }
    @ResponseBody
    @RequestMapping("/usermenu.do")
    public List usermenu(String no){

        System.out.println("++++++++++++++++"+no);
       List<UserMenu> list=userService.findMenu(no);
        System.out.println(list);
        return list;
    }
}
