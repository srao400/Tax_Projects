/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.model.QueryProcedureInput;

import com.tax_projects.cmtaxprojects.models.query.*;

@Service
public class CmtaxprojectsQueryExecutorServiceImpl implements CmtaxprojectsQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmtaxprojectsQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("cmtaxprojectsWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<ProjectListResponse> executeProjectList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("projectList", params, ProjectListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportProjectList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("projectList", params, ProjectListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<UsersListResponse> executeUsersList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("usersList", params, UsersListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportUsersList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("usersList", params, UsersListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<PreparersListResponse> executePreparersList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("preparersList", params, PreparersListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportPreparersList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("preparersList", params, PreparersListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<RolesListResponse> executeRolesList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("rolesList", params, RolesListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportRolesList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("rolesList", params, RolesListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<StatusListResponse> executeStatusList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("statusList", params, StatusListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportStatusList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("statusList", params, StatusListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<DispatcherListResponse> executeDispatcherList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("dispatcherList", params, DispatcherListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportDispatcherList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("dispatcherList", params, DispatcherListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<PartnersListResponse> executePartnersList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("partnersList", params, PartnersListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportPartnersList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("partnersList", params, PartnersListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<ReviewersListResponse> executeReviewersList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("reviewersList", params, ReviewersListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportReviewersList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("reviewersList", params, ReviewersListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", readOnly = true)
    @Override
    public Page<ClientsListResponse> executeClientsList(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("clientsList", params, ClientsListResponse.class, pageable);
    }

    @Transactional(value = "cmtaxprojectsTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportClientsList(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("clientsList", params, ClientsListResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

}