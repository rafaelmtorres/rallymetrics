package com.adp.portal.rallymetrics.builder;

import java.time.LocalDate;

import com.adp.portal.rallymetrics.model.Artifact;
import com.adp.portal.rallymetrics.model.Milestone;
import com.adp.portal.rallymetrics.model.WorkspaceDomainObject;

public class MilestoneBuilder extends WorkspaceDomainObject {
	
	private String artifactRef;
	
	private Artifact artifacts;
	private String formattedId;
	private String name;
	private String notes;
	private LocalDate targetDate;
	private long totalArtifactCount;
	
	public MilestoneBuilder setFormattedId(String formattedId){
		this.formattedId = formattedId;
		return this;
	}
	
	public MilestoneBuilder setName(String name){
		this.name = name;
		return this;
	}
	
	public MilestoneBuilder setNotes(String notes){
		this.notes = notes;
		return this;
	}
	
	public MilestoneBuilder setTargetDate(LocalDate targetDate){
		this.targetDate = targetDate;
		return this;
	}
	
	public MilestoneBuilder setTotalArtifactCount(long totalArtifactCount){
		this.totalArtifactCount = totalArtifactCount;
		return this;
	}
	
	public MilestoneBuilder setArtifactRef(String artifactRef){
		this.artifactRef = artifactRef;
		return this;
	}

	
	public Milestone buildSimpleMilestone(){
		return new Milestone(artifactRef, formattedId, name, notes, targetDate, totalArtifactCount);
	}
	
	public Milestone buildFullMilestone(){
		return new Milestone(artifacts, formattedId, name, notes, targetDate, totalArtifactCount);
	}
	
}
