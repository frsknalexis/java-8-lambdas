package com.dev.app.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName(List<Student> students) {
		return students.stream()
					.sorted(Comparator.comparing(Student::getName))
					.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpa(List<Student> students) {
		return students.stream()
					.sorted(Comparator.comparing(Student::getGpa))
					.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpaReversed(List<Student> students) {
		return students.stream()
					.sorted(Comparator.comparing(Student::getGpa).reversed())
					.collect(Collectors.toList());
	}
	
	public static void main(String...strings) {
		System.out.println("SORT STUDENTS BY NAME");
		sortStudentsByName(StudentDataBase.getAllStudents()).stream()
															.forEach(System.out::println);
		System.out.println("SORT STUDENTS BY GPA: ");
		sortStudentsByGpa(StudentDataBase.getAllStudents()).stream()
														.forEach(System.out::println);
		System.out.println("SORT STUDENTS BY GPA REVERSED: ");
		sortStudentsByGpaReversed(StudentDataBase.getAllStudents()).stream()
																.forEach(System.out::println);
	}
}