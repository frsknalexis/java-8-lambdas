package com.dev.app.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class DefaultMethodExample2 {
	
	static Consumer<Student> studentConsumer = (s) -> System.out.println("student: " + s);
	
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	
	static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
	
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
	
	public static void sortByName(List<Student> studentList) {
		studentList.sort(Comparator.comparing(Student::getName)); //inline
		studentList.sort(nameComparator::compare);
		System.out.println("After sort by name: ");
		studentList.stream()
				.forEach(studentConsumer::accept);
	}
	
	public static void sortByGPA(List<Student> studentList) {
		studentList.sort(gpaComparator::compare);
		System.out.println("After sort by GPA: ");
		studentList.stream()
				.forEach(studentConsumer::accept);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		System.out.println("Comparator Chaining List: ");
		studentList.stream()
				.forEach(studentConsumer::accept);
	}
	
	public static void sortWithNullValues(List<Student> studentList) {
		Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator::compare);
		studentList.sort(studentComparator);
		System.out.println("After sortWithNullValues: ");
		studentList.stream()
				.forEach(studentConsumer::accept);
	}
	
	public static void main(String...strings) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Before sort: ");
		studentList.stream()
				.forEach(studentConsumer::accept);
		//sortByName(studentList);
		//sortByGPA(studentList);
		//comparatorChaining(studentList);
		sortWithNullValues(studentList);
	}
}