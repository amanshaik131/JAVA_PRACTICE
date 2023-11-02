/*Assignment 29: Perfect Number Checker
You are designing a program to check whether a number is a perfect number or not.
 Perfect numbers are those whose sum of proper divisors is equal to the number itself.
For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
The program should prompt the user to enter a number and 
then use a while loop to check whether the number is a perfect number or not.*/


import java.util.Scanner;
class Perfect_Number_Checker
{
	public int check(int n)
	{
		int i=1,sum=0;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		return sum;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of n to be checked ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Perfect_Number_Checker p=new Perfect_Number_Checker();
		int sum=p.check(n);
		if(sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number ");
		}
	}
}
