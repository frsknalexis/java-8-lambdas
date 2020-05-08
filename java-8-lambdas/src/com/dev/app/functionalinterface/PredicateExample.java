package com.dev.app.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = (i) -> i % 2 == 0;
	
	static Predicate<Integer> p2 = (i) -> i % 5 == 0;
	
	public static void predicateAnd() {
		System.out.println("Result in predicateAnd: " + p1.and(p2).test(10));
		System.out.println("Result in predicateAnd: " + p1.and(p2).test(9));
	}
	
	public static void predicateOr() {
		System.out.println("Result in predicateOr: " + p1.or(p2).test(4));
		System.out.println("Result in predicateOr: " + p1.or(p2).test(8));
	}
	
	public static void predicateNegate() {
		System.out.println("Result in predicateNegate: " + p1.or(p2).negate().test(45));
	}
	
	public static void main(String...strings) {
		System.out.println(p1.test(4));
		predicateAnd();
		predicateOr();
		predicateNegate();
	}
}