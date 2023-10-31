/*Assignment 12: Counting Total Number of Notes
You are tasked with creating a program to count the 
total number of notes for a given amount.
 Your program should prompt the user to enter an amount, and 
 then it should use conditional statements to calculate and
  display the total number of notes of various denominations.*/

import java.util.Scanner;
class Counting_Total_Number_of_Notes 
{
	public void count(int amount)
	{
		if(amount>=500)
		{
			int note500=amount/500;
			System.out.println("The 500 notes are "+note500);
			amount=amount%500;
		}
		if(amount>=200)
		{
			int note200=amount/200;
			System.out.println("The 200 notes are "+note200);
			amount=amount%200;
		}
		if(amount>=100)
		{
			int note100=amount/100;
			System.out.println("The 100 notes are "+note100);
			amount=amount%100;
		}
		if(amount>=50)
		{
			int note50=amount/50;
			System.out.println("The 50 notes are "+note50);
			amount=amount%50;
		}
		if(amount>=20)
		{
			int note20=amount/20;
			System.out.println("The 20 notes are "+note20);
			amount=amount%20;
		}
		if(amount>=10)
		{
			int note10=amount/10;
			System.out.println("The 10 notes are "+note10);
			amount=amount%10;
		}
	}
	public static void main(String args[])
	{
		int amount;
		System.out.println("Enter the amount to be counted ");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		Counting_Total_Number_of_Notes m=new Counting_Total_Number_of_Notes();
		m.count(amount);
	}
}
