/*34. You are tasked with developing a simple menu-driven bank transaction application.
 * The application should allow users to perform three types of transactions:
 *  deposit, withdraw, and check balance. 
 *  The user should be able to select any of these options from the menu
 *   and enter the necessary amount for the transaction.
 *    After each transaction, the user's updated balance should be displayed.
 *     The user can continue performing transactions until they manually choose to stop.
*/


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
	 
		public static void print()
		{
			int n,with_drawal,deposit,amount=15000;
			 
			  
			  while(true)
			  {
				  System.out.println("1.With_Drawal amount ");
				  System.out.println("2.deposit amount ");
				  System.out.println("3.check_balance");
				  System.out.println("4.exit");
				  Scanner sc=new Scanner(System.in);
				  n=sc.nextInt();
			  switch(n)
			  {
			  case 1:
				  	  System.out.println("Enter the With_Drawal amount is ");
				  	  with_drawal=sc.nextInt();
				  	  if(with_drawal<=amount)
				  	  {
				  		  amount=amount-with_drawal;
				  		  System.out.println("The amount after with drawal is "+amount);
				  	  }
				  	  else
				  	  {
				  		  System.out.println("In Sufficient Funds ");
				  	  }
				  	  break;
			  case 2:
				  	 System.out.println("Enter the deposit amount is ");
				  	 deposit=sc.nextInt();
				  	 if(deposit>0)
				  	 {
				  		 amount=amount+deposit;
				  		 System.out.println("The amount after deposit is "+amount);
				  	 }
				  	 else
				  	 {
				  		 System.out.println("Please Enter Valid Amount to be Deposit");	
				  	 }
				  	 break;
			  case 3:
				  	 
				  	 System.out.println("The Remaining Balance is "+amount);
				  	 
				  	 break;
			  case 4:
				  	  System.out.println("Thank You ");
				  	  System.exit(0);
				  	  break;
			   default:
				   System.out.println("Please Enter Valid Option");
		}
			  }
		}
	 public static void main(String args[])
	 {
		print(); 
	 }
}

