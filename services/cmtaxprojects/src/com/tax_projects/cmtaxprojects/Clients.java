/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clients generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`clients`")
public class Clients implements Serializable {

    private Integer id;
    private String clientname;
    private String displayname;
    private String addressline1;
    private String addressline2;
    private String city;
    private String province;
    private String postalcode;
    private String country;
    private String phone;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`clientname`", nullable = true, length = 255)
    public String getClientname() {
        return this.clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    @Column(name = "`displayname`", nullable = true, length = 255)
    public String getDisplayname() {
        return this.displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    @Column(name = "`addressline1`", nullable = true, length = 255)
    public String getAddressline1() {
        return this.addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    @Column(name = "`addressline2`", nullable = true, length = 255)
    public String getAddressline2() {
        return this.addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    @Column(name = "`city`", nullable = true, length = 255)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "`province`", nullable = true, length = 255)
    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "`postalcode`", nullable = true, length = 255)
    public String getPostalcode() {
        return this.postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Column(name = "`country`", nullable = true, length = 255)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "`phone`", nullable = true, length = 255)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "`email`", nullable = true, length = 254)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clients)) return false;
        final Clients clients = (Clients) o;
        return Objects.equals(getId(), clients.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}