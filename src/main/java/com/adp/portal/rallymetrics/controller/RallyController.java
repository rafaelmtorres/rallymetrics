package com.adp.portal.rallymetrics.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adp.portal.rallymetrics.util.RestApiFactory;
import com.adp.portal.rallymetrics.util.Services;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.util.Fetch;
import com.rallydev.rest.util.QueryFilter;

@RestController
@RequestMapping(value="rallyapi")
public class RallyController {

	private final RallyRestApi rallyRestApi = RestApiFactory.getRestApi();

	@RequestMapping(value="/milestones", method = RequestMethod.GET)
	public String getMilestoneList(@RequestParam(value="numberOfMilestones", defaultValue="5") int numberOfMilestones) throws IOException {
		
		QueryRequest milestoneQuery = new QueryRequest(Services.MILESTONE.getValue());
		milestoneQuery.setQueryFilter(new QueryFilter("Name", "contains", "Portal R9"));
		milestoneQuery.setOrder("Name desc");
		milestoneQuery.setPageSize(numberOfMilestones);
		milestoneQuery.setLimit(numberOfMilestones);
		
		QueryResponse response = rallyRestApi.query(milestoneQuery);
		
		return response.getResults().toString();
	}
	
	@RequestMapping(value = "/userstories", method = RequestMethod.GET)
	public ResponseEntity<String> getUserStoriesByRelease(@RequestParam(value="milestone", required=true) String milestone)
			throws IOException {

		QueryRequest usQuery = new QueryRequest(Services.USER_STORY.getValue());
		usQuery.setFetch(new Fetch("FormattedId", "c_KanbanStatePortalLegacy", "SubmittedBy", "Owner", "Milestones",
				"Iteration", "Release", "Project", "Tags", "Defects"));
		usQuery.setProject("/project/9557401897");
		usQuery.setQueryFilter(new QueryFilter("Milestones.Name", "contains", milestone));

		QueryResponse queryResponse = rallyRestApi.query(usQuery);
		return new ResponseEntity<String>(queryResponse.getResults().toString(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/defects", method = RequestMethod.GET)
	public ResponseEntity<String> getDefectsByRelease(@RequestParam(value="milestone", required=true) String milestone) throws IOException {
		
		QueryRequest usQuery = new QueryRequest(Services.DEFECT.getValue());
		usQuery.setFetch(new Fetch("FormattedId", "c_KanbanStatePortalLegacy", "SubmittedBy", "Owner", "Milestones",
				"Iteration", "Release", "Project", "Tags", "Defects"));
		usQuery.setProject("/project/9557401897");
		usQuery.setQueryFilter(new QueryFilter("Milestones.Name", "contains", milestone));

		QueryResponse queryResponse = rallyRestApi.query(usQuery);
		return new ResponseEntity<String>(queryResponse.getResults().toString(), HttpStatus.OK);
	}
}
