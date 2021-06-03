package com.residencia.dell.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "public", catalog = "dell")
public class ProductsEntities {
    private Integer prodId;
    private Integer category;
    private String title;
    private String actor;
    private BigDecimal price;
    private Short special;
    private Integer commonProdId;

    @Id
    @Column(name = "prod_id")
    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    @Basic
    @Column(name = "category")
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "actor")
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "special")
    public Short getSpecial() {
        return special;
    }

    public void setSpecial(Short special) {
        this.special = special;
    }

    @Basic
    @Column(name = "common_prod_id")
    public Integer getCommonProdId() {
        return commonProdId;
    }

    public void setCommonProdId(Integer commonProdId) {
        this.commonProdId = commonProdId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntities that = (ProductsEntities) o;
        return Objects.equals(prodId, that.prodId) && Objects.equals(category, that.category) && Objects.equals(title, that.title) && Objects.equals(actor, that.actor) && Objects.equals(price, that.price) && Objects.equals(special, that.special) && Objects.equals(commonProdId, that.commonProdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, category, title, actor, price, special, commonProdId);
    }
}
