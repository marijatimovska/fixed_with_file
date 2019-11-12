package com.fixed_width_file.filemenager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fixed_width_file.model.Student;

public class StudentReader extends FileMenagerImpl<Student> {

	@Override
	public Student createInstance(String line) {

		if (line == null || line.isEmpty()) {
			return null;
		}
		
		Student st = new Student();

		st.setFirstName(line.substring(0, 15).trim());
		st.setLastName(line.substring(16, 35).trim());
		st.setPrNumber(line.substring(36, 48).trim());
		st.setAlive(boolMapper(line.charAt(49)));
		st.setSalary(Integer.parseInt(line.substring(50, 57)));
		st.setDate(dateMapper(line.substring(58, 66)));

		return st;

	}

	private boolean boolMapper(char value) {
		return (value == 't') ? true : false;
	}

	public static LocalDate dateMapper(String value) {
		final String dateString = String.format("%s-%s-%s", value.substring(0, 4), value.substring(4, 6),
				value.substring(6));
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(dateString, formatter);
	}

}
