package com.adp.portal.rallymetrics.controller;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adp.portal.rallymetrics.util.Fields;
import com.adp.portal.rallymetrics.util.ProjectInfo;
import com.adp.portal.rallymetrics.util.RestApiFactory;
import com.adp.portal.rallymetrics.util.Services;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.util.Fetch;
import com.rallydev.rest.util.QueryFilter;

@RestController
@RequestMapping("api/v1/userstories")
public class UserStoriesController {
	
	private final RallyRestApi rallyRestApi = RestApiFactory.getRestApi();
	
	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> getAllUserStoriesByRelease(@RequestParam(value="milestone", required=true) String milestone) throws IOException {
		
		QueryRequest usQuery = new QueryRequest(Services.USER_STORY.getValue());
		
		usQuery.setFetch(new Fetch(Fields.FORMATTED_ID.getValue(), Fields.KANBAN_STATE.getValue(), Fields.SUBMITTED_BY.getValue(), Fields.OWNER.getValue(),
				Fields.MILESTONES.getValue(), Fields.ITERATION.getValue(), Fields.RELEASE.getValue(), Fields.PROJECT.getValue(), Fields.TAGS.getValue(), 
				Fields.DEFECTS.getValue()));
		
		usQuery.setProject(ProjectInfo.PROJECT_ID.getValue());
		usQuery.setQueryFilter(new QueryFilter("Milestones.Name", "contains", milestone));

		QueryResponse queryResponse = rallyRestApi.query(usQuery);
		return ResponseEntity.ok().body(queryResponse.getResults().toString());
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<String> getUserStoryById(@PathVariable(value="id", required=true) String id){
		
		return ResponseEntity.ok().body("");
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUserStoryById(@PathVariable(value="id", required=true) String id){
		
		return ResponseEntity.ok().body("");
	}
}
