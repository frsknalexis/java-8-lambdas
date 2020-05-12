package com.dev.app.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

	public static void main(String...strings) {
		IntStream intStream = IntStream.range(1, 50);
		System.out.println("Range count is: " + intStream.count());
		IntStream.range(1, 50).forEach((v) -> System.out.print(v + ", "));
		System.out.println();
		System.out.println("RangeClosed count is: " + IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach((v) -> System.out.print(v + ", "));
		System.out.println();
		System.out.println("LongStream rangeClosed count is: " + LongStream.rangeClosed(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach((v) -> System.out.print(v + ", "));
		System.out.println();
		IntStream.range(1, 50).asDoubleStream().forEach((v) -> System.out.print(v + ", "));
	}
}