import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		boolean status = true;
		double bill = 0;
		while(status != false)
		{
			Scanner sc = new Scanner(System.in);
		
			int qty = 0;
			int price = 0;
			double total;
			System.out.println("1: Idli");
			System.out.println("2: Samosa");
			System.out.println("3: Dosa");
			System.out.println("4: Uthappa");
			System.out.println("5: Vadapav");
			System.out.println("6: Pohe");
			System.out.println("7: Puri");
			System.out.println("8: Misal");
			System.out.println("9: Shira");
			System.out.println("10: Generate Bill");
			System.out.println("Enter Your choice :");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank you for using Food Order !!");
				break;
				
			case 1:
				price = 50;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill +=total;
				break;
				
			case 2:
				price = 15;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill +=total;
				break;
				
			case 3:
				price = 60;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill+=total;
				break;
				
			case 4:
				price = 70;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill+=total;
				break;
				
			case 5:
				price = 15;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill +=total;
				break;
				
			case 6:
				price = 25;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill +=total;
				break;
				
			case 7:
				price = 40;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill +=total;
				break;
				
			case 8:
				price = 80;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill = bill+total;
				break;
				
			case 9:
				price = 25;
				System.out.println("Enter the qty : ");
				qty = sc.nextInt();
				total = price*qty;
				bill +=total;
				break;
				
			case 10:
				System.out.println("Total Bill : "+bill);
				status = false;
				break;
				
			default :
				System.out.println("Invalid choice !!");
				break;
			}
		}

	}
}
