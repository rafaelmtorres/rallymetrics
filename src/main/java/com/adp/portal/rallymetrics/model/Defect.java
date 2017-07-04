package com.adp.portal.rallymetrics.model;

import java.time.LocalDate;

public class Defect extends SchedulableArtifact{
	
	private String kanbanStatePortalLegacy;
	private LocalDate inProgressDate;
	private LocalDate openedDate;
	private String priority;
	private String severity;
	private String state;
	
	public String getKanbanStatePortalLegacy() {
		return kanbanStatePortalLegacy;
	}
	public void setKanbanStatePortalLegacy(String kanbanStatePortalLegacy) {
		this.kanbanStatePortalLegacy = kanbanStatePortalLegacy;
	}
	public LocalDate getInProgressDate() {
		return inProgressDate;
	}
	public void setInProgressDate(LocalDate inProgressDate) {
		this.inProgressDate = inProgressDate;
	}
	public LocalDate getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = openedDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
