/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class DefaultStatusResponse implements Serializable {


    @ColumnAlias("ID")
    private Integer id;

    @ColumnAlias("status")
    private String status;

    @ColumnAlias("notifyrole")
    private Integer notifyrole;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNotifyrole() {
        return this.notifyrole;
    }

    public void setNotifyrole(Integer notifyrole) {
        this.notifyrole = notifyrole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultStatusResponse)) return false;
        final DefaultStatusResponse defaultStatusResponse = (DefaultStatusResponse) o;
        return Objects.equals(getId(), defaultStatusResponse.getId()) &&
                Objects.equals(getStatus(), defaultStatusResponse.getStatus()) &&
                Objects.equals(getNotifyrole(), defaultStatusResponse.getNotifyrole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getStatus(),
                getNotifyrole());
    }
}