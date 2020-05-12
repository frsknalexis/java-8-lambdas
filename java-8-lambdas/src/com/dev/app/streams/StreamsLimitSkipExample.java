package com.dev.app.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limitOperator(List<Integer> integerList) {
		return integerList.stream()
						.limit(2)
						.reduce(Integer::sum);
	}
	
	public static Optional<Integer> skipOperator(List<Integer> integerList) {
		return integerList.stream()
						.skip(3)
						.reduce(Integer::sum);
	}
	
	public static void main(String...strings) {
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
		Optional<Integer> limitResult = limitOperator(integerList);
		int resultLimit = limitResult.isPresent() ? limitResult.get() : 0;
		System.out.println("The limit result is: " + resultLimit);
		Optional<Integer> skipResult = skipOperator(integerList);
		int resultSkip = skipResult.isPresent() ? skipResult.get() : 0;
		System.out.println("The skip result is: " + resultSkip);
	}
}