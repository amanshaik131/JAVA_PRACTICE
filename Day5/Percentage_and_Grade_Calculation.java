/*Assignment 13: Percentage and Grade Calculation
You are designing a program to input marks of five subjects: 
Physics, Chemistry, Biology, Mathematics, and Computer. 
Your program should calculate the percentage and 
grade according to the given criteria and display the result.*/
import java.util.Scanner;
class Percentage_and_Grade_Calculation 
{
	
	public String Grade(int marks1,int marks2,int marks3,int marks4,int marks5)
	{
		int total,avg,percentage;
		total=marks1+marks2+marks3+marks4+marks5;
		avg=total/5;
		
		percentage=(total*100)/500;
		System.out.println("The Percentage is "+percentage+"%");
		
		if((marks1>=35)&&(marks2>=35)&&(marks3>=35)&&(marks4>=35)&&(marks5>=35))
		{
			if((avg>=80)&&(avg<=100))
			{
				return "A-Grade";
			}
			else if((avg>=70)&&(avg<=79))
			{
				return "B-Grade";
			}
			else if((avg>=60)&&(avg<=69))
			{
				return "C-Grade";
			}
			else if((avg>=50)&&(avg<=59))
			{
				return "D-Grade";
			}
			else if((avg>=35)&&(avg<=49))
			{
				return "C-Grade";
			}
			else
			{
				return "Failed";
			}
		}
		else
		{
			return "Failed";
		}
		
		
	}
	public static void main(String args[])
	{
		int Physics, Chemistry, Biology, Mathematics,Computer,percent;
		System.out.println("Enter the Marks of physics ");
		Scanner sc=new Scanner(System.in);
		Physics=sc.nextInt();
		System.out.println("Enter the Marks of Chemistry ");
		Chemistry=sc.nextInt();
		System.out.println("Enter the marks of Biology ");
		Biology=sc.nextInt();
		System.out.println("Enter the marks of Mathematics ");
		Mathematics=sc.nextInt();
		System.out.println("Enter the marks of Computer ");
		Computer=sc.nextInt();
		Percentage_and_Grade_Calculation m=new Percentage_and_Grade_Calculation();
		String s=m.Grade(Physics,Chemistry,Biology,Mathematics,Computer);
		System.out.println(s);
		
		
	}

}
