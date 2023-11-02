/*Assignment 32: Printing Strong Numbers
You are designing a program to print all strong numbers between 1 and a given positive integer 'n'. 
Strong numbers are those whose sum of factorial of individual digits is equal to the number itself. 
For example, 145 is a strong number because 1! + 4! + 5! = 145. 
The program should prompt the user to enter 'n' and then use a while loop to find and 
print all strong numbers from 1 to 'n'.*/

import java.util.Scanner;
class Printing_Strong_Numbers
{
	public static void print(int n)
	{
		int i=1,sum,fact,r,dup;
		while(i<=n)
		{
			sum=0;
			
			dup=i;
				 while(dup>0)
				 {
					 fact=1;
					 r=dup%10;
					 while(r>0)
					 {
						 fact=fact*r;
						 r--;
					 }
					 sum=sum+fact;
					 dup=dup/10;
				 }
				 if(sum==i)
				 {
					 System.out.println(i);
				 }
			
			i++;
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the  value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		print(n);
	}
}
