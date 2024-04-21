package com.app.pojos;

public class Product {
//Product [id (int), name (String), category (Category), price (double), in_stock (boolean)]

	private int id;
	private String name;
	private Category category;
	private double price;
	private boolean is_stock;

	public Product(int id,String name, Category category, double price, boolean is_stock) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.is_stock = is_stock;
	}
	
	

	public Product(String name, Category category, double price, boolean is_stock) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.is_stock = is_stock;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isIs_stock() {
		return is_stock;
	}

	public void setIs_stock(boolean is_stock) {
		this.is_stock = is_stock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", is_stock="
				+ is_stock + "]";
	}

	
}
