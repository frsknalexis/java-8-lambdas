package com.dev.app.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String...strings) {
		List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Erick");
		
		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorted list is: " + stringList);
		
		stringList.sort(Comparator.reverseOrder());
		System.out.println("ReverseOrder list is: " + stringList);
	}
}
