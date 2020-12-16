package com.lab.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
 
    @Id
    @Column(unique = false)
    private String tno;

    @Column
    private String tname;

    @Column
    private String tbday;

    @Column
    private Integer tsex;

    @Column
    private String tmail;

    @Column
    private String tpwd;

    public Teacher() {
    }

    public Teacher(String tno, String tname, String tbday, Integer tsex, String tmail, String tpwd) {
        this.tno = tno;
        this.tname = tname;
        this.tbday = tbday;
        this.tsex = tsex;
        this.tmail = tmail;
        this.tpwd = tpwd;
    }
    
    

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTbday() {
        return tbday;
    }

    public void setTbday(String tbday) {
        this.tbday = tbday;
    }


    public Integer getTsex() {
        return tsex;
    }

    public void setTsex(Integer tsex) {
        this.tsex = tsex;
    }

    public String getTmail() {
        return tmail;
    }

    public void setTmail(String tmail) {
        this.tmail = tmail;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    @Override
    public String toString() {
        return "Teacher{" + "tno=" + tno + ", tname=" + tname + ", tbday=" + tbday + ", tsex=" + tsex + ", tmail=" + tmail + ", tpwd=" + tpwd + '}';
    }


    
    
}
