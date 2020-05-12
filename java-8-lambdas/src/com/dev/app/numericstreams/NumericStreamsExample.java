package com.dev.app.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumofNNumbers(List<Integer> integerList) {
		return integerList.stream()
						.reduce(0, Integer::sum);
	}
	
	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1, 6)
						.sum();
	}
	
	public static void main(String...strings) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Sum of numbers are: " + sumofNNumbers(integerList));
		System.out.println("Sum of numbers intStream are: " + sumOfNNumbersIntStream());
	}
}