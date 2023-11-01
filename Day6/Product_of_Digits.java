/*Assignment 15: Product of Digits
You are tasked with creating a program to calculate the product of digits of a given number. 
The program should prompt the user to enter a positive integer and then use a while loop 
to calculate and display the product of its digits.*/

import java.util.Scanner;
class Product_of_Digits 
{
	public static void main(String args[])
	{
		int n,prod=1,r;
		System.out.println("Enter the n value ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			prod=prod*r;
			n=n/10;
		}
		System.out.println("The product of given numbers are "+prod);
	}
}
