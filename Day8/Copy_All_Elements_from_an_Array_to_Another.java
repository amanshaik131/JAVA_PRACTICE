/* 
8. Copy All Elements from an Array to Another Array:
 Write a program to copy all elements from one array to another array and display 
 the elements of the second array.*/

import java.util.Scanner;
class Copy_All_Elements_from_an_Array_to_Another 
{
	public static void print(int a[],int n)
	{
		int i;
		int b[]=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		for(i=0;i<a.length;i++)
		{
			System.out.printf("The value of b[%d] is %d\n",i,b[i]);
		}
		
		
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the size of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a,n);
	}
}
