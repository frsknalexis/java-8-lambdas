package com.dev.app.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities(List<Student> students) {
		List<String> studentActivitiesList = students.stream()
													.map(Student::getActivities)
													.flatMap(List::stream)
													.collect(Collectors.toList());
		return studentActivitiesList;
	}
	
	public static List<String> printUniqueStudentActivities(List<Student> students) {
		return students.stream()
					.map(Student::getActivities)
					.flatMap((v) -> v.stream())
					.distinct()
					.sorted()
					.collect(Collectors.toList());
	}
	
	public static long getStudentsActivitiesCount(List<Student> students) {
		long numOfStudentActivities = students.stream()
											.map(Student::getActivities)
											.flatMap((v) -> v.stream())
											.distinct()
											.count();
		return numOfStudentActivities;
	}
	
	public static void main(String...strings) {
		System.out.println("studentActivitiesList: " + printStudentActivities(StudentDataBase.getAllStudents()));
		System.out.println("printUniqueStudentActivities: " + printUniqueStudentActivities(StudentDataBase.getAllStudents()));
		System.out.println("getStudentsActivitiesCount: " + getStudentsActivitiesCount(StudentDataBase.getAllStudents()));
	}
}