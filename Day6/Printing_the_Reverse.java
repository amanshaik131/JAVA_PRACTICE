/*Assignment 16: Printing the Reverse
You are creating a program to enter a number and print its reverse. 
The program should prompt the user to enter a positive integer and 
then use a while loop to print the reverse of the input number.*/

import java.util.Scanner;
class Printing_the_Reverse 
{
	public static void main(String args[])
	{
		int n,r,sum=0;
		System.out.println("Enter the number of n  is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("The Reverse of a number is "+sum);
	}
}
