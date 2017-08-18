package com.adp.portal.rallymetrics.controller;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("api/v1/milestones")
public class MilestonesController {

	private final RallyRestApi rallyRestApi = RestApiFactory.getRestApi();

	@CrossOrigin(origins="*")
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getMilestoneList(@RequestParam(value="numberOfMilestones", defaultValue="5") int numberOfMilestones) throws IOException {
		
		QueryRequest milestoneQuery = new QueryRequest(Services.MILESTONE.getValue());
		milestoneQuery.setQueryFilter(new QueryFilter(Fields.NAME.getValue(), "contains", ProjectInfo.PROJECT_NAME.getValue()));
		milestoneQuery.setOrder(Fields.NAME.getValue() + " desc");
		milestoneQuery.setPageSize(numberOfMilestones);
		milestoneQuery.setLimit(numberOfMilestones);
		
		milestoneQuery.setFetch(new Fetch(Fields.NAME.getValue(), Fields.NOTES.getValue(),
				Fields.CREATION_DATE.getValue(), Fields.OBJECT_ID.getValue(), Fields.TARGET_DATE.getValue(),
				Fields.ARTIFACTS.getValue(), Fields.TOTAL_ARTIFACTS_COUNT.getValue()));
		
		QueryResponse response = rallyRestApi.query(milestoneQuery);
		
		return ResponseEntity.ok(response.getResults().toString());
	}
}
