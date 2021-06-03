package com.residencia.dell.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "reorder", schema = "public", catalog = "dell")
public class ReorderEntities {
    private Integer prodId;
    private Date dateLow;
    private Integer quanLow;
    private Date dateReordered;
    private Integer quanReordered;
    private Date dateExpected;

    @Basic
    @Column(name = "prod_id")
    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    @Basic
    @Column(name = "date_low")
    public Date getDateLow() {
        return dateLow;
    }

    public void setDateLow(Date dateLow) {
        this.dateLow = dateLow;
    }

    @Basic
    @Column(name = "quan_low")
    public Integer getQuanLow() {
        return quanLow;
    }

    public void setQuanLow(Integer quanLow) {
        this.quanLow = quanLow;
    }

    @Basic
    @Column(name = "date_reordered")
    public Date getDateReordered() {
        return dateReordered;
    }

    public void setDateReordered(Date dateReordered) {
        this.dateReordered = dateReordered;
    }

    @Basic
    @Column(name = "quan_reordered")
    public Integer getQuanReordered() {
        return quanReordered;
    }

    public void setQuanReordered(Integer quanReordered) {
        this.quanReordered = quanReordered;
    }

    @Basic
    @Column(name = "date_expected")
    public Date getDateExpected() {
        return dateExpected;
    }

    public void setDateExpected(Date dateExpected) {
        this.dateExpected = dateExpected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReorderEntities that = (ReorderEntities) o;
        return Objects.equals(prodId, that.prodId) && Objects.equals(dateLow, that.dateLow) && Objects.equals(quanLow, that.quanLow) && Objects.equals(dateReordered, that.dateReordered) && Objects.equals(quanReordered, that.quanReordered) && Objects.equals(dateExpected, that.dateExpected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, dateLow, quanLow, dateReordered, quanReordered, dateExpected);
    }
}
