/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class RolesListResponse implements Serializable {


    @ColumnAlias("id")
    private Integer id;

    @ColumnAlias("role")
    private String role;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RolesListResponse)) return false;
        final RolesListResponse rolesListResponse = (RolesListResponse) o;
        return Objects.equals(getId(), rolesListResponse.getId()) &&
                Objects.equals(getRole(), rolesListResponse.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getRole());
    }
}