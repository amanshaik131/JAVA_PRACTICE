/*Assignment 22: Factorial Calculation
You are tasked with creating a program to calculate the factorial of a number. 
The program should prompt the user to enter a positive integer and
 then use a while loop to calculate and display the factorial of the input number.*/

import java.util.Scanner;
class Factorial_Calculation 
{
	public int factorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Factorial_Calculation f=new Factorial_Calculation();
		int fact=f.factorial(n);
		System.out.println("The Factorial of a number is "+fact);
	}
}
