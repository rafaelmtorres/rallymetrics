package com.adp.portal.rallymetrics.util;

public enum Fields {
	
	NAME("Name"),
	FORMATTED_ID("FormattedId"),
	KANBAN_STATE("c_KanbanStatePortalLegacy"),
	SUBMITTED_BY("SubmittedBy"),
	OWNER("Owner"),
	MILESTONES("Milestones"),
	ITERATION("Iteration"),
	RELEASE("Release"),
	PROJECT("Project"),
	TAGS("Tags"),
	DEFECTS("Defects"),
	NOTES("Notes"),
	CREATION_DATE("CreationDate"),
	OBJECT_ID("ObjectID"),
	ARTIFACTS("Artifacts"),
	TARGET_DATE("TargetDate"),
	TOTAL_ARTIFACTS_COUNT("TotalArtifactCount");
	
	
	private String value;
	
	private Fields(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}

