import java.util.Scanner;
public class Bubble_Sort 
{

	public static void main(String[] args) 
	{
		int i,j,n=4,temp;
		boolean bool;
		int a[]=new int[n];
		System.out.println("Enter the values ");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			System.out.printf("Enter the values of a[%d]",i);
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			bool=false;
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				bool=true;
				}
			}
		
		if(bool=false)
			{
				break;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
