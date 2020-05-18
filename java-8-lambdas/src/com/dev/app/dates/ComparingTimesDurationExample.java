package com.dev.app.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

	public static void main(String...strings) {
		LocalTime localTime = LocalTime.of(7, 20);
		LocalTime localTimeTwo = LocalTime.of(8, 20);
		
		long minutesDiff = localTime.until(localTimeTwo, ChronoUnit.MINUTES);
		System.out.println("until Minutes Diff : " + minutesDiff);
		
		Duration duration = Duration.between(localTime, localTimeTwo);
		System.out.println("duration: " + duration.toMinutes());
		
		Duration durationTwo = Duration.ofHours(3);
		System.out.println("duration to minutes: " + durationTwo.toMinutes());
		
		/**
		 * unsupported localDate
		 */
		
		LocalDate localDate = LocalDate.now();
		LocalDate localDateTwo = LocalDate.now().plusDays(10);
		Duration durationThree = Duration.between(localDate, localDateTwo);
		System.out.println(durationThree.toDays());
	}
}