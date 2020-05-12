package com.dev.app.streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsPartitioningByExample {

	public static void partitioningByOne() {
		Predicate<Student> predicateStudent = (s) -> s.getGpa() >= 3.8;
		Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
																.stream()
																.collect(Collectors.partitioningBy(predicateStudent::test));
		System.out.println(studentMap);
	}
	
	public static void partitioningByTwo() {
		Predicate<Student> predicateStudent = (s) -> s.getGpa() >= 3.8;
		Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.partitioningBy(predicateStudent::test,
												Collectors.toSet()));
		System.out.println(studentMap);
	}
	
	public static void partitioningByThree() {
		Predicate<Student> predicateStudent = (s) -> s.getGpa() >= 3.8;
		Map<Boolean, Map<String, List<String>>> studentMap = StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.partitioningBy(predicateStudent::test,
												Collectors.toMap(Student::getName, Student::getActivities)));
		System.out.println(studentMap);
	}
	
	public static void main(String...strings) {
		partitioningByOne();
		partitioningByTwo();
		partitioningByThree();
	}
}