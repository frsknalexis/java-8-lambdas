package com.dev.app.streams.terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsGroupingByExample {

	public static void groupStudentsByGender() {
		Map<String, List<Student>> studentsMap = StudentDataBase.getAllStudents()
																.stream()
																.collect(Collectors.groupingBy(Student::getGender, 
																			Collectors.toList()));
		Stream.of(studentsMap)
			.forEach(System.out::println);
	}
	
	public static void customizedGroupingBy() {
		Map<String, List<Student>> studentsMap = StudentDataBase.getAllStudents()
																.stream()
																.collect(Collectors.groupingBy((s) -> s.getGpa() >= 3.8 ? "OUTSTANDING": "AVERAGE"));
		Stream.of(studentsMap)
			.forEach(System.out::println);
	}
	
	public static void twoLevelGrouping() {
		Map<Integer, Map<String, List<Student>>> studentsMap = StudentDataBase.getAllStudents()
											.stream()
											.collect(Collectors.groupingBy(Student::getGradeLevel,
														Collectors.groupingBy((s) -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
		Stream.of(studentsMap)
			.forEach(System.out::println);
	}
	
	public static void twoLevelGrouping2() {
		Map<String, Integer> studentsMap = StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.groupingBy(Student::getName,
												Collectors.summingInt(Student::getNoteBooks)));
		Stream.of(studentsMap)
			.forEach(System.out::println);
	}
	
	public static void twoLevelGrouping3() {
		Map<String, Set<Student>> studentsMap = StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.groupingBy(Student::getName, Collectors.toSet()));
		Stream.of(studentsMap)
			.forEach(System.out::println);
	}
	
	public static void threeArgumentGroupingBy() {
		LinkedHashMap<String, Set<Student>> studentsMap = StudentDataBase.getAllStudents()
																		.stream()
																		.collect(Collectors.groupingBy(Student::getName, 
																					LinkedHashMap::new, 
																					Collectors.toSet()));
		System.out.println("studentsMap: " + studentsMap);
	}
	
	public static void calculateTopGpaStudentInEachGrade() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()
																			.collect(Collectors.groupingBy(Student::getGradeLevel, 
																						Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.groupingBy(Student::getGradeLevel,
												Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),
												Optional::get)));
		System.out.println(studentMap);
	}
	
	public static void calculateLeastGpaStudentInEachGrade() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
											.stream()
											.collect(Collectors.groupingBy(Student::getGradeLevel,
														Collectors.minBy(Comparator.comparing(Student::getGpa))));
		System.out.println(studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
														.stream()
														.collect(Collectors.groupingBy(Student::getGradeLevel,
																	Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),
																	Optional::get)));
		System.out.println(studentMap);
	}
	
	public static void main(String...strings) {
		groupStudentsByGender();
		System.out.println();
		customizedGroupingBy();
		System.out.println();
		twoLevelGrouping();
		System.out.println();
		twoLevelGrouping2();
		System.out.println();
		twoLevelGrouping3();
		System.out.println();
		threeArgumentGroupingBy();
		System.out.println();
		calculateTopGpaStudentInEachGrade();
		System.out.println();
		calculateLeastGpaStudentInEachGrade();
	}
}