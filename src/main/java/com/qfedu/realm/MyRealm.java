package com.qfedu.realm;

import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

/**
 * Created by 86186 on 2019/6/14.
 */
public class MyRealm extends AuthorizingRealm {
    //获取授权信息
    @Autowired
    private UserDao userDao;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取登录后的合法用户名
        String name=(String) principals.getPrimaryPrincipal();
        //从数据库中获取用户的角色和权限列表
        List<String> roles=userDao.findRolesByName(name);
        List<String> perms=userDao.findAuthorityByName(name);
        System.out.println("========"+perms);
        //获取信息对象
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.setRoles(new HashSet<>(roles));
        info.setStringPermissions(new HashSet<>(perms));

        return info;
    }
//获取认证信息

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //从token中获取用户名
        String name =(String) token.getPrincipal();
        System.out.println(name);
        //从数据库查询用户数据
        User user=userDao.findByName(name);
        System.out.println("++++++++++"+user);
        //保存合法认证信息的对象
        SimpleAuthenticationInfo info=null;
        if(user==null){
           info=new SimpleAuthenticationInfo(null,null,this.getName());
        }else{
            //参数1用户名
            //参数2合法密码
            //参数3 realm的名称
            System.out.println("保存账号密码");
            System.out.println(user.getPassword());
            info=new SimpleAuthenticationInfo(name,user.getPassword(),this.getName());
            System.out.println("info++++++++++++"+info);
        }

        return info;
    }
}
