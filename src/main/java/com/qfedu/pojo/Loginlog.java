package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by PENGYIXIN on 2019/6/14.
 * 登录日志
 */
public class Loginlog {
    private Integer id ;
    private  String ip;
    private  String no;
    private  Date createtime;
    private  String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Loginlog{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", no='" + no + '\'' +
                ", createtime=" + createtime +
                ", location='" + location + '\'' +
                '}';
    }
}