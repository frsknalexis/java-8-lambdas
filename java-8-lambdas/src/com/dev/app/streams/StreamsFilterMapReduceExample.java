package com.dev.app.streams;

import java.util.List;
import java.util.function.Predicate;

import com.dev.app.data.Student;
import com.dev.app.data.StudentDataBase;

public class StreamsFilterMapReduceExample {

	static Predicate<Student> predicateStudent = (s) -> s.getGradeLevel() >= 3;
	
	static Predicate<Student> predicateStudent2 = (s) -> s.getGender().equals("female");
	
	public static int numOfNoteBooks(List<Student> students) {
		return students.stream()
					.filter(predicateStudent::test)
					.filter(predicateStudent2::test)
					.map(Student::getNoteBooks)
					.reduce(0, Integer::sum);
	}
	
	public static void main(String...strings) {
		System.out.println("Total No of NoteBooks: " + numOfNoteBooks(StudentDataBase.getAllStudents()));
	}
}