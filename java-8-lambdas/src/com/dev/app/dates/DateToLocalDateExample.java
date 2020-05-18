package com.dev.app.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String...strings) {
		
		/**
         *  java.util.Date to LocalDate and vice versa
         */
		
		Date date = new Date();
		System.out.println("date: " + date);
		
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate: " + localDate);
		
		Date dateTwo = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("dateTwo: " + dateTwo);
		
		/**
         *  LocalDate to java.sql.Date
         */
		
		java.sql.Date dateSQL = java.sql.Date.valueOf(localDate);
		System.out.println("dateSQL: " + dateSQL);
		
		LocalDate localDateTwo = dateSQL.toLocalDate();
		System.out.println("localDateTwo: " + localDateTwo);
	}
}