package com.dev.app.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String...strings) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);
		
		LocalTime localTimeOf = LocalTime.of(23, 33);
		System.out.println("localTimeOf: " + localTimeOf);
		
		LocalTime localTimeOfTwo = LocalTime.of(23, 33, 33);
		System.out.println("localTimeOfTwo: " + localTimeOfTwo);
		
		LocalTime localTimeThree = LocalTime.of(23, 33, 33, 98098);
		System.out.println("localTimeThree: " + localTimeThree);
		
		/**
		 * Getting the values from localDate instance 
		 */
		System.out.println("getHour: " + localTime.getHour());
		System.out.println("getMinute: " + localTime.getMinute());
		System.out.println("Using get: " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("toSecondOfDay: " + localTime.toSecondOfDay());
		
		/**
		 * Modifying values of localTime 
		 */
		System.out.println("minusHour: " + localTime.minusHours(2));
		System.out.println("minusHour using ChronoUnit: " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("using with: " + localTime.with(LocalTime.MIDNIGHT));
		System.out.println("using with: " + localTime.with(ChronoField.HOUR_OF_DAY, 22));
		System.out.println("plusMinutes: " + localTime.plusMinutes(30));
		System.out.println("withHour: " + localTime.withHour(10));
	}
}