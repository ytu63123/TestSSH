package com.lab.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "sno")
    private String sno;

    @Column
    private String sname;

    @Column
    private String sbday;

    @Column
    private Integer ssex;

    @Column
    private String smail;

    @Column
    private String spwd;

    public Student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }



    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSbday() {
        return sbday;
    }

    public void setSbday(String sbday) {
        this.sbday = sbday;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    @Override
    public String toString() {
        return "Student{" + "sno=" + sno + ", sname=" + sname + ", sbday=" + sbday + ", ssex=" + ssex + ", smail=" + smail + ", spwd=" + spwd + '}';
    }

}
