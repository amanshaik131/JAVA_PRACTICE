/*Assignment 23: Prime Number Checker
You are designing a program to check whether a number is a prime number or not. 
The program should prompt the user to enter a positive integer and then 
use a while loop to check whether the number is prime or not.*/

import java.util.Scanner;
class Prime_Number_Checker 
{
	public int check(int n)
	{
		int count=0,i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		
		int n;
		System.out.println("Enter the value of n is  ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Prime_Number_Checker p=new Prime_Number_Checker();
		int check=p.check(n);
		if(check==2)
		{
			System.out.println("Prime Number ");
		}
		else 
		{
			System.out.println("Not Prime Number");
		}
	}

}
