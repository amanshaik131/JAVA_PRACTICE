/*Assignment 5: Even or Odd Check
You are creating a program to check whether a number is even or odd.
 Your program should prompt the user to enter a number, and 
 then it should use conditional statements to check and 
 display whether the number is even or odd.*/

import java.util.Scanner;
class Even_or_Odd_Check 
{
	public void  check(int n)
	{
		if(n%2==0)
		{
			System.out.println("n is Even");
		}
		else
		{
			System.out.println("n is Odd ");
		}
	}
	static public void main(String args[])
	{
		int n;
		System.out.println("Enter the n value is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Even_or_Odd_Check m=new Even_or_Odd_Check();
		m.check(n);
	}
}
