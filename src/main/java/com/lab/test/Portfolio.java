package com.lab.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "investor_id",referencedColumnName = "id")
    @JsonIgnoreProperties("portfolios")
    private Investor investor;
    
    @ManyToMany(mappedBy = "portfolios")
     @JsonIgnoreProperties("portfolios")
    private Set<TStock> tStocks=new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Set<TStock> gettStocks() {
        return tStocks;
    }

    public void settStocks(Set<TStock> tStocks) {
        this.tStocks = tStocks;
    }

    @Override
    public String toString() {
        return "Portfolio{" + "id=" + id + ", name=" + name + ", investor=" + investor + ", tStocks=" + tStocks + '}';
    }
    
    
    
    
}
