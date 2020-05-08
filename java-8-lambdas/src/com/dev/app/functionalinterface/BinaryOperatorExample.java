package com.dev.app.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = Integer::compareTo;
	
	public static void main(String...strings) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(3, 4));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator::compare);
		System.out.println("Result of maxBy is: " + maxBy.apply(5, 6));
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator::compare);
		System.out.println("Result of minBy is: " + minBy.apply(5, 6));
	}
}