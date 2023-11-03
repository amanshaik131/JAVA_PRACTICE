/*4. Find Second Largest Element in an Array: 
 * Write a program to find the second largest element in an array and display it.*/


import java.util.Scanner;
class Second_Largest_Element_in_an_Array
{
	public static void print(int a[])
	{
		 int i,max,smax=-2147483648;
		 for(i=0;i<a.length;i++)
		 {
			 System.out.printf("Enter the value of a[%d]",i);
			 Scanner sc=new Scanner(System.in);
			 a[i]=sc.nextInt();
		 }
		 max=a[0];
		 for(i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		 System.out.println("The First Largest Maximum Value is "+max);
		 for(i=0;i<a.length;i++)
		 {
			 if((a[i]>smax)&&(a[i]<max))
			 {
				 smax=a[i];
			 }
		 }
		 
		 System.out.println("The Second largest Maximum value is "+smax);
		 
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the size of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a);
	}

}
