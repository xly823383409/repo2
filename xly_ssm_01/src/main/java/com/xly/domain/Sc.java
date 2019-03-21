package com.xly.domain;

public class Sc {
    private Integer sno;
    private Integer cno;
    private Double  score;

    public Sc() {
    }

    public Sc(Integer sno, Integer cno, Double score) {
        this.sno = sno;
        this.cno = cno;
        this.score = score;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sc{" +
                "sno=" + sno +
                ", cno=" + cno +
                ", score=" + score +
                '}';
    }
}
