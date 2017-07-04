package com.adp.portal.rallymetrics.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adp.portal.rallymetrics.model.Artifact;

@RestController
@RequestMapping("api/v1/artifacts")
public class ArtifactsController {

	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Artifact>> getArtifactsByMilestone(@RequestParam(value="milestoneId", required=true) String milestoneId){
		return null;
	}
}
