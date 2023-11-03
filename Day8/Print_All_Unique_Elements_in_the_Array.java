/*10. Print All Unique Elements in the Array: Write a program to print all 
 * unique elements in an array
 *  (elements that occur only once).*/

import java.util.Scanner;
class Print_All_Unique_Elements_in_the_Array 
{
	public static void print(int a[],int n)
	{
		int i;
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
			if(count==1)
			{
			System.out.println("The Unique element is "+a[i]);
			}
		}
		
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
