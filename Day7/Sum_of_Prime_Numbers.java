/*Assignment 25: Sum of Prime Numbers
You are tasked with creating a program to find the sum of all prime numbers 
between 1 and a given positive integer 'n'. The program should prompt the user to enter 'n' and then 
use a while loop to  find the sum of all prime numbers from 1 to 'n'.*/


import java.util.Scanner;
class Sum_of_Prime_Numbers 
{
	public int sum_of_prime(int n)
	{
		int i=1,j,count,sum=0;
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
				  sum=sum+i;
			  }
			  i++;
		}
	
		return sum;
	}
	public  static void main(String args[])
	{
		int n;
		System.out.println("Enterr the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Sum_of_Prime_Numbers s=new Sum_of_Prime_Numbers();
		int res=s.sum_of_prime(n);
		System.out.println("The sum of Prime Numbers are "+res);
	}
}