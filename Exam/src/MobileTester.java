import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<Mobile> mb = null;

//		mb.add(new Mobile("Note 3 N9000", "Samsung", 47900));
//		mb.add(new Mobile("Xperia Z1", "Sony", 41599));
//		mb.add(new Mobile("G2", "LG", 40490));
//		mb.add(new Mobile("Lumia 1020", "Nokia", 49999));
//		mb.add(new Mobile("Xperia C", "Sony", 20460));
//		mb.add(new Mobile("Desire 500", "HTC", 21490));
//		mb.add(new Mobile("Trend S7392", "Samsung", 8490));
//		mb.add(new Mobile("Xperia M", "Sony", 12499));
//		mb.add(new Mobile("Xperia C", "Sony", 21679));

		try {
			mb = (ArrayList<Mobile>) IOUtils.restoreProductDetails("Mobile.txt");
			mb.forEach(System.out::println);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (flag) {
			System.out.println("*******************************************************");
			System.out.println("1.add new mobile.\r\n2.show all mobiles.\r\n"
					+ "3.search mobile by model.\r\n4.delete mobile by model.\r\n5.sort all mobiles by Company.\r\n"
					+ "6.sort all mobiles by price.");
			
			System.out.println("Enter the Choice::");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("Thank you::");
				flag = false;
				break;
			case 1: {

				System.out.println("Enter the model , company, price ");
				mb.add(new Mobile(sc.next(), sc.next(), sc.nextDouble()));
				System.out.println("Add ");
			}
				break;
			case 2:
				mb.forEach(System.out::println);
				break;
			case 3:
				Mobile m = new Mobile("G2");
		         System.out.println(mb.get(mb.indexOf(m)));		
				break;
				
			case 4:
				Mobile m1 = new Mobile();
				m1.setModel("G2");
				System.out.println(mb.remove(mb.indexOf(m1)));
				break;
			case 5:
				mb.stream().sorted((a,b)->a.getCompany().compareTo(b.getCompany())).forEach(System.out::println);
				break;
			case 6:
				mb.stream().sorted((a,b)-> Double.compare(a.getPrice(),b.getPrice())).forEach(System.out::println);
				break;
				
			default:
				break;
			}
		}
		
		
		try {
			IOUtils.storeProductDetails("Mobile.txt", mb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
