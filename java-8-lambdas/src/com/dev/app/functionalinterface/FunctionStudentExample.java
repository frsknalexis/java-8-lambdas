package com.dev.app.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> function = (students) -> {
		Map<String, Double> studentsGpaMap = new HashMap<String, Double>();
		students.stream()
				.forEach((s) -> {
					if (PredicateStudentExample.p1.test(s))
						studentsGpaMap.put(s.getName(), s.getGpa());
				});
		return studentsGpaMap;
	};
	
	public static void main(String...strings) {
		System.out.println(function.apply(StudentDataBase.getAllStudents()));
	}
}
