package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by PENGYIXIN on 2019/6/14.
 * 学生实体
 */
public class Students {
    private  String no;
    private  String name;
    private  String sex;
    private String birthday;
    private String cardno;
    private String school;
    private String education;
    private Integer gid;
    private Integer flag;
    private String email;
    private  String qq;
    private String phone;
    private String introno;
    private String  createdate;
    private String photo;





    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntrono() {
        return introno;
    }

    public void setIntrono(String introno) {
        this.introno = introno;
    }


    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    @Override
    public String toString() {
        return "Students{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", cardno='" + cardno + '\'' +
                ", school='" + school + '\'' +
                ", education='" + education + '\'' +
                ", gid=" + gid +
                ", flag=" + flag +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", introno='" + introno + '\'' +
                ", createdate='" + createdate + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}