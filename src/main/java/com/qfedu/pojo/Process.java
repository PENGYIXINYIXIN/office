package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by 86186 on 2019/6/20.
 */
public class Process {
    private Integer id;
    private String info;
    private String type;
    private String startname;
    private String startno;
    private String startdate;
    private String enddate;
    private Integer days;
    private Integer pid;
    private Integer flag;
    private Integer checkedId;

    public Integer getCheckedId() {
        return checkedId;
    }

    public void setCheckedId(Integer checkedId) {
        this.checkedId = checkedId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartname() {
        return startname;
    }

    public void setStartname(String startname) {
        this.startname = startname;
    }

    public String getStartno() {
        return startno;
    }

    public void setStartno(String startno) {
        this.startno = startno;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", type='" + type + '\'' +
                ", startname='" + startname + '\'' +
                ", startno='" + startno + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", days=" + days +
                ", pid=" + pid +
                ", flag=" + flag +
                ", checkedId=" + checkedId +
                '}';
    }
}
