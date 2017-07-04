package com.adp.portal.rallymetrics.util;

import java.time.LocalDate;

public class DateParser {
	
	public static LocalDate getLocalDateFromString(String dateTime){
		return LocalDate.parse(dateTime.substring(0,10));
	}
}	
