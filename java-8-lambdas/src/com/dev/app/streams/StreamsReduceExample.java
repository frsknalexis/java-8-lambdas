package com.dev.app.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		Integer multiplicationValue = integerList.stream()
										.reduce(1, (a, b) -> a * b);
		return multiplicationValue;
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream()
						.reduce((a, b) -> {
							return a * b;
						});
	}
	
	public static Optional<Student> getHighestStudentGpa(List<Student> students) {
		BinaryOperator<Student> maxStudent = BinaryOperator.maxBy(Comparator.comparing(Student::getGpa));
		return students.stream()
					.reduce(maxStudent::apply);
	}
	
	public static String combineStudentNames() {
		List<Student> students = StudentDataBase.getAllStudents();
		return students.stream()
					.map(Student::getName)
					.reduce("", String::concat);
	}
	
	public static void main(String...strings) {
		List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
		System.out.println("Result is: " + performMultiplication(integerList));
		Optional<Integer> result = performMultiplicationWithoutIdentity(integerList);
		if (result.isPresent())
			System.out.println("Result is: " + result.get());
		else 
			System.out.println("Result is: " + 0);
		
		System.out.println(getHighestStudentGpa(StudentDataBase.getAllStudents()).get());
		System.out.println(combineStudentNames());
	}
}