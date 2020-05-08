package com.dev.app.functionalinterface;

public class FunctionExample1 {

	public static String performConcat(String input) {
		return FunctionExample.addSomeString.apply(input);
	}
	
	public static void main(String...strings) {
		String result = performConcat("Hello");
		System.out.println(result);
	}
}
