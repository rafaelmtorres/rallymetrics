package com.adp.portal.rallymetrics.model;

public class Tag {
	
	private boolean archived;
	private String name;
	
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Tag(boolean archived, String name) {
		super();
		this.archived = archived;
		this.name = name;
	}	
}
