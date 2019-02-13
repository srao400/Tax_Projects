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
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    private Workstatus workstatus;
    private Projects projects;
    private Clients clients;
    private Users users;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`statusid`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_workstatus_TO_workflojH86n`"))
    @Fetch(FetchMode.JOIN)
    public Workstatus getWorkstatus() {
        return this.workstatus;
    }

    public void setWorkstatus(Workstatus workstatus) {
        if(workstatus != null) {
            this.statusid = workstatus.getId();
        }

        this.workstatus = workstatus;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`projectid`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_projects_TO_workflowld94gI`"))
    @Fetch(FetchMode.JOIN)
    public Projects getProjects() {
        return this.projects;
    }

    public void setProjects(Projects projects) {
        if(projects != null) {
            this.projectid = projects.getId();
        }

        this.projects = projects;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`clientid`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_clients_TO_workflowlodRj8m`"))
    @Fetch(FetchMode.JOIN)
    public Clients getClients() {
        return this.clients;
    }

    public void setClients(Clients clients) {
        if(clients != null) {
            this.clientid = clients.getId();
        }

        this.clients = clients;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`notifyid`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_users_TO_workflowlog_OgMgR`"))
    @Fetch(FetchMode.JOIN)
    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        if(users != null) {
            this.notifyid = users.getId();
        }

        this.users = users;
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