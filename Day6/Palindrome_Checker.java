/*Assignment 13: Palindrome Checker
You are creating a program to check whether a given positive integer is a palindrome or not.
 Palindromic numbers are those that remain the same when their digits are reversed. 
 Your program should prompt the user to enter a number, and then 
 it should check whether the number is a palindrome or not. To accomplish this, 
 you decide to use a while loop to reverse the digits of the number and 
 compare the reversed number with the original input.*/

import java.util.Scanner;
class Palindrome_Checker 
{
	public static void main(String args[])
	{
		int n,dup,sum=0,r;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		dup=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
	
		if(sum==dup)
		{
			System.out.println("Palindrome Number ");
		}
		else
		{
			System.out.println("Not Palindrome Number ");
		}
		
	}

}
