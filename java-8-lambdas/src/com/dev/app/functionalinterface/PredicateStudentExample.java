package com.dev.app.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	
	public static void filterStudentsByGradeLevel() {
		System.out.println("filterStudentsByGradeLevel: ");
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.forEach((s) -> {
					if (p1.test(s))
						System.out.println(s);
				});
	}
	
	public static void filterStudentsByGpa() {
		System.out.println("filterStudentsByGpa: ");
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.forEach((s) -> {
					if (p2.test(s))
						System.out.println(s);
				});
	}
	
	public static void filterStudents() {
		System.out.println("filterStudents: ");
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.forEach((s) -> {
					if (p1.or(p2).test(s))
						System.out.println(s);
				});
	}
	
	public static void main(String...strings) {
		filterStudentsByGradeLevel();
		filterStudentsByGpa();
		filterStudents();
	}
}