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
import com.tax_projects.cmtaxprojects.Workstatus;

/**
 * Service object for domain model class {@link Workstatus}.
 */
public interface WorkstatusService {

    /**
     * Creates a new Workstatus. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Workstatus if any.
     *
     * @param workstatus Details of the Workstatus to be created; value cannot be null.
     * @return The newly created Workstatus.
     */
    Workstatus create(@Valid Workstatus workstatus);


	/**
     * Returns Workstatus by given id if exists.
     *
     * @param workstatusId The id of the Workstatus to get; value cannot be null.
     * @return Workstatus associated with the given workstatusId.
	 * @throws EntityNotFoundException If no Workstatus is found.
     */
    Workstatus getById(Integer workstatusId);

    /**
     * Find and return the Workstatus by given id if exists, returns null otherwise.
     *
     * @param workstatusId The id of the Workstatus to get; value cannot be null.
     * @return Workstatus associated with the given workstatusId.
     */
    Workstatus findById(Integer workstatusId);

	/**
     * Find and return the list of Workstatuses by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param workstatusIds The id's of the Workstatus to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Workstatuses associated with the given workstatusIds.
     */
    List<Workstatus> findByMultipleIds(List<Integer> workstatusIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Workstatus. It replaces all fields of the existing Workstatus with the given workstatus.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Workstatus if any.
     *
     * @param workstatus The details of the Workstatus to be updated; value cannot be null.
     * @return The updated Workstatus.
     * @throws EntityNotFoundException if no Workstatus is found with given input.
     */
    Workstatus update(@Valid Workstatus workstatus);

    /**
     * Deletes an existing Workstatus with the given id.
     *
     * @param workstatusId The id of the Workstatus to be deleted; value cannot be null.
     * @return The deleted Workstatus.
     * @throws EntityNotFoundException if no Workstatus found with the given id.
     */
    Workstatus delete(Integer workstatusId);

    /**
     * Deletes an existing Workstatus with the given object.
     *
     * @param workstatus The instance of the Workstatus to be deleted; value cannot be null.
     */
    void delete(Workstatus workstatus);

    /**
     * Find all Workstatuses matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Workstatuses.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Workstatus> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Workstatuses matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Workstatuses.
     *
     * @see Pageable
     * @see Page
     */
    Page<Workstatus> findAll(String query, Pageable pageable);

    /**
     * Exports all Workstatuses matching the given input query to the given exportType format.
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
     * Exports all Workstatuses matching the given input query to the given exportType format.
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
     * Retrieve the count of the Workstatuses in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Workstatus.
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
     * Returns the associated projectses for given Workstatus id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Projects instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Projects> findAssociatedProjectses(Integer id, Pageable pageable);

}