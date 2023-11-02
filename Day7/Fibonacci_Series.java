/*Assignment 33: Fibonacci Series
You are creating a program to generate the Fibonacci series up to 'n' terms. 
The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones. 
For example, the first ten terms of the Fibonacci series are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34. 
The program should prompt the user to enter the number of terms 'n' and then use a while loop to generate the Fibonacci series up to 'n' terms. 
It should then print each term in the series as it is generated.*/

import java.util.Scanner;
class Fibonacci_Series 
{
	public static void series(int n)
	{
		int a=0,b=1,i=1,c;
		System.out.print(a+" "+b+" ");
		while(i<=n)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		 
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		series(n);
	}

}
