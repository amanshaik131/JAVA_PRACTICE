/*11. Count Total Number of Duplicate Elements in an Array: Write a program to count
 *  the total number of duplicate elements in an array and display the count.*/

import java.util.Scanner;
class Count_Total_Number_of_Duplicate_Elements_in_an_Array 
{
	public static void print(int a[],int n)
	{
		int i,Total=0;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		boolean visited[]=new boolean[n];
		for(i=0;i<visited.length;i++)
		{
			visited[i]=false;
		}
		for(i=0;i<a.length;i++)
		{
			int count=1;
			if(visited[i]==true)
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					visited[j]=true;
					count++;
				}
			}
			if(count>1)
			{
			    Total++;
			}
		}
		System.out.println("The Total Duplicates Values are "+Total);
		
	}
	
	public  static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a,n);
	}
}
