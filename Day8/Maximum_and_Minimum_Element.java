/*5. Find Maximum and Minimum Element in an Array: 
 * Write a program to find the maximum and minimum elements in an array and 
 * display both.*/

import java.util.Scanner;
class Maximum_and_Minimum_Element 
{
	public static void print(int a[])
	{
		int i,max,min;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The Maximum Value of an array is "+max);
		System.out.println("The Minimum Value of an array is "+min);
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a);
		
	}
}
