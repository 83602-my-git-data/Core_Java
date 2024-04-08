package com.app.fruit;

public class Orange extends Fruit {

	public Orange() {
		this.setName("Orange");
		this.setColor("orange");
		this.setWeight(200);
	}

	

	@Override
	public String toString() {
		return "Orange [toString()=" + super.toString() + "]";
	}



	@Override
	public String taste() {
		
		return "sour";
	}

	
}
