/*Assignment 2: Printing Natural Numbers in Reverse
You are tasked with creating a program that prints natural numbers in reverse order. 
The program should prompt the user to enter a positive integer 'n'. 
It should then use a while loop to print all the natural numbers from 'n' to 1 on the screen.*/

import java.util.Scanner;
public class Natural_Numbers_in_Reverse 
{

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			System.out.println(n);
			n--;
		}
		
	}

}
