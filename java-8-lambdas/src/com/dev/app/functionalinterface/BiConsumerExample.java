package com.dev.app.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class BiConsumerExample {

	public static void nameAndActivities() {
		BiConsumer<String, List<String>> studentsBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
		List<Student> students = StudentDataBase.getAllStudents();
		students.stream()
				.forEach((s) -> studentsBiConsumer.accept(s.getName(), s.getActivities()));
	}
	
	public static void main(String...strings) {
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a: " + a + ", b: " + b);
		};
		biConsumer.accept("java8", "java11");
		
		BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiply: " + (a * b));
		BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division: " + (a / b));
		BiConsumer<Integer, Integer> adition = (a, b) -> System.out.println("Adition: " + (a + b));
		
		multiply.andThen(adition).andThen(division).accept(10, 5);
		nameAndActivities();
	}
}