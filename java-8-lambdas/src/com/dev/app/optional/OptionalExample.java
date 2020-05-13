package com.dev.app.optional;

import java.util.Optional;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		// Student student = null;
		if (student != null)
			return student.getName();
		return null;
	}
	
	public static Optional<String> getStudentNameOptional() {
		// Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null); 
		if (studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		return Optional.empty();
	}
	
	public static void main(String...strings) {
		String name = getStudentName();
		if (name != null)
			System.out.println("Length of the student name is: " + name.length());
		else
			System.out.println("Name not found");
		
		Optional<String> stringOptional = getStudentNameOptional();
		if (stringOptional.isPresent())
			System.out.println(stringOptional.get());
		else
			System.out.println("Name of Student not found");
	}
}