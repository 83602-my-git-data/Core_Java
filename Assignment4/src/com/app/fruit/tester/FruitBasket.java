package com.app.fruit.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.fruit.Apple;
import com.app.fruit.Fruit;
import com.app.fruit.Mango;
import com.app.fruit.Orange;

public class FruitBasket {

	private static void menu() {
		System.out.println("*******************************************************");
		System.out.println("1. Add Mango.");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Mark a fruit as stale");
		System.out.println("7. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("8. Mark all sour fruits stale.");
		System.out.println("0. Exits");
		System.out.println("Enter your choice - ");
		System.out.println("********************************************************");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the basket size for the Fruits.");
		Fruit fruitsBasket[] = new Fruit[sc.nextInt()];
		int count = 0;
		int choice = 0;
		do {
			menu();
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank you!!!");
			}
				break;
			case 1: {
				if (count < fruitsBasket.length) {
					fruitsBasket[count] = new Mango();
					System.out.println("Mango is Added.");
					System.out.println("Enter the 1 if Fruit is Fresh else 0.");
					if (sc.nextInt() == 1)
						fruitsBasket[count].setFresh(true);
					count++;
				} else
					System.out.println("Basket is Fulled.");
			}
				break;
			case 2: {
				if (count < fruitsBasket.length) {
					fruitsBasket[count] = new Orange();
					System.out.println("Orange is Added.");
					System.out.println("Enter the 1 if Fruit is Fresh else 0.");
					if (sc.nextInt() == 1)
						fruitsBasket[count].setFresh(true);
					count++;
				} else
					System.out.println("Basket is Fulled.");
			}
				break;
			case 3: {
				if (count < fruitsBasket.length) {
					fruitsBasket[count] = new Apple();
					System.out.println("Apple is Added.");
					System.out.println("Enter the 1 if Fruit is Fresh else 0.");
					if (sc.nextInt() == 1)
						fruitsBasket[count].setFresh(true);
					count++;
				} else
					System.out.println("Basket is Fulled.");
			}
				break;
			case 4:// 4. Display names of all fruits in the basket.
			{
				System.out.println("All Name Of all Fruits");
				for (int i = 0; i < count; i++) {
					System.out.println(fruitsBasket[i].getName());
				}
			}
				break;
			case 5:// 5. Display name,color,weight , taste of all fresh fruits , in the basket.
			{
				for (Fruit f : fruitsBasket) {
					if (f == null)
						break;
					System.out.println(f.toString());
					System.out.println("taste of fruits is " + f.taste());
				}

			}
				break;
			case 6:// 6. Mark a fruit as stale
			{
				System.out.println("Enter the count of the Fruits :");
				int in = sc.nextInt();
				if (in < fruitsBasket.length && fruitsBasket[in].isFresh()) {
					fruitsBasket[in].setFresh(false);
					System.out.println("fruit is stales is completed.");
				} else
					System.out.println("count is Invalid!!!!");
			}
				break;
			case 7:// 7. Display tastes of all stale(not fresh) fruits in the basket.
			{
				for (Fruit f : fruitsBasket) {
					if (f == null)
						break;
					if (!f.isFresh()) {
						System.out.println(f.toString() + "  Taste is ::" + f.taste());
					}
				}
			}
				break;
			case 8:// 8. Mark all sour fruits stale.
				for (Fruit f : fruitsBasket) {
					if (f == null)
						break;
					if (f.isFresh()) {
						f.setFresh(false);
					}
				}
				System.out.println("Mark all fruits as stales..");
				break;
			default:
				System.out.println("Invalid Choice!!!!!");
				break;
			}
		} while (choice != 0);
	}

}
