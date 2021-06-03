package com.residencia.dell.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "inventory", schema = "public", catalog = "dell")
public class InventoryEntities {
    private Integer prodId;
    private Integer quanInStock;
    private Integer sales;

    @Id
    @Column(name = "prod_id")
    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    @Basic
    @Column(name = "quan_in_stock")
    public Integer getQuanInStock() {
        return quanInStock;
    }

    public void setQuanInStock(Integer quanInStock) {
        this.quanInStock = quanInStock;
    }

    @Basic
    @Column(name = "sales")
    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryEntities that = (InventoryEntities) o;
        return Objects.equals(prodId, that.prodId) && Objects.equals(quanInStock, that.quanInStock) && Objects.equals(sales, that.sales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, quanInStock, sales);
    }
}
