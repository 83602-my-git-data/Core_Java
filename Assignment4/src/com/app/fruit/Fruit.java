package com.app.fruit;

public class Fruit {
	private String color;
	private String name;
	private double weight;
	private boolean isFresh;
	
	
	public String taste() {
		return "no specific taste";
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public boolean isFresh() {
		return isFresh;
	}



	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	

	@Override
	public String toString() {
		return "Fruit [name=" + name +", color=" + color + ", weight=" + weight + "]";
	}
}
