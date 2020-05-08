package com.dev.app.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) ->  {
		Map<String, Double> stundentGpaMap = new HashMap<String, Double>();
		students.stream()
				.forEach((s) -> {
					if (studentPredicate.test(s))
						stundentGpaMap.put(s.getName(), s.getGpa());
				});
		return stundentGpaMap;
	};
	
	public static void main(String...strings) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p2));
	}
}
