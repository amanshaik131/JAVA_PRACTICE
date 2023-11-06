/*5. Boundary Elements of Matrix: Write a program to print the boundary elements
 *  of a 2D matrix
 *  (elements in the first row, last row, first column, and last column). */


import java.util.Scanner;
class Boundary_Elements_of_Matrix 
{
	public static void main(String args[])	
	{
	     int rows,cols,i,j;
	   
	  System.out.println("Enter the rows");
	  Scanner sc=new Scanner(System.in);
	  rows=sc.nextInt();
	  System.out.println("Entrr the cols");
	  cols=sc.nextInt();
	int a[][]=new int[rows][cols];    	
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
	   for(j=0;j<cols;j++)	
	   {
	        if((i==0)||(j==0)||(i==rows-1)||(j==cols-1))	
	       {
	            System.out.print(a[i][j]+"     ");
	       }
	     else	
	      {
	             System.out.print("      ");
                       }
	   }
	System.out.println();
	}
	}
}
