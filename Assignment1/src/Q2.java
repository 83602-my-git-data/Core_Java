import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = 0;
		double d2 = 0;
		boolean status = true;
		System.out.println("Enter number 1: ");
		if(sc.hasNextDouble())
		{
			
			if(sc.hasNextInt())
			{
				System.out.println("Number is not a double");
				status = false;
				
			}
			else
			{
				d1 = sc.nextDouble();
			}	
		}
		
		System.out.println("Enter number 2: ");
		if(sc.hasNextDouble())
		{
			
			if(sc.hasNextInt())
			{
				System.out.println("Number is not a double");
				status = false;
			}
			else
			{
				d2 = sc.nextDouble();
			}	
		}
		
		double avg = (d1+d2) / 2;
		System.out.println("Average : "+avg);
	}

}
