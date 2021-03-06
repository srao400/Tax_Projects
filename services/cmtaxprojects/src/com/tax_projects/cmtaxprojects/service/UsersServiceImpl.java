/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.tax_projects.cmtaxprojects.Projects;
import com.tax_projects.cmtaxprojects.Users;


/**
 * ServiceImpl object for domain model class Users.
 *
 * @see Users
 */
@Service("cmtaxprojects.UsersService")
@Validated
public class UsersServiceImpl implements UsersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);

    @Lazy
    @Autowired
    @Qualifier("cmtaxprojects.ProjectsService")
    private ProjectsService projectsService;

    @Autowired
    @Qualifier("cmtaxprojects.UsersDao")
    private WMGenericDao<Users, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Users, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "cmtaxprojectsTransactionManager")
    @Override
    public Users create(Users users) {
        LOGGER.debug("Creating a new Users with information: {}", users);

        Users usersCreated = this.wmGenericDao.create(users);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(usersCreated);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Users getById(Integer usersId) {
        LOGGER.debug("Finding Users by id: {}", usersId);
        return this.wmGenericDao.findById(usersId);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Users findById(Integer usersId) {
        LOGGER.debug("Finding Users by id: {}", usersId);
        try {
            return this.wmGenericDao.findById(usersId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Users found with id: {}", usersId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public List<Users> findByMultipleIds(List<Integer> usersIds, boolean orderedReturn) {
        LOGGER.debug("Finding Users by ids: {}", usersIds);

        return this.wmGenericDao.findByMultipleIds(usersIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "cmtaxprojectsTransactionManager")
    @Override
    public Users update(Users users) {
        LOGGER.debug("Updating Users with information: {}", users);

        this.wmGenericDao.update(users);
        this.wmGenericDao.refresh(users);

        return users;
    }

    @Transactional(value = "cmtaxprojectsTransactionManager")
    @Override
    public Users delete(Integer usersId) {
        LOGGER.debug("Deleting Users with id: {}", usersId);
        Users deleted = this.wmGenericDao.findById(usersId);
        if (deleted == null) {
            LOGGER.debug("No Users found with id: {}", usersId);
            throw new EntityNotFoundException(String.valueOf(usersId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "cmtaxprojectsTransactionManager")
    @Override
    public void delete(Users users) {
        LOGGER.debug("Deleting Users with {}", users);
        this.wmGenericDao.delete(users);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Users> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Users");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Users> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Users");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service cmtaxprojects for table Users to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service cmtaxprojects for table Users to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Projects> findAssociatedProjectsesForReviewerid(Integer id, Pageable pageable) {
        LOGGER.debug("Fetching all associated projectsesForReviewerid");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("usersByReviewerid.id = '" + id + "'");

        return projectsService.findAll(queryBuilder.toString(), pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Projects> findAssociatedProjectsesForPreparerid(Integer id, Pageable pageable) {
        LOGGER.debug("Fetching all associated projectsesForPreparerid");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("usersByPreparerid.id = '" + id + "'");

        return projectsService.findAll(queryBuilder.toString(), pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Projects> findAssociatedProjectsesForPartnerid(Integer id, Pageable pageable) {
        LOGGER.debug("Fetching all associated projectsesForPartnerid");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("usersByPartnerid.id = '" + id + "'");

        return projectsService.findAll(queryBuilder.toString(), pageable);
    }

    @Transactional(readOnly = true, value = "cmtaxprojectsTransactionManager")
    @Override
    public Page<Projects> findAssociatedProjectsesForDispatcherid(Integer id, Pageable pageable) {
        LOGGER.debug("Fetching all associated projectsesForDispatcherid");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("usersByDispatcherid.id = '" + id + "'");

        return projectsService.findAll(queryBuilder.toString(), pageable);
    }

    /**
     * This setter method should only be used by unit tests
     *
     * @param service ProjectsService instance
     */
    protected void setProjectsService(ProjectsService service) {
        this.projectsService = service;
    }

}