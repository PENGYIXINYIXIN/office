package com.qfedu.vo;

import com.qfedu.pojo.Course;

/**
 * Created by PENGYIXIN on 2019/6/19.
 */
public class CourseVo extends Course {
    private String typename;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}