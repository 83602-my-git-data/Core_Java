package com.app.entity;
import java.util.Objects;

public class Mobile {
	private String model;
	private String Company;
	private double price;

	public Mobile() {
		super();
	}

	public Mobile(String model, String company, double price) {
		super();
		this.model = model;
		Company = company;
		this.price = price;
	}

	public Mobile(String model) {
		// TODO Auto-generated constructor stub
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(model, other.model);
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", Company=" + Company + ", price=" + price + "]";
	}

}
