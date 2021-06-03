package com.residencia.dell.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cust_hist", schema = "public", catalog = "dell")
public class CustHistEntities {
    private Integer customerid;
    private Integer orderid;
    private Integer prodId;
    private CustomersEntities customersByCustomerid;

    @Basic
    @Column(name = "customerid")
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    @Basic
    @Column(name = "orderid")
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "prod_id")
    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustHistEntities that = (CustHistEntities) o;
        return Objects.equals(customerid, that.customerid) && Objects.equals(orderid, that.orderid) && Objects.equals(prodId, that.prodId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerid, orderid, prodId);
    }

    @ManyToOne
    @JoinColumn(name = "customerid", referencedColumnName = "customerid", nullable = false)
    public CustomersEntities getCustomersByCustomerid() {
        return customersByCustomerid;
    }

    public void setCustomersByCustomerid(CustomersEntities customersByCustomerid) {
        this.customersByCustomerid = customersByCustomerid;
    }
}
