package com.qfedu.pojo;

import java.util.List;

/**
 * Created by 86186 on 2019/6/17.
 */
public class UserMenu {
    private Integer id;
    private String icon;
    private String aurl;
    private String title;
    private List<UserMenu> childs;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAurl() {
        return aurl;
    }

    public void setAurl(String aurl) {
        this.aurl = aurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<UserMenu> getChilds() {
        return childs;
    }

    public void setChilds(List<UserMenu> childs) {
        this.childs = childs;
    }

    @Override
    public String toString() {
        return "UserMenu{" +
                "id=" + id +
                ", icon='" + icon + '\'' +
                ", aurl='" + aurl + '\'' +
                ", title='" + title + '\'' +
                ", menuList=" + childs +
                '}';
    }
}
