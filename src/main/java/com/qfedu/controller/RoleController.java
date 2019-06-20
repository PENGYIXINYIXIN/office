package com.qfedu.controller;

import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/18.
 */
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/roleall")
    public Map<String,Object> findRole(Integer id){
        List<Role> rolelist= roleService.findRole();
        List<String> ridsList=roleService.findRids(id);
        String str="";
        for(int i=0;i<ridsList.size();i++){
            str=str+ridsList.get(i);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("roleList", rolelist);
        map.put("rids",str);
        System.out.println("++++rid集合+++++"+str);
        return map;
    }
    @RequestMapping("/userroleedit.do")
    public Map userroleedit(String rids,String id){
        System.out.println("+++++"+id+"+++++"+rids);

        roleService.deleteRole(id);
        if(rids!=null){
            String roleId[]=rids.split(",");
            for(int i=0;i<roleId.length;i++){
                System.out.println(roleId[i]);
                Map map=new HashMap();
                map.put("uid",id);
                map.put("rid",roleId[i]);
                roleService.insertRole(map);
            }
        }

        Map mmp=new HashMap();
        mmp.put("code",1);
        return mmp;
    }
    @ResponseBody
    @RequestMapping("/rolepage.do")
    public Map<String, Object> getRole(Role role,Integer page,Integer limit){

            System.out.println("++++++++++++++"+role);
            Map map=new HashMap();
            if(role==null){
                map=roleService.getRoleAll(page,limit);
            }else {
                map=roleService.getRoleByUser(page,limit,role);
            }

            return map;
    }
    @RequestMapping("/roleAuthdel.do")
    public Map userdel(Integer id){
        roleService.deleteRoleAuth(id);
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        return map;
    }
}
