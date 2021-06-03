package com.residencia.dell.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "public", catalog = "dell")
public class OrdersEntities {
    private Integer orderid;
    private Date orderdate;
    private Integer customerid;
    private BigDecimal netamount;
    private BigDecimal tax;
    private BigDecimal totalamount;
    private Collection<OrderlinesEntities> orderlinesByOrderid;
    private CustomersEntities customersByCustomerid;

    @Id
    @Column(name = "orderid")
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "orderdate")
    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @Basic
    @Column(name = "customerid")
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    @Basic
    @Column(name = "netamount")
    public BigDecimal getNetamount() {
        return netamount;
    }

    public void setNetamount(BigDecimal netamount) {
        this.netamount = netamount;
    }

    @Basic
    @Column(name = "tax")
    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @Basic
    @Column(name = "totalamount")
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntities that = (OrdersEntities) o;
        return Objects.equals(orderid, that.orderid) && Objects.equals(orderdate, that.orderdate) && Objects.equals(customerid, that.customerid) && Objects.equals(netamount, that.netamount) && Objects.equals(tax, that.tax) && Objects.equals(totalamount, that.totalamount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderid, orderdate, customerid, netamount, tax, totalamount);
    }

    @OneToMany(mappedBy = "ordersByOrderid")
    public Collection<OrderlinesEntities> getOrderlinesByOrderid() {
        return orderlinesByOrderid;
    }

    public void setOrderlinesByOrderid(Collection<OrderlinesEntities> orderlinesByOrderid) {
        this.orderlinesByOrderid = orderlinesByOrderid;
    }

    @ManyToOne
    @JoinColumn(name = "customerid", referencedColumnName = "customerid")
    public CustomersEntities getCustomersByCustomerid() {
        return customersByCustomerid;
    }

    public void setCustomersByCustomerid(CustomersEntities customersByCustomerid) {
        this.customersByCustomerid = customersByCustomerid;
    }
}
