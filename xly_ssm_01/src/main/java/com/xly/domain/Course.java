package com.xly.domain;


public class Course {
    private Integer cid;
    private String cname;
    private Integer tno;

    public Course() {
    }
    public Course(Integer cid, String cname, Integer tno) {
        this.cid = cid;
        this.cname = cname;
        this.tno = tno;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", tno=" + tno +
                '}';
    }



}
