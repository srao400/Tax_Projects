/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Workstatus generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`workstatus`")
public class Workstatus implements Serializable {

    private Integer id;
    private String status;
    private Integer notifyrole;
    private Integer sequence;
    private Roles roles;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`status`", nullable = true, length = 255)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "`notifyrole`", nullable = true, scale = 0, precision = 10)
    public Integer getNotifyrole() {
        return this.notifyrole;
    }

    public void setNotifyrole(Integer notifyrole) {
        this.notifyrole = notifyrole;
    }

    @Column(name = "`sequence`", nullable = true, scale = 0, precision = 10)
    public Integer getSequence() {
        return this.sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`notifyrole`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_roles_TO_workstatus_IVBGYt`"))
    @Fetch(FetchMode.JOIN)
    public Roles getRoles() {
        return this.roles;
    }

    public void setRoles(Roles roles) {
        if(roles != null) {
            this.notifyrole = roles.getId();
        }

        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workstatus)) return false;
        final Workstatus workstatus = (Workstatus) o;
        return Objects.equals(getId(), workstatus.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}