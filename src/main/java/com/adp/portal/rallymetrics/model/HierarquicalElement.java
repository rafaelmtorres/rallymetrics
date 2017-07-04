package com.adp.portal.rallymetrics.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class HierarquicalElement extends Artifact {
	
	private LocalDate acceptedDate;
	private boolean blocked;
	private String blockedReason;
	private String component;
	private String idsStatus;
	private String kabanState;
	private String moscow;
	private List<Task> taskList = Collections.EMPTY_LIST;
}
