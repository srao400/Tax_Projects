/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProjectListResponse implements Serializable {


    @ColumnAlias("receiveddate")
    private Date receiveddate;

    @ColumnAlias("completeddate")
    private Date completeddate;

    @ColumnAlias("fees")
    private Double fees;

    @ColumnAlias("preparer")
    private String preparer;

    @ColumnAlias("reviewer")
    private String reviewer;

    @ColumnAlias("partner")
    private String partner;

    @ColumnAlias("user")
    private String user;

    @ColumnAlias("status")
    private String status;

    @ColumnAlias("clientname")
    private String clientname;

    @ColumnAlias("displayname")
    private String displayname;

    @ColumnAlias("officename")
    private String officename;

    public Date getReceiveddate() {
        return this.receiveddate;
    }

    public void setReceiveddate(Date receiveddate) {
        this.receiveddate = receiveddate;
    }

    public Date getCompleteddate() {
        return this.completeddate;
    }

    public void setCompleteddate(Date completeddate) {
        this.completeddate = completeddate;
    }

    public Double getFees() {
        return this.fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public String getPreparer() {
        return this.preparer;
    }

    public void setPreparer(String preparer) {
        this.preparer = preparer;
    }

    public String getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getPartner() {
        return this.partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientname() {
        return this.clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getDisplayname() {
        return this.displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getOfficename() {
        return this.officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectListResponse)) return false;
        final ProjectListResponse projectListResponse = (ProjectListResponse) o;
        return Objects.equals(getReceiveddate(), projectListResponse.getReceiveddate()) &&
                Objects.equals(getCompleteddate(), projectListResponse.getCompleteddate()) &&
                Objects.equals(getFees(), projectListResponse.getFees()) &&
                Objects.equals(getPreparer(), projectListResponse.getPreparer()) &&
                Objects.equals(getReviewer(), projectListResponse.getReviewer()) &&
                Objects.equals(getPartner(), projectListResponse.getPartner()) &&
                Objects.equals(getUser(), projectListResponse.getUser()) &&
                Objects.equals(getStatus(), projectListResponse.getStatus()) &&
                Objects.equals(getClientname(), projectListResponse.getClientname()) &&
                Objects.equals(getDisplayname(), projectListResponse.getDisplayname()) &&
                Objects.equals(getOfficename(), projectListResponse.getOfficename());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReceiveddate(),
                getCompleteddate(),
                getFees(),
                getPreparer(),
                getReviewer(),
                getPartner(),
                getUser(),
                getStatus(),
                getClientname(),
                getDisplayname(),
                getOfficename());
    }
}