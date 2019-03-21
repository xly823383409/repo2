package com.xly.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



public class Teacher {

    private Integer tid;

    private String tname;

    private Student student;

    public Integer getTid() {
        return tid;
    }
    public void setTid(Integer tid) {
        this.tid = tid;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", students=" + student +
                '}';
    }
}
