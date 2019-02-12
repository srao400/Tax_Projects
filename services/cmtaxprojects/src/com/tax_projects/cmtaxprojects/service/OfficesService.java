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

import com.tax_projects.cmtaxprojects.Offices;
import com.tax_projects.cmtaxprojects.Projects;

/**
 * Service object for domain model class {@link Offices}.
 */
public interface OfficesService {

    /**
     * Creates a new Offices. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Offices if any.
     *
     * @param offices Details of the Offices to be created; value cannot be null.
     * @return The newly created Offices.
     */
    Offices create(@Valid Offices offices);


	/**
     * Returns Offices by given id if exists.
     *
     * @param officesId The id of the Offices to get; value cannot be null.
     * @return Offices associated with the given officesId.
	 * @throws EntityNotFoundException If no Offices is found.
     */
    Offices getById(Integer officesId);

    /**
     * Find and return the Offices by given id if exists, returns null otherwise.
     *
     * @param officesId The id of the Offices to get; value cannot be null.
     * @return Offices associated with the given officesId.
     */
    Offices findById(Integer officesId);

	/**
     * Find and return the list of Offices by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param officesIds The id's of the Offices to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Offices associated with the given officesIds.
     */
    List<Offices> findByMultipleIds(List<Integer> officesIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Offices. It replaces all fields of the existing Offices with the given offices.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Offices if any.
     *
     * @param offices The details of the Offices to be updated; value cannot be null.
     * @return The updated Offices.
     * @throws EntityNotFoundException if no Offices is found with given input.
     */
    Offices update(@Valid Offices offices);

    /**
     * Deletes an existing Offices with the given id.
     *
     * @param officesId The id of the Offices to be deleted; value cannot be null.
     * @return The deleted Offices.
     * @throws EntityNotFoundException if no Offices found with the given id.
     */
    Offices delete(Integer officesId);

    /**
     * Deletes an existing Offices with the given object.
     *
     * @param offices The instance of the Offices to be deleted; value cannot be null.
     */
    void delete(Offices offices);

    /**
     * Find all Offices matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Offices.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Offices> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Offices matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Offices.
     *
     * @see Pageable
     * @see Page
     */
    Page<Offices> findAll(String query, Pageable pageable);

    /**
     * Exports all Offices matching the given input query to the given exportType format.
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
     * Exports all Offices matching the given input query to the given exportType format.
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
     * Retrieve the count of the Offices in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Offices.
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
     * Returns the associated projectses for given Offices id.
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