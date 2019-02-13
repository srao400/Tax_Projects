/*Copyright (c) 2018-2019 rubaya.io All Rights Reserved.
 This software is the confidential and proprietary information of rubaya.io You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with rubaya.io*/
package com.tax_projects.cmtaxprojects.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.tax_projects.cmtaxprojects.Clients;
import com.tax_projects.cmtaxprojects.Projects;
import com.tax_projects.cmtaxprojects.Workflowlog;
import com.tax_projects.cmtaxprojects.service.ClientsService;


/**
 * Controller object for domain model class Clients.
 * @see Clients
 */
@RestController("cmtaxprojects.ClientsController")
@Api(value = "ClientsController", description = "Exposes APIs to work with Clients resource.")
@RequestMapping("/cmtaxprojects/Clients")
public class ClientsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientsController.class);

    @Autowired
	@Qualifier("cmtaxprojects.ClientsService")
	private ClientsService clientsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Clients instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Clients createClients(@RequestBody Clients clients) {
		LOGGER.debug("Create Clients with information: {}" , clients);

		clients = clientsService.create(clients);
		LOGGER.debug("Created Clients with information: {}" , clients);

	    return clients;
	}

    @ApiOperation(value = "Returns the Clients instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Clients getClients(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Clients with id: {}" , id);

        Clients foundClients = clientsService.getById(id);
        LOGGER.debug("Clients details with id: {}" , foundClients);

        return foundClients;
    }

    @ApiOperation(value = "Updates the Clients instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Clients editClients(@PathVariable("id") Integer id, @RequestBody Clients clients) {
        LOGGER.debug("Editing Clients with id: {}" , clients.getId());

        clients.setId(id);
        clients = clientsService.update(clients);
        LOGGER.debug("Clients details with id: {}" , clients);

        return clients;
    }

    @ApiOperation(value = "Deletes the Clients instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteClients(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Clients with id: {}" , id);

        Clients deletedClients = clientsService.delete(id);

        return deletedClients != null;
    }

    /**
     * @deprecated Use {@link #findClients(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Clients instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Clients> searchClientsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Clients list by query filter:{}", (Object) queryFilters);
        return clientsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Clients instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Clients> findClients(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Clients list by filter:", query);
        return clientsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Clients instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Clients> filterClients(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Clients list by filter", query);
        return clientsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportClients(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return clientsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportClientsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Clients.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> clientsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Clients instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countClients( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Clients");
		return clientsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getClientsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return clientsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/projectses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the projectses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Projects> findAssociatedProjectses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated projectses");
        return clientsService.findAssociatedProjectses(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/workflowlogs", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the workflowlogs instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Workflowlog> findAssociatedWorkflowlogs(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated workflowlogs");
        return clientsService.findAssociatedWorkflowlogs(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ClientsService instance
	 */
	protected void setClientsService(ClientsService service) {
		this.clientsService = service;
	}

}