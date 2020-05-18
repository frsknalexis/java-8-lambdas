package com.dev.app.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String...strings) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date is: " + localDate);
		LocalDate localDateOf = LocalDate.of(2020, 04, 06);
		System.out.println("localDateOf: " + localDateOf);
		LocalDate localDateOfYearDay = LocalDate.ofYearDay(2020, 02);
		System.out.println("localDateOfYearDay: " + localDateOfYearDay);
		
		/**
		 * Get values from localDate 
		 */
		System.out.println("Month: " + localDate.getMonth());
		System.out.println("MonthValue: " + localDate.getMonthValue());
		System.out.println("DateOfWeek: " + localDate.getDayOfWeek());
		System.out.println("DateOfYear: " + localDate.getDayOfYear());
		System.out.println("DateOfMonth using get: " + localDate.get(ChronoField.DAY_OF_MONTH));
		
		/***
		 * Modifying localDate
		 */
		System.out.println("plusDays: " + localDate.plusDays(2));
		System.out.println("plusMonth: " + localDate.plusMonths(2));
		System.out.println("minusDays: " + localDate.minusDays(2));
		System.out.println("withYear: " + localDate.withYear(2019));
		System.out.println("withChronoField: " + localDate.with(ChronoField.YEAR, 2021));
		System.out.println("withTemporalAdjusters: " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("ChronoUnit: " + localDate.minus(1, ChronoUnit.YEARS));
		
		/**
		 * Unsupported Scenarios  
		 */
		// System.out.println("Chrono Unit: " + localDate.minus(2, ChronoUnit.SECONDS));
		System.out.println("isSupported: " + localDate.isSupported(ChronoUnit.DAYS));
		
		/**
		 * Additional Support method 
		 */
		System.out.println("leapYear: " + localDate.isLeapYear());
		LocalDate localDate1 = LocalDate.of(2020, 01, 31);
		System.out.println("leapYear: " + localDate1.isLeapYear());
		System.out.println("isEqual: " + localDate.isEqual(localDate1));
		System.out.println("isBefore: " + localDate.isBefore(localDate1));
		System.out.println("isAfter: " + localDate.isAfter(localDate1));
		
	}
}