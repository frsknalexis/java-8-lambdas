package com.dev.app.lambdas;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String...strings) {
		/**
		 * prior java 8
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
				// 0 -> if o1 == o2
                // 1 -> if o1 > o2
                //-1 -> if o1 < o2
			}
		};
		
		System.out.println("Result of Comparator is: " + comparator.compare(3, 2));
		
		/**
		 * java 8 - Lambda Syntax 
		 */
		Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
		System.out.println("Result of Comparator using Lambda is: " + comparatorLambda.compare(3, 2));
		Comparator<Integer> comparatorLambda1 = Integer::compareTo;
		System.out.println("Result of Comparator using Lambda is: " + comparatorLambda1.compare(1, 2));
	}
}