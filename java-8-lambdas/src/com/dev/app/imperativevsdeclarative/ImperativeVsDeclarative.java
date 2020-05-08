package com.dev.app.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String...strings) {
		/**
		 * Imperative Style
		 * */
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum using Imperavite Style: " + sum);
		
		/**
		 * Declarative Style programming
		 * */
		int resultSum = IntStream.rangeClosed(0, 100)
							.sum();
		
		System.out.println("Sum using declarative Style: " + resultSum);
	}
}
