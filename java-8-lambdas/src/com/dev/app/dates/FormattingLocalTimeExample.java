package com.dev.app.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

	public static void parseLocaTime() {
		
		/**
         * System defined format
         */
		
		String time = "13:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("localTime : " + localTime);
		
		LocalTime localTimeTwo = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTimeTwo: " + localTimeTwo);
		
		/**
         * Custom system defined format
         */
		
		String timeTwo = "13*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTimeThree = LocalTime.parse(timeTwo, dateTimeFormatter);
		System.out.println("localTimeThree: " + localTimeThree);
		
		String timeThree = "13*00*02";
		DateTimeFormatter dateTimeFormatterTwo = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localDateFour = LocalTime.parse(timeThree, dateTimeFormatterTwo);
		System.out.println("localDateFour: " + localDateFour);
		
	}
	
	public static void formatLocalTime() {
		LocalTime localTime = LocalTime.of(19,30);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		String formattedTime = localTime.format(dateTimeFormatter);
		System.out.println("formattedTime: " + formattedTime);
		
		LocalTime localTimeTwo = LocalTime.now();
		DateTimeFormatter dateTimeFormatterTwo = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTimeTwo = localTimeTwo.format(dateTimeFormatterTwo);
		System.out.println("formattedTimeTwo: " + formattedTimeTwo);
	}
	
	public static void main(String...strings) {
		parseLocaTime();
		formatLocalTime();
	}
}