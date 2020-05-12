package com.dev.app.streams;

import java.util.List;
import java.util.Optional;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAny() {
		List<Student> students = StudentDataBase.getAllStudents();
		return students.stream()
					.filter((s) -> s.getGpa() >= 3.9)
					.findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		List<Student> students = StudentDataBase.getAllStudents();
		return students.stream()
					.filter((s) -> s.getGpa() >= 3.9)
					.findFirst();
	}
	
	public static void main(String...strings) {
		Optional<Student> resultFindAny = findAny();
		if (resultFindAny.isPresent())
			System.out.println("The student is: " + resultFindAny.get());
		else 
			System.out.println("Student not found");
		
		Optional<Student> resultFindFirst = findFirstStudent();
		if (resultFindFirst.isPresent())
			System.out.println("The first student is: " + resultFindFirst.get());
		else 
			System.out.println("Student not found");
	}
}