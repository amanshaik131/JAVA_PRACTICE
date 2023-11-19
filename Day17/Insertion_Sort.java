import java.util.Scanner;
public class Insertion_Sort 
{
	
	public static void main(String[] args) 
	{
	   int a[]=new int[5];
	   int temp,i,j;
	   System.out.println("Enter the number of elements ");
	   Scanner sc=new Scanner(System.in);
	   for(i=0;i<a.length;i++)
	   {
		   System.out.printf("Enter the value of a[%d]",i);
		   a[i]=sc.nextInt();
	   }
	
	   for(i=1;i<a.length;i++)
	   {
		   temp=a[i];
		   j=i-1;
		     while((j>=0)&&(temp<a[j]))
		     {
		    	 a[j+1]=a[j];
		    	 j--;
		     }
		     a[j+1]=temp;
	   }

	   System.out.println("The SSorted array is ");
	   for(i=0;i<a.length;i++)
	   {
		   
		   System.out.println(a[i]);
	   }
	}

}
