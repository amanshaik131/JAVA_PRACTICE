/*Assignment 16: Day of Week Using Switch Case
You are designing a program to print the name of the day of the week using a switch case.
 Your program should prompt the user to enter a week number (1 to 7),
  and then it should use a switch case to determine and 
  display the respective day of the week.*/

import java.util.Scanner;
class Day_of_Week_without_SC
{
	public String check(int n)
	{
		String result="aman";
		if((n==1))
		{
			result="Sunday";
		}
		else if((n==2))
		{
			result="Monday";
			
		}
		else if(n==3)
		{
			result="Tuesday";
		}
		else if(n==4)
		{
			result="Wednesday";
		}
		else if(n==5)
		{
			result="Thursday";
			
		}
		else if(n==6)
		{
			result="Friday";
		}
		else if(n==7)
		{
			result="Saturday";
		}
		else
		{
			result="Please Enter Valid Number ";
		}
		return result;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value between 1 to 7 is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Day_of_Week_without_SC s=new Day_of_Week_without_SC();
		String result=s.check(n);
		System.out.println(result);
	}
}
