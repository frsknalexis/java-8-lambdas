package com.dev.app.streams.terminal;

import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents()
							.stream()
							.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static double average() {
		return StudentDataBase.getAllStudents()
							.stream()
							.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String...strings) {
		System.out.println("Total no of Notebooks are: " + sum());
		System.out.println("Average no of Notebooks are: " + average());
	}
}