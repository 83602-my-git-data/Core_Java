import java.util.Scanner;

public class Q1 {
/*Accept a integer number and when the program is executed print the binary, octal and 
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		 int num = sc.nextInt();
		 System.out.println("Given the Number :: "+num);
		 System.out.println("Binary equivalent :: "+Integer.toBinaryString(num));
		 System.out.println("Octal equivalent :: "+Integer.toOctalString(num));
		 System.out.println("Hexadecimal equivalent :: "+Integer.toHexString(num));
		 
	}

}