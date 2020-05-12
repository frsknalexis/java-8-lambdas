package com.dev.app.streams.terminal;

import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsJoiningExample {

	public static String joining() {
		return StudentDataBase.getAllStudents()
							.stream()
							.map(Student::getName)
							.collect(Collectors.joining());
	}
	
	public static String joiningWithDelimiter() {
		return StudentDataBase.getAllStudents()
							.stream()
							.map(Student::getName)
							.collect(Collectors.joining("-"));
	}
	
	public static String joiningWithDelimiterWithPrefix() {
		return StudentDataBase.getAllStudents()
							.stream()
							.map(Student::getName)
							.collect(Collectors.joining("-", "[", "]"));
	}
	
	public static void main(String...strings) {
		System.out.println("joining: " + joining());
		System.out.println("joiningWithDelimiter: " + joiningWithDelimiter());
		System.out.println("joiningWithDelimiterWithPrefix: " + joiningWithDelimiterWithPrefix());
	}
}