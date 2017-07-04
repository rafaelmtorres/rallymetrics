package com.adp.portal.rallymetrics.model;

public abstract class Artifact extends WorkspaceDomainObject {
	
	private String description;
	private String formattedId;
	private String name;
	private String notes;
	private String owner;
	private boolean ready;
	private Tag tags;
	
	public String getDescription() {
		return description;
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
	public String getOwner() {
		return owner;
	}
	public boolean isReady() {
		return ready;
	}
	public Tag getTags() {
		return tags;
	}
	
	
}
