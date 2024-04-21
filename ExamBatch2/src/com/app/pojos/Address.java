package com.app.pojos;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable{
	private int pin;
	private String dist;
	private String area;
	
	public Address(int pin, String dist, String area) {
		super();
		this.pin = pin;
		this.dist = dist;
		this.area = area;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", dist=" + dist + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, dist, pin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(area, other.area) && Objects.equals(dist, other.dist) && pin == other.pin;
	}
	
	
}
