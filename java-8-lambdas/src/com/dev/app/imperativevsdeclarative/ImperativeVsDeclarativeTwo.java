package com.dev.app.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeTwo {

	public static void main(String...strings) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);
		
		/**
		 * Imperative Style
		 * */
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (Integer i : integerList) {
			if (!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		
		System.out.println("Imperavite Style: Unique list -> " + uniqueList);
		
		/**
		 * Declarative Style
		 * */
		List<Integer> newUniqueList = integerList.stream()
												.distinct()
												.collect(Collectors.toList());
		
		System.out.println("Declarative Style: Unique List -> " + newUniqueList);
	}
}
