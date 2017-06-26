package com.adp.portal.rallymetrics.util;

public enum ProjectInfo {
	
	PROJECT_ID("/project/9557401897"),
	PROJECT_NAME("Portal R9");
	
	private String value;

	private ProjectInfo(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
