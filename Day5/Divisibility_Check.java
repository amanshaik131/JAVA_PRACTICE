/*Assignment 4: Divisibility Check
You are designing a program to check whether a number is divisible by 5 and 11 or not. 
Your program should prompt the user to enter a number, and 
then it should use conditional statements to check and display 
whether the number is divisible by both 5 and 11.*/
/*5 and 11 ->55 ,110,165,*/
import java.util.Scanner;
public class Divisibility_Check 
{
	public void divisible(int n)
	{
		if((n%5==0)&&(n%11==0))
		{
			System.out.println("n is Divisbile by 5 and 11 ");
		}
		else
		{
			System.out.println("n is not Divisible by 5 and 11 ");
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of n is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 Divisibility_Check m=new  Divisibility_Check();
		 m.divisible(n);
		}
}
