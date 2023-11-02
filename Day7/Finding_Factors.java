/*Assignment 21: Finding Factors	
You are designing a program to find all factors of a number.
 The program should prompt the user to enter a positive integer and then use a 
while loop to find and display all factors of the input number.*/

import java.util.Scanner;
class Finding_Factors 
{
	public void factors(int n)
	{
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
		
		
	}

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the n value ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Finding_Factors f=new Finding_Factors();
		f.factors(n);
		
		
		
	}

}
