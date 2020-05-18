package com.dev.app.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String...strings) {
		LocalDate localDate = LocalDate.of(2018, 01, 01);
		LocalDate localDateTwo = LocalDate.of(2018, 12, 31);
		
		Period period = localDate.until(localDateTwo);
		System.out.println("getDays: " + period.getDays());
		System.out.println("getMonths: " + period.getMonths());
		System.out.println("getYears: " + period.getYears());
		
		Period periodTwo = Period.ofDays(10);
		System.out.println("getDays: " + periodTwo.getDays());
		
		Period periodThree = Period.ofYears(20);
		System.out.println("getYears: " + periodThree.getYears());
		System.out.println("toTotalMonths: " + periodThree.toTotalMonths());
		System.out.println("getDays: " + periodThree.getDays());
		
		Period periodFour = Period.between(localDate, localDateTwo);
		System.out.println("Period: " + periodFour);
		System.out.println("getDays: " + periodFour.getDays());
		System.out.println("getMonths: " + periodFour.getMonths());
		System.out.println("getYears: " + periodFour.getYears());
	}
}