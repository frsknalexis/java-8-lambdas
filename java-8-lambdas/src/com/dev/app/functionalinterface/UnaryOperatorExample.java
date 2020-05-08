package com.dev.app.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	static UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase().concat(" default");
	
	public static void main(String...strings) {
		System.out.println(unaryOperator.apply("java8"));
	}
}