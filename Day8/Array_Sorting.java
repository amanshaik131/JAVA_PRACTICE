/*3. Array Sorting: Write a program to sort the elements of an array in ascending or
 *  descending order. 
 * Allow the user to choose the sorting order from the menu.*/

import java.util.Scanner;
class Array_Sorting 
{
	public static int[] print(int a[])
	{
		int i,j,temp=0,k;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		System.out.println("Choose the Sorting Array ");
		System.out.println("Press 1 for Ascending Order ");
		System.out.println("Press 2 for Desending Order ");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		switch(k)
		{
		case 1:
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Ascending Order  of an array is ");
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			break;
		case 2:
			
				for(i=0;i<a.length;i++)
				{
					for(j=i+1;j<a.length;j++)
					{
						if(a[i]<a[j])
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
				}
				System.out.println("Descending Order of an array is ");
				for(i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
				break;
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
		
		print(a);

	}
}
