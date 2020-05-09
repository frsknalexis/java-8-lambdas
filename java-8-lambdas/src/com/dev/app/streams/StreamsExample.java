package com.dev.app.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsExample {

	public static void main(String...strings) {
		Predicate<Student> gradePredicate = (s) -> s.getGradeLevel() >= 3;
		Predicate<Student> gpaPredicate = (s) -> s.getGpa() >= 3.9;
		List<Student> students = StudentDataBase.getAllStudents();
		// students name and activities in a map
		
		Map<String, List<String>> studentsMap = students.stream()
														.peek(System.out::println)
														.filter(gradePredicate::test)
														.peek(s -> System.out.println("After first filter: " + s))
														.filter(gpaPredicate::test)
														.peek(s -> System.out.println("After second filter: " + s))
														.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println("studentsMap: " + studentsMap);
	}
}