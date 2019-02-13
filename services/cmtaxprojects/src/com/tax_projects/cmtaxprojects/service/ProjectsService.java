/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.tax_projects.cmtaxprojects.Projects;
import com.tax_projects.cmtaxprojects.Workflowlog;

/**
 * Service object for domain model class {@link Projects}.
 */
public interface ProjectsService {

    /**
     * Creates a new Projects. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Projects if any.
     *
     * @param projects Details of the Projects to be created; value cannot be null.
     * @return The newly created Projects.
     */
    Projects create(@Valid Projects projects);


	/**
     * Returns Projects by given id if exists.
     *
     * @param projectsId The id of the Projects to get; value cannot be null.
     * @return Projects associated with the given projectsId.
	 * @throws EntityNotFoundException If no Projects is found.
     */
    Projects getById(Integer projectsId);

    /**
     * Find and return the Projects by given id if exists, returns null otherwise.
     *
     * @param projectsId The id of the Projects to get; value cannot be null.
     * @return Projects associated with the given projectsId.
     */
    Projects findById(Integer projectsId);

	/**
     * Find and return the list of Projects by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param projectsIds The id's of the Projects to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Projects associated with the given projectsIds.
     */
    List<Projects> findByMultipleIds(List<Integer> projectsIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Projects. It replaces all fields of the existing Projects with the given projects.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Projects if any.
     *
     * @param projects The details of the Projects to be updated; value cannot be null.
     * @return The updated Projects.
     * @throws EntityNotFoundException if no Projects is found with given input.
     */
    Projects update(@Valid Projects projects);

    /**
     * Deletes an existing Projects with the given id.
     *
     * @param projectsId The id of the Projects to be deleted; value cannot be null.
     * @return The deleted Projects.
     * @throws EntityNotFoundException if no Projects found with the given id.
     */
    Projects delete(Integer projectsId);

    /**
     * Deletes an existing Projects with the given object.
     *
     * @param projects The instance of the Projects to be deleted; value cannot be null.
     */
    void delete(Projects projects);

    /**
     * Find all Projects matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Projects.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Projects> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Projects matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Projects.
     *
     * @see Pageable
     * @see Page
     */
    Page<Projects> findAll(String query, Pageable pageable);

    /**
     * Exports all Projects matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Projects matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Projects in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Projects.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated workflowlogs for given Projects id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Workflowlog instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Workflowlog> findAssociatedWorkflowlogs(Integer id, Pageable pageable);

}