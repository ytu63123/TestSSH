package com.lab.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quote")
public class Quote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private Double change;

    @Column
    private Double price;

    @Column
    private Double changeInPercent;

    @Column
    private Date tradeTime;

    @OneToOne(mappedBy = "quote",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = {"quote"})
    private TStock tStock;
    
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

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getChangeInPercent() {
        return changeInPercent;
    }

    public void setChangeInPercent(Double changeInPercent) {
        this.changeInPercent = changeInPercent;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TStock gettStock() {
        return tStock;
    }

    public void settStock(TStock tStock) {
        this.tStock = tStock;
    }

    @Override
    public String toString() {
        return "Quote{" + "id=" + id + ", name=" + name + ", change=" + change + ", price=" + price + ", changeInPercent=" + changeInPercent + ", tradeTime=" + tradeTime + '}';
    }

 

    
}
