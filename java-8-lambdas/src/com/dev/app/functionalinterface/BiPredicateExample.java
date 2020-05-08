package com.dev.app.functionalinterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class BiPredicateExample {

	static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
	
	static Consumer<Student> consumerStudent = (s) -> {
		if (biPredicate.test(s.getGradeLevel(), s.getGpa()))
			System.out.println(s);
	};
	
	public static void main(String...strings) {
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream().forEach(consumerStudent::accept);
	}
}