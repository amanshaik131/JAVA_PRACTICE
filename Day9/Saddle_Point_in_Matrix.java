/*4. Saddle Point in Matrix: Write a program to find the saddle point(s) in a given matrix. 
 * A saddle point is an element that is the smallest in its row and largest in its column.*/

import java.util.Scanner;
class Saddle_Point_in_Matrix 
{
	public static void main(String args[])
	{
		int rows,cols,i,j,pos=0,min;
		System.out.println("Enter the size of rows ");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		System.out.println("Enter the size of cols ");
		cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		int b[]=new int[pos];
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.printf("Enter the value of a[%d][%d]",i,j);
				Scanner sc1=new Scanner(System.in);
				a[i][j]=sc1.nextInt();
			}
		}
		
		for(i=0;i<rows;i++)
		{
			min=a[i][0];
			for(j=0;j<cols;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					b[pos]=min;
					pos++;
				}
				
			}
		}
		for(i=0;i<rows;i++)
		{
			System.out.print(b[i]+"  ");
		}
			
		}
		
	}

