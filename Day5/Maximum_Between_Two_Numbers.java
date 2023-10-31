/*Assignment 1: Maximum Between Two Numbers
You are designing a program to find the maximum between two numbers. 
Your program should prompt the user to enter two numbers, and
 then it should use conditional statements to determine and 
 display the maximum of the two numbers.
 */
import java.util.Scanner;
class Maximum_Between_Two_Numbers
{
	public void Max(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is Maximum");
		}
		else if(b>a)
		{
			System.out.println("b is Maximum");
		}
		else
		{
			System.out.println("Both are Equal ");
		}
	}
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter the value of a is  ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the value of b is ");
		b=sc.nextInt();
		Maximum_Between_Two_Numbers m=new Maximum_Between_Two_Numbers();
		m.Max(a,b);
	}
}
