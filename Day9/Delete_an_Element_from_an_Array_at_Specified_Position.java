/*14. Delete an Element from an Array at Specified Position: 
 * Write a program to delete an element from an array at a specified position and
 *  display the updated array.*/

import java.util.Scanner;
class Delete_an_Element_from_an_Array_at_Specified_Position
{
	public static int[]  print(int a[])
	{
		int i,position;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position to be deleted ");
		Scanner sc=new Scanner(System.in);
		position=sc.nextInt();
			
		for(i=position;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
return a;
	}
	
	
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the size of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		a=print(a);
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
