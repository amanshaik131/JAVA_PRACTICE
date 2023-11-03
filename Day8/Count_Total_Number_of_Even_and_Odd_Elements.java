/*6. Count Total Number of Even and Odd Elements in an Array: 
 * Write a program to count the total number 
 * of even and odd elements in an array and display the counts.*/
import java.util.Scanner; 
class Count_Total_Number_of_Even_and_Odd_Elements 
{
	public static void print(int a[])//5
	{
		
		int i,count_even=0,count_odd=0;
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d] is ",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}	
								       
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count_even++;
			}
			else 
			{
				count_odd++;
			}
		}
		System.out.println("The Total Number of Even Elements are "+count_even); 
		System.out.println("The Total Number of Odd Elements are "+count_odd);
	}
	public static void main(String args[])
	{
		int n,count_even=0,count_odd=0;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();//5
		int a[]=new int[n];  
		print(a);
	}
}
