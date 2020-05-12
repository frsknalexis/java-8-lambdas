package com.dev.app.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList(List<Student> students) {
		List<String> studentsNameList = students.stream()
												.map(Student::getName)
												.map(String::toUpperCase)
												.collect(Collectors.toList());
		return studentsNameList;
	}
	
	public static Set<String> namesSet(List<Student> students) {
		return students.stream()
					.map(Student::getName)
					.map(String::toUpperCase)
					.collect(Collectors.toSet());
	}
	
	public static void main(String...strings) {
		System.out.println("studentsNameList: " + namesList(StudentDataBase.getAllStudents()));
		System.out.println("studentsNamesSet: " + namesSet(StudentDataBase.getAllStudents()));
	}
}