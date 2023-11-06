/*1. Matrix Addition: Write a program to take two 2D arrays of the same dimensions as 
 * input and perform matrix addition. 
 * Display the resulting matrix.*/
import java.util.Scanner;
class Matrix_Addition 
{
	
	
	
	public static void main(String args[]) 
	{
		int rows,cols,rows1,cols1,i,j;
		
		System.out.println("Enter the number of rows of first matrix ");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		System.out.println("Enter the number of cols of first matrix ");
		cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		
		System.out.println("Enter the number of rows of second matrix ");
		rows1=sc.nextInt();
		System.out.println("Enter the number of cols of second matrix ");
		cols1=sc.nextInt();
		
		int b[][]=new int[rows1][cols1];
		
		System.out.println("Enter the First Matrix...........");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.printf("Enter the value of a[%d][%d] ",i,j);
				Scanner sc1=new Scanner(System.in);
				a[i][j]=sc1.nextInt();
			}
		}
		
		System.out.println("Enter the Second Matrix ........");
		for(i=0;i<rows1;i++)
		{
			for(j=0;j<cols1;j++)
			{
				System.out.printf("Enter the value of b[%d][%d] ",i,j);
				Scanner sc2=new Scanner(System.in);
				b[i][j]=sc2.nextInt();
			}
		}
		
		if((rows==rows1)&&(cols==cols1))
		{
			int c[][]=new int[rows][cols];
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					System.out.print(c[i][j]+"  ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Matrix Addition Not Possible........ ");
		}
	}
}
