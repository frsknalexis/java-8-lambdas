package com.dev.app.optional;

import java.util.Optional;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class OptionalOrElseExample {

	public static String optionalOrElse() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Optional<Student> studentOptional = Optional.ofNullable(null);
		String studentName = studentOptional.map(Student::getName).orElse("Default");
		return studentName;
	}
	
	public static String optionalOrElseGet() {
		// Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String studentName = studentOptional.map(Student::getName).orElseGet(() -> "Default Name");
		return studentName;
	}
	
	public static String optionalOrElseThrow() {
		// Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String studentName = studentOptional.map(Student::getName)
											.orElseThrow(() -> new RuntimeException("No Data is available"));
		return studentName;
	}
	
	public static void main(String...strings) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
	}
}