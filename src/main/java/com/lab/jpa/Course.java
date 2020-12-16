package com.lab.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(unique = false)
    private String cno;

    @Column
    private String cname;
    
    @Column    
    private String tno;

    public Course() {
    }

    public Course(String cno, String cname, String tno) {
        this.cno = cno;
        this.cname = cname;
        this.tno = tno;
    }
    
    

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }



}
