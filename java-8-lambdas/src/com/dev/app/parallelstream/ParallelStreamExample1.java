package com.dev.app.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class ParallelStreamExample1 {

	public static List<String> sequentialStream() {
		long startTime = System.currentTimeMillis();
		List<String> studentsActivities = StudentDataBase.getAllStudents()
														.stream()
														.map(Student::getActivities)
														.flatMap((v) -> v.stream())
														.collect(Collectors.toList());
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Duration in sequential stream : " + duration);
		return studentsActivities;
	}
	
	public static List<String> parallelStream() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents()
														.parallelStream()
														.map(Student::getActivities)
														.flatMap((v) -> v.stream())
														.collect(Collectors.toList());
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Duration in parallel stream: " + duration);
		return studentActivities;
	}
	
	public static void main(String...strings) {
		System.out.println("sequentialStream: " + sequentialStream());
		System.out.println("parallelStream: " + parallelStream());
	}
}