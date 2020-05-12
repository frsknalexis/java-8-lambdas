package com.dev.app.streams;

import com.dev.app.data.StudentDataBase;

public class StreamsMatchExample {

	public static boolean allMatchOperator() {
		return StudentDataBase.getAllStudents().stream()
											.allMatch((s) -> s.getGpa() >= 3.9);
	}
	
	public static boolean anyMatchOperator() {
		return StudentDataBase.getAllStudents().stream()
											.anyMatch((s) -> s.getGpa() >= 3.9);
	}
	
	public static boolean noneMatchOperator() {
		return StudentDataBase.getAllStudents().stream()
											.noneMatch((s) -> s.getGpa() >= 3.9);
	}
	
	public static void main(String...strings) {
		System.out.println("Result of allMatch: " + allMatchOperator());
		System.out.println("Result of anyMatch: " + anyMatchOperator());
		System.out.println("Result of noneMatch: " + noneMatchOperator());
	}
}
