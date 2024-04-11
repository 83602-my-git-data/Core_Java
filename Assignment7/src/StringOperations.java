import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String name = sc.nextLine();
		
		StringBuilder str = new StringBuilder(name).reverse();
		
		System.out.println("Reverse of "+name+" is "+str.toString());
		
		if(str.toString().equals(name))
			System.out.println("String is Palindrome.");
		else 
			System.out.println("String is not Palindrome.");
		
		
	}
}
