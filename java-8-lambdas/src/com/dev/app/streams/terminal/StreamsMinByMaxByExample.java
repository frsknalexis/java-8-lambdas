package com.dev.app.streams.terminal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsMinByMaxByExample {
	
	public static Optional<Student> maxBy() {
		return StudentDataBase.getAllStudents()
							.stream()
							.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> minBy() {
		return StudentDataBase.getAllStudents()
							.stream()
							.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static List<Student> maxByMultipleStudents() {
		List<Student> maxStudents = new ArrayList<Student>();
		
		Optional<Student> studentOptional = StudentDataBase.getAllStudents()
														.stream()
														.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		
		Student maxStudent = studentOptional.isPresent() ? studentOptional.get() : null;
		if (maxStudent != null) {
			maxStudents = StudentDataBase.getAllStudents()
										.stream()
										.filter((s) -> maxStudent.getGpa() == s.getGpa())
										.collect(Collectors.toList());
			System.out.println("Max Students are : " + maxStudents);
		}
		return maxStudents;
	}
	
	public static void main(String...strings) {
		Optional<Student> maxBy = maxBy();
		Student maxByResult = maxBy.isPresent() ? maxBy.get() : new Student("default");
		System.out.println("maxBy: " + maxByResult);
		Optional<Student> minBy = minBy();
		Student minByResult = minBy.isPresent() ? minBy.get() : new Student("default");
		System.out.println("minBy: " + minByResult);
		System.out.println(maxByMultipleStudents());
	}
}
