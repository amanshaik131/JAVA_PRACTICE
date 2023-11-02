/*Assignment 28: Printing Armstrong Numbers
You are tasked with creating a program to print all Armstrong numbers between 1 and a given positive integer 'n'. Armstrong numbers are those whose sum of cubes of individual digits is equal to the number itself. 
For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. 
The program should prompt the user to enter 'n' and then use a while loop to find and print all Armstrong numbers from 1 to 'n'.*/


/*Armstrong number is a number that is equal to the sum of cubes of its digits. 
 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
 * */

import java.util.Scanner;
class Printing_Armstrong_Numbers 
{
	public static void print(int n)
	{
			int i=1,sum=0,r,dup;
			
			while(i<=n)
			{
				dup=i;
				sum=0;
				
				    while(dup>0)
				    {
				    	r=dup%10;
				    	sum=sum+(r*r*r);
				    	dup=dup/10;
				    }
				  if(sum==i)
				  {
					  System.out.println(sum);
				  }
				i++;
			}
			
	}
	public static void main(String args[])
	{
		int n;
		System.out.print("Enterr the value ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		print(n);
		
	}

}
