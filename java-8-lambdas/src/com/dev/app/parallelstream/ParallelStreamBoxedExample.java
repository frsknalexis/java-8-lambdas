package com.dev.app.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

	public static int sequentialSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		Integer sum = integerList.stream()
								.reduce(0, Integer::sum);
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Duration in sequential stream : " + duration);
		return sum;
	}
	
	public static int parallelSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		Integer sum = integerList.parallelStream()
								.reduce(0, Integer::sum);
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Duration in parallel stream: " + duration);
		return sum;
	}
	
	public static void main(String...strings) {
		List<Integer> integerList = IntStream.rangeClosed(1, 10000)
											.boxed()
											.collect(Collectors.toList());
		System.out.println("sequentialSum: " + sequentialSum(integerList));
		System.out.println("parallelSum: " + parallelSum(integerList));
	}
}