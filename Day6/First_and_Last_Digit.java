/*Assignment 11: First and Last Digit
You are designing a program to find the first and last digit of a given number. 
The program should prompt the user to enter a positive integer and then 
use a while loop to extract and display the first and last digits of the input number.*/

import java.util.Scanner;
class First_and_Last_Digit 
{
	public static void main(String args[])
	{
		int n,r,first_digit=0,last_digit=0;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		last_digit=n%10;
		while(n>0)
		{
			r=n%10;
			first_digit=r;
			n=n/10;
		}
		System.out.println("The First Digit is "+first_digit);
		System.out.println("The Last Digit is "+last_digit);
		
	}
}
