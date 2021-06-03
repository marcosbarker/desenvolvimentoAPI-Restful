package com.residencia.dell.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "customers", schema = "public", catalog = "dell")
public class CustomersEntities {
    private Integer customerid;
    private String firstname;
    private String lastname;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private Integer zip;
    private String country;
    private Short region;
    private String email;
    private String phone;
    private Integer creditcardtype;
    private String creditcard;
    private String creditcardexpiration;
    private String username;
    private String password;
    private Short age;
    private Integer income;
    private String gender;
    private Collection<CustHistEntities> custHistsByCustomerid;
    private Collection<OrdersEntities> ordersByCustomerid;

    @Id
    @Column(name = "customerid")
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "zip")
    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "region")
    public Short getRegion() {
        return region;
    }

    public void setRegion(Short region) {
        this.region = region;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "creditcardtype")
    public Integer getCreditcardtype() {
        return creditcardtype;
    }

    public void setCreditcardtype(Integer creditcardtype) {
        this.creditcardtype = creditcardtype;
    }

    @Basic
    @Column(name = "creditcard")
    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    @Basic
    @Column(name = "creditcardexpiration")
    public String getCreditcardexpiration() {
        return creditcardexpiration;
    }

    public void setCreditcardexpiration(String creditcardexpiration) {
        this.creditcardexpiration = creditcardexpiration;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "age")
    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    @Basic
    @Column(name = "income")
    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersEntities that = (CustomersEntities) o;
        return Objects.equals(customerid, that.customerid) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(address1, that.address1) && Objects.equals(address2, that.address2) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(zip, that.zip) && Objects.equals(country, that.country) && Objects.equals(region, that.region) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(creditcardtype, that.creditcardtype) && Objects.equals(creditcard, that.creditcard) && Objects.equals(creditcardexpiration, that.creditcardexpiration) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(age, that.age) && Objects.equals(income, that.income) && Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerid, firstname, lastname, address1, address2, city, state, zip, country, region, email, phone, creditcardtype, creditcard, creditcardexpiration, username, password, age, income, gender);
    }

    @OneToMany(mappedBy = "customersByCustomerid")
    public Collection<CustHistEntities> getCustHistsByCustomerid() {
        return custHistsByCustomerid;
    }

    public void setCustHistsByCustomerid(Collection<CustHistEntities> custHistsByCustomerid) {
        this.custHistsByCustomerid = custHistsByCustomerid;
    }

    @OneToMany(mappedBy = "customersByCustomerid")
    public Collection<OrdersEntities> getOrdersByCustomerid() {
        return ordersByCustomerid;
    }

    public void setOrdersByCustomerid(Collection<OrdersEntities> ordersByCustomerid) {
        this.ordersByCustomerid = ordersByCustomerid;
    }
}
