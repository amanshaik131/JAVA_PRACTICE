/*Assignment 12: Sum of First and Last Digit
You are tasked with creating a program to find the sum of the first and last digits of a given number. 
The program should prompt the user to enter a positive integer and then use a while loop to calculate and 
display the sum of the first and last digits of the input number.*/


import java.util.Scanner;
class Sum_of_First_and_Last_Digit {

	public static void main(String[] args) 
	{
		int n,r,first_digit=0,last_digit=0;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		last_digit=n%10;
		while(n>0)
		{
			r=n%10;
			first_digit=r;
			n=n/10;
		}
		
		System.out.println("The sum of first digit and last digit is "+(first_digit+last_digit));

	}

}
