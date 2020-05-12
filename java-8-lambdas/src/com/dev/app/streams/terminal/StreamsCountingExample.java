package com.dev.app.streams.terminal;

import java.util.stream.Collectors;

import com.dev.app.data.StudentDataBase;

public class StreamsCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents()
							.stream()
							.filter((s) -> s.getGpa() >= 3.9)
							.collect(Collectors.counting());
	}
	
	public static void main(String...strings) {
		System.out.println(count());
	}
}