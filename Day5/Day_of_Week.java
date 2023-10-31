/*Assignment 11: Day of Week
You are creating a program to input a week number and print the corresponding day of the week.
 Your program should prompt the user to enter a week number (1 to 7), and 
 then it should use a switch case to determine and 
display the respective day of the week.*/

import java.util.Scanner;
class Day_of_Week 
{
	public String check(int n)
	{
		String result="0";
		switch(n)
		{
		case 1 :
				result="Sunday";
				break;
		case 2 :
				result="Monday";
				break;
				
		case 3 :
				result="Tuesday";
				break;
			
		case 4:
				result="Wednesday";
				break;
			
		case 5:
				result="Thursday";
				break;
			
		case 6:
				result="Friday";
				break;
			   
		case 7:
				result="Saturday";
				break;
				
		}
		
		return result;
	}
	static public void main(String args[])
	{
		int n;
		System.out.println("Enter  a number between 1 to 7 ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Day_of_Week m=new Day_of_Week();
		String Day=m.check(n);
		System.out.println("The Day is "+Day);
	}
}
