package com.dev.app.methodreference;

import java.util.function.Consumer;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> c1 = System.out::println;
	
	static Consumer<Student> c2 = Student::printListOfActivities;
	
	public static void main(String...strings) {
		StudentDataBase.getAllStudents().stream()
										.forEach(c1::accept);
		StudentDataBase.getAllStudents().stream()
										.forEach(c2::accept);
	}
}