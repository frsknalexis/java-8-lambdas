package com.dev.app.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

	public static void parseLocalDateTime() {
		
		String dateTime = "2018-04-18T14:33:33";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
		System.out.println("localDateTime: " + localDateTime);
		
		LocalDateTime localDateTimeTwo = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("localDateTimeTwo: " + localDateTimeTwo);
		
		/**
         * Custom system defined format
         */
		
		String dateTimeTwo = "2018-04-1814|33|33";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH|mm|ss");
		LocalDateTime localDateTimeThree = LocalDateTime.parse(dateTimeTwo, dateTimeFormatter);
		System.out.println("custom date time format: " + localDateTimeThree);
		
		String dateTimeThree = "2018-04-18abc14|33|33";
		DateTimeFormatter dateTimeFormatterTwo = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime localDateTimeFour = LocalDateTime.parse(dateTimeThree, dateTimeFormatterTwo);
		System.out.println("custom date time format: " + localDateTimeFour);
	}
	
	public static void formatLocalDateTime() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDateTime = localDateTime.format(dateTimeFormatter);
		System.out.println("convertedDateTime : " + formattedDateTime);
	}
	
	public static void main(String...strings) {
		parseLocalDateTime();
		formatLocalDateTime();
	}
}