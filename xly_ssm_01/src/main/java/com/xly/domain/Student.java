package com.xly.domain;

import org.springframework.stereotype.Repository;

import java.util.Date;

public class Student {
    private Integer sid;
    private String sname;
    private Date sage;
    private String ssex;
    private Integer price;

    public Student() {
    }

    public Student(Integer sid, String sname, Date sage, String ssex) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSage() {
        return sage;
    }

    public void setSage(Date sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                ", price=" + price +
                '}';
    }
}
