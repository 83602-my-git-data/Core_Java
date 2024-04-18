package com.app.entity;

public class Student {
	private int rollno;
	private String name;
	private double marks;
	private String mobile;

	public Student() {
	}

	public Student(String name, double marks, String mobile) {
		this.name = name;
		this.marks = marks;
		this.mobile = mobile;
	}

	public Student(int rollno, String name, double marks, String mobile) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.mobile = mobile;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", mobile=" + mobile + "]";
	}

}
