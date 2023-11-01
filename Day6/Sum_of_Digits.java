/*Assignment 14: Sum of Digits
You are designing a program to calculate the sum of digits of a given number. 
The program should prompt the user to enter a positive integer and then 
use a while loop to calculate and display the sum of its digits.*/

import java.util.Scanner;
class Sum_of_Digits 
{
	public static void main(String args[])
	{
		int sum=0,n,r;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("The sum of digits are "+sum);
	}
}
