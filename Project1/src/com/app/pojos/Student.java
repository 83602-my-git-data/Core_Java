package com.app.pojos;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Comparable<Student> ,Serializable {

	private int roll;
	private String name;
	private String city;
	private double marks;
	private LocalDate dateOfAdimission;

	public Student(int roll, String name, String City, double marks,LocalDate dateOfAdimission) {
		this.name = name;
		this.roll = roll;
		this.city = City;
		this.marks = marks;
		this.dateOfAdimission = dateOfAdimission;
	}

	public Student(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}
	

	public LocalDate getDateOfAdimission() {
		return dateOfAdimission;
	}

	public void setDateOfAdimission(LocalDate dateOfAdimission) {
		this.dateOfAdimission = dateOfAdimission;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks +", Date "+dateOfAdimission+ "]";
	}

	@Override
	public int compareTo(Student o) {
		// return this.getName().compareTo(o.getName());
		// return o.getroll() - (this.getroll());
		if ((this.getRoll() - (o.getRoll())) == 0)
			return o.getName().compareTo(this.getName());
		return this.getRoll() - (o.getRoll());

	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getRoll()==((Student)obj).getRoll();
	}

}
