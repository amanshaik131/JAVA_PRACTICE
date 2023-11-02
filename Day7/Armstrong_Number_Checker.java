/*Assignment 27: Armstrong Number Checker
You are creating a program to check whether a number is an Armstrong number or not. 
Armstrong numbers are those whose sum of cubes of individual digits is equal to the number itself. 
For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. The program should prompt the user to enter a number and 
then use a while loop to check whether the number is an Armstrong number or not.*/


/*Armstrong number is a number that is equal to the sum of cubes of its digits. 153*/
/*153=>1^3+5^3+3^3
 * 	=> 1+125+27
 * 	=>153
 */

import java.util.Scanner;
class Armstrong_Number_Checker
{
	public static int check(int n)
	{
		int sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
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
			System.out.println("Amstrong Number ");
		}
		else
		{
			System.out.println("Not Amstrong Number");
		}
	}
}
