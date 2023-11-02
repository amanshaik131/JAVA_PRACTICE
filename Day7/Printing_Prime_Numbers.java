/*Assignment 24: Printing Prime Numbers
You are creating a program to print all prime numbers between 1 and a given positive integer 'n'. 
The program should prompt the user to enter 'n' and 
then use a while loop to find and print all prime numbers from 1 to 'n'.*/

import java.util.Scanner;
class Printing_Prime_Numbers 
{
	public void print(int n)
	{
		int i=1,j,count;
		while(i<=n)
		{
			j=1;
			count=0;
					while(j<=i)
					{
						if(i%j==0)
						{
							count++;
						}
						j++;
					}
					if(count==2)
					{
						System.out.print(i+" ");
					}
			i++;
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of n  is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Printing_Prime_Numbers p=new Printing_Prime_Numbers();
		p.print(n);
		
	}

}
