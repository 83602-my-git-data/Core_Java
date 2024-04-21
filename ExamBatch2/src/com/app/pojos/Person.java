package com.app.pojos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person implements Serializable {
	  private String name;
	  private Date birthDate;
	  private Address homeAddr;
	  
	public Person(String name, Date birthDate,int pin, String dist, String area) {
		this.name = name;
		this.birthDate = birthDate;
		this.homeAddr = new Address(pin, dist, area);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Address getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + new SimpleDateFormat("dd/MM/yyyy").format(birthDate) + homeAddr.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDate, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Person other = (Person) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(name, other.name);
	}

	  
	
	  
}
