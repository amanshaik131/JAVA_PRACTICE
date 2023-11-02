/*Assignment 26: Prime Factors
You are designing a program to find all prime factors of a number. 
The program should prompt the 
user to enter a positive integer and then use a while loop to find and
 display all prime factors of the input number.*/
import java.util.Scanner;
class Prime_Factor 
{
	
	public static void print(int n)
	{
		int i=2,k;
		while(i<n) 
		{
		   if(n%i==0)
	               	{
		   k=1;
		  int count=0;
		        while(k<=i)
		       {
			if(i%k==0)
			{
		 	  count++;	
			}
		     k++;
		       }
		  if(count==2)
		{
		   System.out.println(i);
		}
			
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
