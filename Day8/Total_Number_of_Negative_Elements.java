import java.util.Scanner;
class Total_Number_of_Negative_Elements 
{
	public static void print(int a[])
	{
		int i,count=0;
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
				count++;
			}
		}
		System.out.println("The Total number of negative numbers are "+count);
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

