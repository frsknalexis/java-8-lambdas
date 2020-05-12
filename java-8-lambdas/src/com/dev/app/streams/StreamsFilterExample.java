package com.dev.app.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsFilterExample {

	public static List<Student> filterStudents(List<Student> students) {
		return students.stream()
					.filter((s) -> {
						return s.getGpa() >= 3.9;
					})
					.filter((s) -> {
						return s.getGender().equals("female");
					})
					.collect(Collectors.toList());
	}
	
	public static void main(String...strings) {
		System.out.println("Filtered students: ");
		filterStudents(StudentDataBase.getAllStudents()).stream()
														.forEach(System.out::println);
	}
}