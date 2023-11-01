/*Assignment 10: Counting Digits
You are creating a program to count the number of digits in a given number.
 The program should prompt the user to enter a positive integer and then
 use a while loop to count the number of digits in the input number.*/


import java.util.Scanner;
class Counting_Digits 
{

	public static void main(String[] args) 
	{
		int r,count=0,n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			count++;
			n=n/10;
		}
		System.out.println("The count of digits of a given number is "+count);
	}

}
