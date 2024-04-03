package Q1;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		  String partNumber, partDescription;
		  int quantity;
		  double price;
		
		  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the part Number , part Description(string) , Quantity(int) , price (double)");
		  
		Invoice iv = new Invoice(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
		  
		 System.out.println(iv.toString());
		 
		 System.out.println("Total Bill is :: "+iv.calculatesAmount());
		

	}

}
