package com.dev.app.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {

	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5)
						.mapToObj((i) -> {
							return Integer.valueOf(i);
						})
						.collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5)
						.mapToLong((i) -> i)
						.sum();
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 5)
						.mapToDouble((i) -> i)
						.sum();
	}
	
	public static void main(String...strings) {
		System.out.println("mapToObj: " + mapToObj());
		System.out.println("mapToLong: " + mapToLong());
		System.out.println("mapToDouble: " + mapToDouble());
	}
}