/*34. You are tasked with developing a simple menu-driven bank transaction application.
 * The application should allow users to perform three types of transactions:
 *  deposit, withdraw, and check balance. 
 *  The user should be able to select any of these options from the menu
 *   and enter the necessary amount for the transaction.
 *    After each transaction, the user's updated balance should be displayed.
 *     The user can continue performing transactions until they manually choose to stop.
*/

import java.util.Scanner;
 class Simple_Menu_Driven_bank_Transaction_Application 
{
	 public static void print(int n)
	 {
		 int amount=15000,with_drawal=2000,deposit=4000,check_balance;
		 switch(n)
		 {
		 case 1:
			 	amount=amount-with_drawal;
			 	System.out.println("The remaining amount is "+amount);
			 	break;
		 case 2:
			 	amount=amount+deposit;
			 	System.out.println("the remaining amount is "+amount);
		 case 3:
			 	System.out.println("the remaining amount is "+amount);
		 }
	 }
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		print(n);
	}

}
