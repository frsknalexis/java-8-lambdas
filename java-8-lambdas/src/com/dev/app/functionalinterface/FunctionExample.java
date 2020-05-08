package com.dev.app.functionalinterface;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> function = (name) -> name.toUpperCase();
	
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" default");
	
	public static void main(String...strings) {
		System.out.println("Result is: " + function.apply("java8"));
		System.out.println("Result andThen is: " + function.andThen(addSomeString).apply("java8"));
		System.out.println("Result compose is: " + function.compose(addSomeString).apply("java8"));
	}
}
