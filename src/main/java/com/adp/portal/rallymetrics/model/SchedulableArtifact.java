package com.adp.portal.rallymetrics.model;

import java.time.LocalDate;

public abstract class SchedulableArtifact extends Artifact{
	
	private LocalDate acceptedDate;
	private boolean blocked;
	private String blockedReason;
	
	public LocalDate getAcceptedDate() {
		return acceptedDate;
	}
	public void setAcceptedDate(LocalDate acceptedDate) {
		this.acceptedDate = acceptedDate;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public String getBlockedReason() {
		return blockedReason;
	}
	public void setBlockedReason(String blockedReason) {
		this.blockedReason = blockedReason;
	}
}
