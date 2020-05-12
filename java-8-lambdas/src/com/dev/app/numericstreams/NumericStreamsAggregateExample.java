package com.dev.app.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

	public static void main(String...strings) {
		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Sum is: " + sum);
		
		OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
		int maxValue = optionalInt.isPresent() ? optionalInt.getAsInt() : 0;
		System.out.println("Max value is: " + maxValue);
		
		OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
		long minValue = optionalLong.isPresent() ? optionalLong.getAsLong() : 0;
		System.out.println("Min value is: " + minValue);
		
		OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
		double averageValue = optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0.0;
		System.out.println("Average value is: " + averageValue);
	}
}