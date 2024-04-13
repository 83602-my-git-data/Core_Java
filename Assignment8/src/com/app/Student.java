package com.app;

public class Student implements Comparable<Student> {
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	
	
	public Student(int roll,String name,String City, double marks) {
		this.name = name;
		this.roll = roll;
		this.city =City;
		this.marks = marks;
	}


	public String getName() {
		return name;
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
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		//return this.getName().compareTo(o.getName());
	    //return  o.getroll() - (this.getroll());
		if((this.getRoll() - (o.getRoll()))==0)
			return o.getName().compareTo(this.getName());
		return  this.getRoll() - (o.getRoll());
		
	}

	
}
