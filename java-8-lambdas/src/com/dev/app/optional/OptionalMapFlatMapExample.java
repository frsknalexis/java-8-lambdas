package com.dev.app.optional;

import java.util.Optional;

import com.dev.app.data.Bike;
import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class OptionalMapFlatMapExample {

	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter((s) -> s.getGpa() >= 3.5)
					.ifPresent(System.out::println);
	}
	
	public static void optionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent())
			studentOptional.filter((s) -> s.getGpa() >= 3.5)
						.map(Student::getName)
						.ifPresent(System.out::println);
	}
	
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent()) {
			Optional<String> nameBookOptional = studentOptional.filter((s) -> s.getGpa() >= 3.5)
															.flatMap(Student::getBike)
															.map(Bike::getName);
			nameBookOptional.ifPresent(System.out::println);
		}
	}
	
	public static void main(String...strings) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}
}