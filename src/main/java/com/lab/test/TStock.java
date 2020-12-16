package com.lab.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tstock")
public class TStock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String symbol;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "classify_id", referencedColumnName = "id")
    @JsonIgnoreProperties("tStocks")
    private Classify classify;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tstock_portfolio",
            joinColumns = {
                @JoinColumn(name = "tStock_id",
                        nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                @JoinColumn(name = "portfolio_id",
                        nullable = false, updatable = false)
            }
    )
    @JsonIgnoreProperties("tStocks")
    private Set<Portfolio> portfolios = new LinkedHashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "quote_id",
            foreignKey = @ForeignKey(name = "quote_fk",
                     value = ConstraintMode.CONSTRAINT))
    @JsonIgnoreProperties("tStock")
    private Quote quote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public Set<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(Set<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }


    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "TStock{" + "id=" + id + ", symbol=" + symbol + ", classify=" + classify + ", quote=" + quote + '}';
    }






}
