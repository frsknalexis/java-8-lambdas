package com.dev.app.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

	public static void parseLocalDate() {
		
		/**
		 * String to LocalDate 
		 */
		String date = "2018-04-28";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate: " + localDate);
		
		LocalDate localDateTwo = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDateTwo: " + localDateTwo);
		
		String dateTwo = "20180428";
		LocalDate localDateThree = LocalDate.parse(dateTwo, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("BASIC_ISO_DATE : " + localDateThree);
		
		/**
         * Custom system defined format
         */
		
		String dateThree = "2018|04|28";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDateFour = LocalDate.parse(dateThree, dateTimeFormatter);
		System.out.println("localDateFour: " + localDateFour);
		
		String dateFour = "2018*04*28";
		DateTimeFormatter dateTimeFormatterTwo = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate localDateFive = LocalDate.parse(dateFour, dateTimeFormatterTwo);
		System.out.println("localDateFive: " + localDateFive);
	}
	
	public static void formatLocalDate() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		String formattedDate = localDate.format(dateTimeFormatter);
		System.out.println("formattedDate: " + formattedDate);
	}
	
	public static void main(String...strings) {
		parseLocalDate();
		formatLocalDate();
	}
}
