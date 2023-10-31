/*Assignment 6: Leap Year Check
You are tasked with creating a program to check whether a year is a leap year or not. 
Your program should prompt the user to enter a year, and 
then it should use conditional statements to check and display
 whether the year is a leap year or not*/

import java.util.Scanner;
class Leap_Year_Check 
{
	public void check(int year)
	{
		if(year%4==0)
		{
			if((year%100!=0)&&(year%400==0))
			{
			System.out.println("n is Leap Year");
			}
			else
			{
				System.out.println("n is not leap year");
			}
		}
		else 
		{
			System.out.println("n is not Leap Year ");
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Leap_Year_Check m=new Leap_Year_Check();
		m.check(n);
		
		
	}
}
