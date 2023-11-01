/*Assignment 6: Sum of Natural Numbers
You are creating a program to calculate the sum of all natural numbers
 up to a given positive integer 'n'. 
 The program should prompt the user to enter 'n' and then 
 use a while loop to calculate the sum of all numbers from 1 to 'n'.*/

import java.util.Scanner;
class Sum_of_Natural_Numbers 
{
	public static void main(String args[])
	{
		int n,sum=0,i=1;
		System.out.println("Enter the n value is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of all Natural Numbers are "+sum);
		
	}
}
