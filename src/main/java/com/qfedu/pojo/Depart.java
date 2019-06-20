package com.qfedu.pojo;

/**
 * Created by PENGYIXIN on 2019/6/20.
 */
public class Depart {
    private  Integer id ;
    private  String name;
    private  String createtime;
    private  Integer flag;

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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


    @Override
    public String toString() {
        return "Depart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime='" + createtime + '\'' +
                ", flag=" + flag +
                '}';
    }
}