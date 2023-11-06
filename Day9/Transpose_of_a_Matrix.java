/*3. Transpose of a Matrix: Write a program to take a 2D array as input and 
 * find its transpose. 
 * Display the original and transposed matrices.*/


import java.util.Scanner;
class Transpose_of_a_Matrix 
{
    public static void main(String args[])
    {
    	int rows,cols,i,j;
    	System.out.println("Enter the number of rows of a matrix ");
    	Scanner sc=new Scanner(System.in);
    	rows=sc.nextInt();
    	System.out.println("Enter the number of cols of a matrix ");
    	cols=sc.nextInt();
    	int a[][]=new int[rows][cols];
    	int b[][]=new int[cols][rows];
    	for(i=0;i<rows;i++)
    	{
    		for(j=0;j<cols;j++)
    		{
    			System.out.printf("Enter the value of a[%d][%d] ",i,j);
    			Scanner sc1=new Scanner(System.in);
    			a[i][j]=sc1.nextInt();
    			b[j][i]=a[i][j];
    		}
    	}

    	for(i=0;i<cols;i++)
    	{
    		for(j=0;j<rows;j++)
    		{
    			System.out.print(b[i][j]+"   ");
    		}
    		System.out.println();
    	}
    	
    }
}
