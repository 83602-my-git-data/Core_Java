package com.app.tester;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.dao.ProductDao;
import com.app.pojos.Category;
import com.app.pojos.Product;
import com.app.pojos.Seller;

public class SellerTester {

	public static void main(String[] args) {

		boolean flag = true;
		try (Scanner sc = new Scanner(System.in); ProductDao sellerdao = new ProductDao();) {
			while (flag) {
				menu();
				switch (sc.nextInt()) {
				case 0:
					System.out.println("thank you");
					flag = false;
					break;
				case 1: {
					sc.nextLine();
					System.out.println("Enter the name , email , password , address");
					boolean flag1 = sellerdao
							.addSeller(new Seller(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
					if (flag1)
						System.out.println("seller is added.");
					else
						System.out.println("seller is not added.");

				}
					break;
				case 2: {
					System.out.println("Enter the  email and password ");
					Seller s = sellerdao.login(new Seller(sc.next(), sc.next()));
					if (s != null)
						System.out.println(s);
					else
						System.out.println("login email and password is wrong.");

				}
					break;

				case 3: {
					System.out.println("Enter the  email and password ");
					Seller s = sellerdao.login(new Seller(sc.next(), sc.next()));
					if (s != null) {
						System.out.println("Enter the name,category, price,is_stock(true/false)");
						boolean flag1 = sellerdao.addProducts(new Product(sc.next(),
								Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(), sc.nextBoolean()));

						if (flag1)
							System.out.println("product is added.");
						else
							System.out.println("product is not added");
					} else
						System.out.println("seller is not login.");

				}
					break;

				case 4: {
					sc.nextLine();
					System.out.println("Enter the Category ::");
					String category = sc.nextLine();
					List<Product> list = sellerdao.allProducts();
					list.stream().filter(s -> s.getCategory().name().equals(category)).forEach(System.out::println);
				}
					break;
				default:
					System.out.println("Invalid choice!!!!!!!");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void menu() {
		System.out.println("1. Add a new seller\r\n" + "2. Seller Login using email and password\r\n"
				+ "3. Add a new product (Only add product if seller is logged in and if seller not found display proper message)\r\n"
				+ "4. Search product by category (Take input for category from user)\r\n" + " 0. exits");
		System.out.println("Enter your Choice ::");
	}

}
