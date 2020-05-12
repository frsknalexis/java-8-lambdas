package com.dev.app.streams.terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String...strings) {
		Set<String> namesSet = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println("namesSet: " + namesSet);
		
		List<String> namesList = StudentDataBase.getAllStudents()
								.stream()
								.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println("namesList: " + namesList);
	}
}