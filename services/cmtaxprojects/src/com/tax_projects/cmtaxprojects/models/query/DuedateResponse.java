/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class DuedateResponse implements Serializable {


    @ColumnAlias("DUEDATE")
    private Date duedate;

    public Date getDuedate() {
        return this.duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DuedateResponse)) return false;
        final DuedateResponse duedateResponse = (DuedateResponse) o;
        return Objects.equals(getDuedate(), duedateResponse.getDuedate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDuedate());
    }
}