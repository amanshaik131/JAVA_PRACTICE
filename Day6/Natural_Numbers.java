/*   date :	NOVEMBER _1
 * 
 * Assignment 1: Printing Natural Numbers
You are designing a program to help students learn about natural numbers. 
Your program should prompt the user to enter a positive integer 'n'. 
It should then use a while loop to print all the natural numbers from 1 to 'n' on the screen.*/



import java.util.Scanner;
class Natural_Numbers 
{
  public static void main(String args[])
  {
	  int i=1,n;
	  System.out.println("Enter the n value ");
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  while(i<=n)
	  {
		  System.out.println(i);
		  
		  i++;
	  }
  }
}
