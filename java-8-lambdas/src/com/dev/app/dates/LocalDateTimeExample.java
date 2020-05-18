package com.dev.app.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

	public static void main(String...strings) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDateTime);
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(2020, 03, 21, 23, 33, 33);
		System.out.println("localDateTimeOf: " + localDateTimeOf);
		
		LocalDateTime localDateTimeOfTwo = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTimeOfTwo: " + localDateTimeOfTwo);
		
		/**
		 * Getting the time and date from localDateTime instance
		 */
		System.out.println("getHour: " + localDateTime.getHour());
		System.out.println("getMinute: " + localDateTime.getMinute());
		System.out.println("getDayOfTheMonth: " + localDateTime.getDayOfMonth());
		System.out.println("using ChronoField: " + localDateTime.get(ChronoField.DAY_OF_MONTH));
		
		/**
		 * Modifying localDateTime instance 
		 */
		System.out.println("plusHours: " + localDateTime.plusHours(2));
		System.out.println("minusDays: " + localDateTime.minusDays(2));
		System.out.println("withMonth: " + localDateTime.withMonth(12));
		System.out.println("using ChronoField: " + localDateTime.with(ChronoField.MONTH_OF_YEAR, 3));
		System.out.println("using with TemporalAdjusters: " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		/**
         * Converting LocalDate,LocalTime to LocalDateTime and vice versa
         */
		LocalDate localDate = LocalDate.of(2019, 01, 01);
		System.out.println("atTime: " + localDate.atTime(23, 33));
		
		LocalTime localTime = LocalTime.of(23, 39);
		System.out.println("atDate: " + localTime.atDate(localDate));
		
		LocalDateTime localDateTimeTwo = localTime.atDate(localDate);
		System.out.println("toLocalDate: " + localDateTimeTwo.toLocalDate());
		System.out.println("toLocalTime: " + localDateTimeTwo.toLocalTime());
	}
}