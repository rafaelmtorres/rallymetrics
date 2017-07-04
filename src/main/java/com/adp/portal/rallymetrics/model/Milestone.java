package com.adp.portal.rallymetrics.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Milestone extends WorkspaceDomainObject{
	
	private String artifactRef;
	private List<Artifact> artifactsList = Collections.EMPTY_LIST;
	private String formattedId;
	private String name;
	private String notes;
	private LocalDate targetDate;
	private long totalArtifactCount;
	
	public Milestone(Artifact artifacts, String formattedId, String name, String notes, LocalDate targetDate,
			long totalArtifactCount) {
		super();
		this.formattedId = formattedId;
		this.name = name;
		this.notes = notes;
		this.targetDate = targetDate;
		this.totalArtifactCount = totalArtifactCount;
	}
	
	public Milestone(String artifactRef, String formattedId, String name, String notes, LocalDate targetDate,
			long totalArtifactCount) {
		super();
		this.artifactRef = artifactRef;
		this.formattedId = formattedId;
		this.name = name;
		this.notes = notes;
		this.targetDate = targetDate;
		this.totalArtifactCount = totalArtifactCount;
	}

	public List<Artifact> getArtifactsList() {
		return artifactsList;
	}
	public String getFormattedId() {
		return formattedId;
	}
	public String getName() {
		return name;
	}
	public String getNotes() {
		return notes;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public long getTotalArtifactCount() {
		return totalArtifactCount;
	}
	public String getArtifactRef() {
		return artifactRef;
	}
}
