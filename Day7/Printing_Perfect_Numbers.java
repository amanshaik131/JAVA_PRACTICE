/*Assignment 30: Printing Perfect Numbers
You are creating a program to print all perfect numbers between 1 and a given positive integer 'n'.
 Perfect numbers are those whose sum of proper divisors is equal to the number itself.
  For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. The program should prompt the user to enter 'n' and then use a while loop to find and print all perfect numbers from 1 to 'n'.*/

import java.util.Scanner;
class Printing_Perfect_Numbers 
{
	public void print(int n)
	{
		int i=1,j,sum;  
		while(i<=n)
		{
			j=1;
			sum=0;
				while(j<i)
				{
					if(i%j==0)
					{
						sum=sum+j;
					}
					j++;
				}
			if(sum==i)
			{
				System.out.println("The values aree "+i);
			}
			
			i++;
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Printing_Perfect_Numbers p=new Printing_Perfect_Numbers();
		p.print(n);
		
	}
}
