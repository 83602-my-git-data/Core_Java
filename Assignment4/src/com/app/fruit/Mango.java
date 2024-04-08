package com.app.fruit;

public class Mango extends Fruit {

	public Mango() {
		this.setName("Mango");
		this.setColor("Yellow");
		this.setWeight(600);
	}

	@Override
	public String toString() {
		return "Mango [toString()=" + super.toString() + "]";
	}

	@Override
	public String taste() {

		return "sweet";
	}

}
