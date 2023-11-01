/*Assignment 9: Multiplication Table
You are designing a program to print the multiplication table of a given number. 
The program should prompt the user to enter a positive integer 'n' and then
 use a while loop to print the multiplication table of 'n' up to 10.*/

import java.util.Scanner;
class Multiplication_Table 
{
	public static void main(String args[])
	{
		int i=1,n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=10)
		{
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}
}
