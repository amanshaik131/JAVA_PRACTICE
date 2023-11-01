/*Assignment 7: Sum of Even Numbers
You are designing a program to find the sum of all even numbers
 between 1 and a given positive integer 'n'. 
 The program should prompt the user to enter 'n' and then 
use a while loop to calculate the sum of all even numbers from 1 to 'n'.
 * */
import java.util.Scanner;
class Sum_of_Even_Numbers 
{	
		public static void main(String args[])
		{
			int i=1,n,sume=0;
			System.out.println("Enter the n value is ");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			while(i<=n)
			{
				if(i%2==0)
				{
					sume=sume+i;
				}
				i++;
			}
			
			System.out.println("The sum of even natural numbers are "+sume);
		}
	
}
