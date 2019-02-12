/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.tax_projects.cmtaxprojects.Workstatus;

/**
 * Specifies methods used to obtain and modify Workstatus related information
 * which is stored in the database.
 */
@Repository("cmtaxprojects.WorkstatusDao")
public class WorkstatusDao extends WMGenericDaoImpl<Workstatus, Integer> {

    @Autowired
    @Qualifier("cmtaxprojectsTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}