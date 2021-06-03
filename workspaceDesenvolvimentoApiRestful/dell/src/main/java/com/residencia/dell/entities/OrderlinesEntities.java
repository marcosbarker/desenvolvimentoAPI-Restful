package com.residencia.dell.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "orderlines", schema = "public", catalog = "dell")
public class OrderlinesEntities {
    private Integer orderlineid;
    private Integer orderid;
    private Integer prodId;
    private Short quantity;
    private Date orderdate;
    private OrdersEntities ordersByOrderid;

    @Basic
    @Column(name = "orderlineid")
    public Integer getOrderlineid() {
        return orderlineid;
    }

    public void setOrderlineid(Integer orderlineid) {
        this.orderlineid = orderlineid;
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

    @Basic
    @Column(name = "quantity")
    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "orderdate")
    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderlinesEntities that = (OrderlinesEntities) o;
        return Objects.equals(orderlineid, that.orderlineid) && Objects.equals(orderid, that.orderid) && Objects.equals(prodId, that.prodId) && Objects.equals(quantity, that.quantity) && Objects.equals(orderdate, that.orderdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderlineid, orderid, prodId, quantity, orderdate);
    }

    @ManyToOne
    @JoinColumn(name = "orderid", referencedColumnName = "orderid", nullable = false)
    public OrdersEntities getOrdersByOrderid() {
        return ordersByOrderid;
    }

    public void setOrdersByOrderid(OrdersEntities ordersByOrderid) {
        this.ordersByOrderid = ordersByOrderid;
    }
}
