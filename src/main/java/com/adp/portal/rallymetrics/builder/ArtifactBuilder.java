package com.adp.portal.rallymetrics.builder;

import java.util.Collections;
import java.util.List;

import com.adp.portal.rallymetrics.model.Artifact;
import com.adp.portal.rallymetrics.model.Defect;
import com.adp.portal.rallymetrics.model.HierarquicalElement;
import com.adp.portal.rallymetrics.model.Tag;

public class ArtifactBuilder {
	
	private String description;
	private String formattedId;
	private String name;
	private String notes;
	private String owner;
	private boolean ready;
	private String type;
	private List<Tag> tags = Collections.EMPTY_LIST;
	
	public ArtifactBuilder defineDescription(String description){
		this.description = description;
		return this;
	}
	
	public ArtifactBuilder setFormattedId(String formattedId){
		this.formattedId = formattedId;
		return this;
	}
	
	public ArtifactBuilder setName(String name){
		this.name = name;
		return this;
	}
	
	public ArtifactBuilder setNotes(String notes){
		this.notes = notes;
		return this;
	}
	
	public ArtifactBuilder setOwner(String owner){
		this.owner = owner;
		return this;
	}
	
	public ArtifactBuilder isReady(boolean ready){
		this.ready = ready;
		return this;
	} 
	
	public ArtifactBuilder setTag(Tag tag){
		tags.add(tag);
		return this;
	}
	
	public ArtifactBuilder setType(String type){
		this.type = type;
		return this;
	}
	
	
	public Artifact buildFullArtifact(){
		
		Artifact artifact = null;
		if(type.equals("defect")){
			artifact = new Defect();
		}else if(type.equals("hierarquicalElement")){
			artifact = new HierarquicalElement();
		}
		
		return artifact;
	}
}
