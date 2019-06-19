package com.qfedu.vo;

import com.qfedu.pojo.Grade;

/**
 * Created by PENGYIXIN on 2019/6/19.
 */
public class GradeVo  extends Grade {
    private  String cname;
    private  int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCname() {

        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}