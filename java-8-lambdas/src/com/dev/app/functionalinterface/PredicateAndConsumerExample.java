package com.dev.app.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class PredicateAndConsumerExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> studentConsumer = (s) -> {
		if (p1.and(p2).test(s))
			studentBiConsumer.accept(s.getName(), s.getActivities());
	};
	
	public void printNamesAndActivities(List<Student> students) {
		students.stream()
				.forEach(studentConsumer::accept);
	}
	
	public static void main(String...strings) {
		List<Student> students = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNamesAndActivities(students);
	}
}