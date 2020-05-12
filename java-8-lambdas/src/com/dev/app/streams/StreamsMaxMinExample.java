package com.dev.app.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamsMaxMinExample {

	public static Optional<Integer> findMaxValue(List<Integer> integerList) {
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.comparing(Integer::intValue));
		return integerList.stream()
						.reduce(maxBy::apply);
	}
	
	public static Optional<Integer> findMinValue(List<Integer> integerList) {
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.comparing(Integer::intValue));
		return integerList.stream()
						.reduce(minBy::apply);
	}
	
	public static void main(String...strings) {
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10); 
		Optional<Integer> optionalMaxValue = findMaxValue(integerList);
		int maxValue = optionalMaxValue.isPresent() ? optionalMaxValue.get() : 0;
		System.out.println("Max value is: " + maxValue);
		Optional<Integer> optionalMinValue = findMinValue(integerList);
		int minValue = optionalMinValue.isPresent() ? optionalMinValue.get() : 0;
		System.out.println("Min value is: " + minValue);
	}
}