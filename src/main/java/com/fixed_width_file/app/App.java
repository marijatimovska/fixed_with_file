package com.fixed_width_file.app;

import java.util.List;
import com.fixed_width_file.filemenager.FileMenager;
import com.fixed_width_file.filemenager.StudentReader;
import com.fixed_width_file.model.Student;

public class App {
	public static final String SOURCE= "Students.txt";

	public static void main(String[] args) {
		FileMenager<Student> reader = new StudentReader();
		List<Student> list = reader.read(SOURCE);
		list.stream().forEach(System.out::println);

	}

}
