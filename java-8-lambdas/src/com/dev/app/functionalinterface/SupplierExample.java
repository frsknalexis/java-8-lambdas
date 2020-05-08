package com.dev.app.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class SupplierExample {

	public static void main(String...strings) {
		Supplier<Student> studentSupplier = () -> new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
		Supplier<List<Student>> studentsSupplier = StudentDataBase::getAllStudents;
		System.out.println("Student is: " + studentSupplier.get());
		System.out.println("Students are: " + studentsSupplier.get());
	}
}