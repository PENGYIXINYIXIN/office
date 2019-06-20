package com.qfedu.vo;

import com.qfedu.pojo.Depart;

/**
 * Created by PENGYIXIN on 2019/6/20.
 */
public class DepartVo extends Depart {
    private  int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DepartVo{" +
                "count=" + count +
                '}';
    }
}