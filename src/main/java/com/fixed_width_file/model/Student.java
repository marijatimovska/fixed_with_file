package com.fixed_width_file.model;

import java.time.LocalDate;

public class Student {
	private String firstName;
	private String lastName;
	private String prNumber;
	private boolean isAlive;
	private Integer salary;
	private LocalDate date;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String prNumber, boolean isAlive, Integer salary,
			LocalDate date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.prNumber = prNumber;
		this.isAlive = isAlive;
		this.salary = salary;
		this.date = date;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", prNumber=" + prNumber + ", isAlive="
				+ isAlive + ", salary=" + salary + ", date=" + date + "]";
	}

}
