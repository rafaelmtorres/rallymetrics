package com.adp.portal.rallymetrics.util;

public enum Services {
	
	MILESTONE("milestone"),
	ITERATION("iteration"),
	DEFECT("defect"),
	USER_STORY("hierarchicalrequirement"),
	ARTIFACT("artifact");
	
	private Services(String value){
		this.value = value;
	}
	
	private String value;

	public String getValue() {
		return value;
	}
}	
