package com.qfedu.vo;

import com.qfedu.pojo.Course;

/**
 * Created by PENGYIXIN on 2019/6/19.
 */
public class CourseVo extends Course {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}