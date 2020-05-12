package com.dev.app.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String...strings) {
		Stream<String> stringStream = Stream.of("adam", "dan", "julie");
		stringStream.forEach(System.out::println);
		
		UnaryOperator<Integer> unaryOperator = (i) -> i * 2;
		List<Integer> integerList = Stream.iterate(1, unaryOperator::apply)
										.limit(10)
										.collect(Collectors.toList());
		
		System.out.println("iterate: " + integerList);
		
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		List<Integer> integerList2 = Stream.generate(integerSupplier::get)
							.limit(5)
							.collect(Collectors.toList());
		
		System.out.println("generate: " + integerList2);
	}
}