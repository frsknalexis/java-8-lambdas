package com.dev.app.optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String...strings) {
		Optional<String> stringOptional = Optional.ofNullable("Hello Optional");
		System.out.println(stringOptional.isPresent());
		if (stringOptional.isPresent())
			System.out.println(stringOptional.get());
		
		stringOptional.ifPresent((v) -> System.out.println("value is: " + v));
	}
}