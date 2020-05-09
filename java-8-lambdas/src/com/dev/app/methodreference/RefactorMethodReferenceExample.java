package com.dev.app.methodreference;

import java.util.function.Predicate;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	
	static Predicate<Student> predicatUsingMethodReference = RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student student) {
		return student.getGradeLevel() >= 3;
	}
	
	public static void main(String...strings) {
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
		System.out.println(predicatUsingMethodReference.test(StudentDataBase.studentSupplier.get()));
	}
}