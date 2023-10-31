/*Assignment 3: Positive, Negative, or Zero
You are tasked with creating a program to 
check whether a number is negative, positive, or zero. 
Your program should prompt the user to enter a number, and 
then it should use conditional statements to determine and 
display whether the number is negative, positive, or zero.*/

import java.util.Scanner;
class Positive_Negative_or_Zero 
{
	public void Result(int n)
	{
		if(n>0)
		{
			System.out.println(" n value is Positive ");
		}
		else if(n<0)
		{
			System.out.println("n value is Negative ");
		}
		else
		{
			System.out.println("n value is Equal to Zero ");
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the n value is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Positive_Negative_or_Zero m=new Positive_Negative_or_Zero();
		m.Result(n);
	}

}
