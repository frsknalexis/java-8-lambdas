package com.dev.app.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = (s) -> System.out.println(s.getName().toUpperCase());
	static Consumer<Student> c3 = (s) -> System.out.println(s.getActivities());
	
	public static void printNames() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.forEach(c1::accept);
	}
	
	public static void printNamesAndActivities() {
		System.out.println("printNamesAndActivities: ");
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.forEach(c2.andThen(c3)::accept);
	}
	
	public static void printNamesAndActivitiesUsingCondicion() {
		System.out.println("printNamesAndActivitiesUsingCondition: ");
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.filter((s) -> s.getGradeLevel()>=3 && s.getGpa()>3.9)
				.forEach(c2.andThen(c3)::accept);
	}

	public static void main(String...strings) {
		Consumer<String> consumer1 = (s) -> System.out.println(s.toUpperCase());
		consumer1.accept("java8");
		printNames();
		printNamesAndActivities();
		printNamesAndActivitiesUsingCondicion();
	}
}