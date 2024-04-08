package com.app.fruit;

public class Apple extends Fruit {

	public Apple() {
		this.setName("Apple");
		this.setColor("red");
		this.setWeight(500);
	}

	

	@Override
	public String toString() {
		return "Apple [toString()=" + super.toString() + "]";
	}



	@Override
	public String taste() {
		
		return "sweet n sour";
	}

	
	
}
