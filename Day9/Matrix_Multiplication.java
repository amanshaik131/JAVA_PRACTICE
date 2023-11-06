/*2. Matrix Multiplication: Write a program to take two 2D arrays as input and 
 * perform matrix multiplication. 
 * Display the resulting matrix.*/


import java.util.Scanner;
class Matrix_Multiplication 
{
	public static void main(String args[])
	{
		int m,n,p,q,i,j,sum;
		System.out.println("Enter the number of rows of first matrix ");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		System.out.println("Enter the number of cols of first matrix ");
		n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the number of rows  of second matrix ");
		p=sc.nextInt();
		System.out.println("Enter the number of cols of second matrix ");
		q=sc.nextInt();
		
		if(n==p)
		{
			System.out.println("Enter the first Matrix........");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.printf("Enter the value of a[%d][%d] ",i,j);
					Scanner sc1=new Scanner(System.in);
					a[i][j]=sc1.nextInt();
				}
			}
			System.out.println("Enter the Second Matrix ..........");
			
			
			
			int b[][]=new int[p][q];
			for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
				{
					System.out.printf("Enter the value of b[%d][%d] ",i,j);
					Scanner sc2=new Scanner(System.in);
					b[i][j]=sc2.nextInt();
				}
			}
			
			int c[][]=new int[m][q];
				for(i=0;i<m;i++)
				{
					for(j=0;j<q;j++)
					{
						sum=0;
						for(int k=0;k<m;k++)
						{
							
							sum=sum+a[i][k]*b[k][j];
							c[i][j]=sum;
						}
					}
				}
				for(i=0;i<m;i++)
				{
					for(j=0;j<q;j++)
					{
						System.out.print(c[i][j]+"   ");
					}
					System.out.println();
				}
		}
		else
		{
			System.out.println("Matrix Multiplication is not possible .....");
		}
	}
}
