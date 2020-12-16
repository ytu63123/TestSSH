package com.lab.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sc")
public class Score {

    @Id
    @Column(unique = false)
    private String sno;

    @Column
    private String cno;

    @Column
    private Integer score;

    public Score() {
    }

    public Score(String sno, String cno, Integer score) {
        this.sno = sno;
        this.cno = cno;
        this.score = score;
    }

    
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Score{" + "sno=" + sno + ", cno=" + cno + ", score=" + score + '}';
    }

}
