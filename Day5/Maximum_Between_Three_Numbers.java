/*Assignment 2: Maximum Between Three Numbers
You are creating a program to find the maximum between three numbers. 
Your program should prompt the user to enter three numbers, and 
then it should use conditional statements to determine and 
display the maximum of the three numbers.*/
import java.util.Scanner;
class Maximum_Between_Three_Numbers 
{
						//10,  20     30
		public void Max(int a,int b,int c)
		{		//10>=20 
			if((a>=b)&&(a>=c))
			{
				System.out.println("a is Maximum ");
			}
					//20>=10 && 20>=30
			else if((b>=a)&&(b>=c))
			{
				System.out.println("b is Maximum ");
			}
			else 
			{
				System.out.println("c is Maximum ");
			}
		
		}
		public static void main(String args[])
		{
			int a,b,c;
			System.out.println("Enter the value of a is  ");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("Enter the value of b is ");
			b=sc.nextInt();
			System.out.println("Enter the value of c is ");
			c=sc.nextInt();
			Maximum_Between_Three_Numbers m=new Maximum_Between_Three_Numbers();
			m.Max(a,b,c);//=>max(10,20,30)
		}
}
