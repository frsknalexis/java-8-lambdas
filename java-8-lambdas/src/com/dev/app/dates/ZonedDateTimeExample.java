package com.dev.app.dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String...strings) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime: " + zonedDateTime);
		System.out.println("zoneOffset : " + zonedDateTime.getOffset());
		System.out.println("zoneId: " + zonedDateTime.getZone());
		
		/*ZoneId.getAvailableZoneIds()
			.stream()
			.forEach((z) -> System.out.println("zone: " + z));*/
		
		System.out.println("no Of Zones : " + ZoneId.getAvailableZoneIds().size());
		
		System.out.println("Chicago CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit EST: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("LA PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Denver MST: " + ZonedDateTime.now(ZoneId.of("America/Denver")));
		
		System.out.println("ZonedDateTime using Clock: " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));
		
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
		System.out.println("Detroit: " + localDateTime);
		LocalDateTime localDateTimeTwo = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
		System.out.println("Detroit: " + localDateTimeTwo);
		
		LocalDateTime localDateTimeThree = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("Instant LocalDate time :" + localDateTimeThree);
		
		/**
         * Convert LocalDateTime to ZonedDateTime
         */
		LocalDateTime localDateTimeFour = LocalDateTime.now();
		System.out.println("localDateTimeFour: " + localDateTimeFour);
		
		ZonedDateTime zonedDateTimeTwo = localDateTimeFour.atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTimeTwo: " + zonedDateTimeTwo);
		
		ZonedDateTime zoneDateTimeThree = Instant.now().atZone(ZoneId.of("America/Detroit"));
		System.out.println("zoneDateTimeThree: " + zoneDateTimeThree);
		
		OffsetDateTime offsetDateTime = localDateTimeFour.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("offsetDateTime: " + offsetDateTime);
	}
}