package com.adp.portal.rallymetrics.util;

public enum Services {
	
	MILESTONE("https://rally1.rallydev.com/slm/webservice/v2.0/milestone"),
	ITERATIONS("https://rally1.rallydev.com/slm/webservice/v2.0/iteration"),
	DEFECTS("https://rally1.rallydev.com/slm/webservice/v2.0/defect"),
	USER_STORIES("https://rally1.rallydev.com/slm/webservice/v2.0/hierarchicalrequirement");
	
	private Services(String url){
		this.url = url;
	}
	
	private String url;

	public String getUrl() {
		return url;
	}
}	
