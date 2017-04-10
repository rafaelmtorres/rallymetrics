package com.adp.portal.rallymetrics.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adp.portal.rallymetrics.util.RestApiFactory;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.util.QueryFilter;

@RestController(value = "/rallymetrics")
public class RallyController {

	RallyRestApi rallyRestApi;

	@RequestMapping(value="/milestone/{name}", method = RequestMethod.GET)
	public String getMilestone(@PathVariable("name") String name) throws IOException {

		rallyRestApi = RestApiFactory.getRestApi();
		
		QueryRequest milestoneQuery = new QueryRequest("milestone");
		milestoneQuery.setQueryFilter(new QueryFilter("Name", "contains", name));
		milestoneQuery.setPageSize(20);
		milestoneQuery.setLimit(100);
		
		QueryResponse response = rallyRestApi.query(milestoneQuery);
		
		return "Success";
	}
}
