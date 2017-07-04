package com.adp.portal.rallymetrics.builder;

import com.adp.portal.rallymetrics.model.Tag;

public class TagBuilder {
	
	private boolean archived;
	private String name;
	
	public TagBuilder isArchived(boolean archieved){
		this.archived = archieved;
		return this;
	}
	
	public TagBuilder setName(String name){
		this.name = name;
		return this;
	}
	
	public Tag buildTag(){
		return new Tag(archived, name);
	}
}
