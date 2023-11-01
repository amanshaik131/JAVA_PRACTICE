/*Assignment 8: Sum of Odd Numbers
You are tasked with creating a program to find the sum of all odd numbers between 1 and a given positive integer 'n'. The program should prompt the user to enter 'n' and
 then use a while loop to calculate the sum of all odd numbers from 1 to 'n'.*/


import java.util.Scanner;
class Sum_of_Odd_Numbers 
{

	public static void main(String[] args) 
	{
		int i=1,n,sumo=0;
		System.out.println("Enter the n value is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n)
		{
			if(i%2!=0)
			{
				sumo=sumo+i;
			}
			i++;
		}
		
		System.out.println("The sum of even natural numbers are "+sumo);
	

	}

}
