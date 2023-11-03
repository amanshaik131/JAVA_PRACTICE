/*2. Print All Negative Elements in an Array: 
 * Write a program to take an array as input and 
 * print all negative elements present in the array.*/

import java.util.Scanner;
class Print_All_Negative_Elements 
{
	public static void print(int a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			
			System.out.printf("Enter the Value of a[%d] is ",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.printf("The Negatives Values are a[%d] is %d\n",i,a[i]);
				
			}
			else
			{
				continue;
			}
			
		}
		
		
		
	
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the size of an Array is..");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a);
		
	}
}
