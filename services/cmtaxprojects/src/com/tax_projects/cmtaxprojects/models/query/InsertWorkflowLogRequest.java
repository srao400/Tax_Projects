/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertWorkflowLogRequest implements Serializable {


    @JsonProperty("statusid")
    @NotNull
    private Integer statusid;

    @JsonProperty("notifyid")
    @NotNull
    private Integer notifyid;

    @JsonProperty("preparerid")
    @NotNull
    private Integer preparerid;

    @JsonProperty("reviewerid")
    @NotNull
    private Integer reviewerid;

    @JsonProperty("partnerid")
    @NotNull
    private Integer partnerid;

    @JsonProperty("dispatcherid")
    @NotNull
    private Integer dispatcherid;

    @JsonProperty("clientid")
    @NotNull
    private Integer clientid;

    @JsonProperty("projectid")
    @NotNull
    private Integer projectid;

    public Integer getStatusid() {
        return this.statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public Integer getNotifyid() {
        return this.notifyid;
    }

    public void setNotifyid(Integer notifyid) {
        this.notifyid = notifyid;
    }

    public Integer getPreparerid() {
        return this.preparerid;
    }

    public void setPreparerid(Integer preparerid) {
        this.preparerid = preparerid;
    }

    public Integer getReviewerid() {
        return this.reviewerid;
    }

    public void setReviewerid(Integer reviewerid) {
        this.reviewerid = reviewerid;
    }

    public Integer getPartnerid() {
        return this.partnerid;
    }

    public void setPartnerid(Integer partnerid) {
        this.partnerid = partnerid;
    }

    public Integer getDispatcherid() {
        return this.dispatcherid;
    }

    public void setDispatcherid(Integer dispatcherid) {
        this.dispatcherid = dispatcherid;
    }

    public Integer getClientid() {
        return this.clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getProjectid() {
        return this.projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsertWorkflowLogRequest)) return false;
        final InsertWorkflowLogRequest insertWorkflowLogRequest = (InsertWorkflowLogRequest) o;
        return Objects.equals(getStatusid(), insertWorkflowLogRequest.getStatusid()) &&
                Objects.equals(getNotifyid(), insertWorkflowLogRequest.getNotifyid()) &&
                Objects.equals(getPreparerid(), insertWorkflowLogRequest.getPreparerid()) &&
                Objects.equals(getReviewerid(), insertWorkflowLogRequest.getReviewerid()) &&
                Objects.equals(getPartnerid(), insertWorkflowLogRequest.getPartnerid()) &&
                Objects.equals(getDispatcherid(), insertWorkflowLogRequest.getDispatcherid()) &&
                Objects.equals(getClientid(), insertWorkflowLogRequest.getClientid()) &&
                Objects.equals(getProjectid(), insertWorkflowLogRequest.getProjectid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatusid(),
                getNotifyid(),
                getPreparerid(),
                getReviewerid(),
                getPartnerid(),
                getDispatcherid(),
                getClientid(),
                getProjectid());
    }
}