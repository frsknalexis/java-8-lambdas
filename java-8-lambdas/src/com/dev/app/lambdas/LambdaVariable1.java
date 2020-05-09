package com.dev.app.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

	public static void main(String...strings) {
		int i = 0;
		Consumer<Integer> c1 = (a) ->  {
			System.out.println("Value is: " + i);
		};
	}
}
