/*15. Search Element in Array: Write a program to take an array and a key element as input.
 *  Search for the key element in the array and display its position/index if found, 
 * otherwise display "Element not found."*/

import java.util.Scanner;
class Search_Element_in_Array 
{
	public static void  print(int a[])
	{
		int i,key_element,flag=0;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d] ",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key element to be searched ");
		Scanner sc=new Scanner(System.in);
		key_element=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key_element)
			{
				System.out.println("element is found at "+i+" "+"position");
				flag=1;
				
				
			}
		}
		if(flag==0)
		{
			System.out.println("Element  not found ");
		}
		
	}
	
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the size of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a);
	}
}
