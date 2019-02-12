/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class CmtaxprojectsProcedureExecutorServiceImpl implements CmtaxprojectsProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmtaxprojectsProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("cmtaxprojectsWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}