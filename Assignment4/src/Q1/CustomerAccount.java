package Q1;

import java.util.Scanner;

public class CustomerAccount {
	
	private static int generatedAccountNumber;
	private final int accountNumber = generatedAccountNumber++;
	private int allowedCredit;//5000
	private int charges;//2500
	private int beginningBalance;//10000
	
	static {
		generatedAccountNumber = 1001;
	}

	public CustomerAccount(int allowedCredit, int charges, int beginningBalance) {
		this.allowedCredit = allowedCredit;
		this.charges = charges;
		this.beginningBalance = beginningBalance;
	}

	@Override
	public String toString() {
		return "CustomerAccount [accountNumber=" + accountNumber + ", allowedCredit=" + allowedCredit + ", charges="
				+ charges + ", beginningBalance=" + beginningBalance +"]";
	}
	
	public int newBalanceForNextMonth() {
	  return Math.abs(beginningBalance + charges - allowedCredit);
	}
	
	public boolean allowedLimit() {
		if(newBalanceForNextMonth() <= this.allowedCredit)
			 return true;
		 return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account allowedCredit, charges and beginningBalance :: ");
		CustomerAccount account = new CustomerAccount(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println();
		
		System.out.println(account.toString());
		System.out.println();
		if(account.allowedLimit())
			 System.out.println("new balance for next month is "+account.newBalanceForNextMonth()+" and  Allowed Limit.");
		else
			System.out.println("new balance for next month is "+account.newBalanceForNextMonth()+" and Credit limit exceeded.");
			
	}
}

