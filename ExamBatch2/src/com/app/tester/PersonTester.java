package com.app.tester;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import com.app.pojos.Address;
import com.app.pojos.Person;
import com.app.utils.IOUtils;

public class PersonTester {

	public static void main(String[] args) {

		Set<Person> personset = new LinkedHashSet<>();
		boolean flag = true;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// Date date = dateFormat.parse(birthDate);

		// Displaying the parsed date in the desired format
		// System.out.println("Parsed Date: " + dateFormat.format(date));
		Scanner sc = new Scanner(System.in);
		while (flag) {
			menu();
			switch (sc.nextInt()) {
			case 0:
				flag = false;
				System.out.println("thank you");
				break;
			case 1: {
				System.out.println("Enter the person name, date(dd/MM/yyyy), pin, dist, area::");
				try {
					personset.add(
							new Person(sc.next(), dateFormat.parse(sc.next()), sc.nextInt(), sc.next(), sc.next()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				personset.forEach(System.out::println);
			}
				break;
			case 3: {
				System.out.println("Enter the name ::");
				String name = sc.next();
				personset.stream().filter(s -> s.getName().equals(name)).forEach(System.out::println);
			}
				break;
			case 4: {
				try {
					IOUtils.storePersonDetails("Person.txt", personset);
					System.out.println("Person File is saved.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				break;
			case 5: {
				try {
					IOUtils.restorePersonDetails("Person.txt").forEach(System.out::println);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				break;
			case 6: {
				personset.stream().sorted((a, b) -> {
					if (a.getHomeAddr().getDist().equals(b.getHomeAddr().getDist()))
						return a.getName().compareTo(b.getName());
					return a.getHomeAddr().getDist().compareTo(b.getHomeAddr().getDist());
				}).forEach(System.out::println);
			}
				break;
			default:
				break;
			}
		}

	}
	 
	private static void menu() {
		System.out.println("1. add new person.\r\n" + "2. display all.\r\n" + "3. find by name.\r\n"
				+ "4. save in file.\r\n" + "5. load from file.\r\n" + "6. display in sorted order of dist and name."
				+ "\r\n 0. Exits." + "\r\n Enter your choice::");
	}
}
