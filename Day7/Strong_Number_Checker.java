/*Assignment 31: Strong Number Checker
You are tasked with creating a program to check whether a number is a strong number or not.
 Strong numbers are those whose sum of factorial of individual digits is equal to the number itself. For example, 145 is a strong number because 1! + 4! + 5! = 145. 
 The program should prompt the user to enter a number and
 then use a while loop to check whether the number is a strong number or not.*/
/*Strong number is a special number 
 * whose sum of the factorial of digits is equal to the original number
 * 145=>1!+4!+5!
 *    =>1+24+120
 *    =>145*/

import java.util.Scanner;
class Strong_Number_Checker 
{
	public static int check(int n)
	{
		int i=1,sum=0,fact,r;
		while(n>0)
		{
			fact=1;
			r=n%10;
			while(r>0)
			{
				fact=fact*r;
				r--;
			}
			sum=sum+fact;
			n=n/10;
		}
		return sum;
	}
		public static void main(String args[])
		{
			int n;
			System.out.println("Enter the value of n is ");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int res=check(n);
			if(res==n)
			{
				System.out.println("Strong Number ");
			}
			else 
			{
				System.out.println("Not Strong Number ");
			}
		}
}
