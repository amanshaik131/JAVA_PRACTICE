/*Assignment 20: Power of a Number
You are creating a program to find the power of a number using a for loop. 
The program should prompt the user to enter the base and exponent, and 
then use a for loop to calculate and display the result.*/

import java.util.Scanner;
class Power_Of_a_Number 
{
	public int pow(int base,int exponent)
	{
		int prod=1;
		for(int i=1;i<=exponent;i++)
		{
			prod=prod*base;
		}
		return prod;
	}
	public static void main(String args[])
	{
		int base,exponent;
		System.out.println("Enter the base");
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		System.out.println("Enter the exponent");
		exponent=sc.nextInt();
		Power_Of_a_Number p=new Power_Of_a_Number();
		int power=p.pow(base,exponent);
		System.out.println("The Power of a number is "+power);
	}

	
}
