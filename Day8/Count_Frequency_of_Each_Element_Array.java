/*9. Count Frequency of Each Element in an Array : Write a program to count the frequency 
of each element in an array and
 *  display the elements along with their frequencies.*/
import java.util.Scanner;
class Count_Frequency_of_Each_Element_Array 
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
			
			System.out.println(a[i]+"="+count);
			
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
