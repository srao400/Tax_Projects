/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Workflowlog generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`workflowlog`")
@IdClass(WorkflowlogId.class)
public class Workflowlog implements Serializable {

    private Integer clientid;
    private Integer statusid;
    private Integer notifyid;
    private Integer projectid;
    private int id;
    private LocalDateTime notifydate;
    private String username;

    @Id
    @Column(name = "`clientid`", nullable = false, scale = 0, precision = 10)
    public Integer getClientid() {
        return this.clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    @Id
    @Column(name = "`statusid`", nullable = false, scale = 0, precision = 10)
    public Integer getStatusid() {
        return this.statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    @Id
    @Column(name = "`notifyid`", nullable = false, scale = 0, precision = 10)
    public Integer getNotifyid() {
        return this.notifyid;
    }

    public void setNotifyid(Integer notifyid) {
        this.notifyid = notifyid;
    }

    @Id
    @Column(name = "`projectid`", nullable = false, scale = 0, precision = 10)
    public Integer getProjectid() {
        return this.projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    @Column(name = "`ID`", nullable = false, updatable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`notifydate`", nullable = true)
    public LocalDateTime getNotifydate() {
        return this.notifydate;
    }

    public void setNotifydate(LocalDateTime notifydate) {
        this.notifydate = notifydate;
    }

    @Column(name = "`username`", nullable = true, length = 255)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workflowlog)) return false;
        final Workflowlog workflowlog = (Workflowlog) o;
        return Objects.equals(getClientid(), workflowlog.getClientid()) &&
                Objects.equals(getStatusid(), workflowlog.getStatusid()) &&
                Objects.equals(getNotifyid(), workflowlog.getNotifyid()) &&
                Objects.equals(getProjectid(), workflowlog.getProjectid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientid(),
                getStatusid(),
                getNotifyid(),
                getProjectid());
    }
}