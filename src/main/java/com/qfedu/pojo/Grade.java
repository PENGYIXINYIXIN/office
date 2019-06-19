package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by PENGYIXIN on 2019/6/15.
 * 班级实体
 */
public class Grade {
    private Integer id ;
    private String name;
    private Integer flag;
    private Integer week;
    private String  createdate;
    private String location;
    private Integer cid;



    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }


    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", week=" + week +
                ", createdate='" + createdate + '\'' +
                ", location='" + location + '\'' +
                ", cid=" + cid +
                '}';
    }
}