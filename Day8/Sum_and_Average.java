/*1. Find the Sum and Average: Write a program to take an array as input and
 *  calculate the sum and average of its elements. 
 * Display both the sum and average.*/
//NOV 3

import java.util.Scanner;
class Sum_and_Average 
{
	public static void print(int a[],int n)
	{
		int i,sum=0;
		double avg;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the Value of a[%d]",i);
			Scanner sc1=new Scanner(System.in);
			a[i]=sc1.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The sum is "+sum);
		avg=sum/n;
		System.out.println("The Avg is "+avg);
		
		
	}
	
	public static void main(String args[])
	{
		int n,i;
		System.out.println("Enter the number of elements to be entered ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		
		print(a,n);
		System.out.println(".................................................");
		
	}
}
