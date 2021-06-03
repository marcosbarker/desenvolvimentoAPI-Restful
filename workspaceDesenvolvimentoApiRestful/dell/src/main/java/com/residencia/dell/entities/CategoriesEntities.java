package com.residencia.dell.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "categories", schema = "public", catalog = "dell")
public class CategoriesEntities {
    private Integer category;
    private String categoryname;

    @Id
    @Column(name = "category")
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Basic
    @Column(name = "categoryname")
    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesEntities that = (CategoriesEntities) o;
        return Objects.equals(category, that.category) && Objects.equals(categoryname, that.categoryname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, categoryname);
    }
}
