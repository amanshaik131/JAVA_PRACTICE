/**/

import java.util.Scanner;
class Menu_based_application_on_Array_Operations
{
	public static void main(String args[])
	{
		int n,i,j,choice,last_element,first_element;
		System.out.println("Enter the size of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		for(i=0;i<n;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc1=new Scanner(System.in);
			a[i]=sc1.nextInt();
		}
	     System.out.println("1.Insert an element in first index");
        System.out.println("2.Insert an element in last index");
        System.out.println("3.Insert an element in specified index");
        System.out.println("4.Remove element from first index");
        System.out.println("5.Remove element from last index");
        System.out.println("6.Remove element from specified index");
        System.out.println("7.Remove user entered element");
        System.out.println("8.Display all in ASC/DESC order");

		System.out.println("Enter the choice....");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			    System.out.println("Enter the first element to be stored ");
			    first_element=sc.nextInt();
			    a[1]=first_element;
			    for(i=0;i<n;i++)
			    {
			    	System.out.print(a[i]+" ");
			    }
			break;
		case 2:
			System.out.println("Enter the last element to be stored ");
			last_element=sc.nextInt();
			a[n-1]=last_element;
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+"  ");
			}
			break;
		case 3:
				System.out.println("Enter the new element to be stored");
				int new_element=sc.nextInt();
				System.out.println("Enter the position to be inserted ");
				int pos=sc.nextInt();
				for(i=0;i<b.length;i++)
				{
					if(i==pos)
					{
						b[i]=new_element;
					}
					else if(i>pos)
					{
						b[i]=a[i-1];
					}
					else
					{
						b[i]=a[i];
					}

				}
				for(i=0;i<b.length;i++)
				{
				  System.out.print(b[i]+"  ");
				}
					break;
					
		case 4:
			     a[1]=0;
			     for(i=0;i<n;i++)
			     {
			    	 System.out.print(a[i]+" ");
			    	 
			     }
			     break;
		case 5:
				 a[n-1]=0;
				 for(i=0;i<n;i++)
				 {
					 System.out.print(a[i]+" ");
				 }
				 break;
		case 6:
				
		}
	}
}