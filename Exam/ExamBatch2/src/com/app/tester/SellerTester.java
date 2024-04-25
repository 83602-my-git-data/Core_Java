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
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		ProductDao sellerdao = null;
		try {
			sellerdao = new ProductDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (flag) {
			menu();

			switch (sc.nextInt()) {
			case 0:
				System.out.println("thank you");
				flag = false;
				break;
			case 1: {
				System.out.println("Enter the name , email , password , address");
				try {
					boolean fla = sellerdao.addSeller(new Seller(sc.next(), sc.next(), sc.next(), sc.next()));
					if (fla)
						System.out.println("seller is added.");
					else
						System.out.println("seller is not added.");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
				break;
			case 2: {
				System.out.println("Enter the  email and password ");
				try {
					Seller s = sellerdao.login(new Seller(sc.next(), sc.next()));
					if (s != null)
						System.out.println(s);
					else
						System.out.println("login email and password is wrong.");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
				break;

			case 3: {
				System.out.println("Enter the  email and password ");
				try {
					Seller s = sellerdao.login(new Seller(sc.next(), sc.next()));
					if (s != null) {
						System.out.println("Enter the name,category, price,is_stock(true/false)");
						boolean f = sellerdao.addProducts(
								new Product(sc.next(), Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(), sc.nextBoolean()));
					
					 if(f) System.out.println("product is added.");
					 else 
						 System.out.println("product is not added");
					} else
						System.out.println("seller is not login.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				break;
				
			case 4 :
			{
				System.out.println("Enter the Category ::");
				String cate = sc.next();
				try {
					List<Product> list = sellerdao.allProducts();
					list.stream().filter(s -> s.getCategory().name().equals(cate)).forEach(System.out::println);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
			default:
				break;
			}
		}

	}

	private static void menu() {
		System.out.println("1. Add a new seller\r\n" + "2. Seller Login using email and password\r\n"
				+ "3. Add a new product (Only add product if seller is logged in and if seller not found display proper message)\r\n"
				+ "4. Search product by category (Take input for category from user)\r\n" + " 0. exits");
		System.out.println("Enter your Choice ::");
	}

}
