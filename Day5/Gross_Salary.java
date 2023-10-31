/*Assignment 14: Gross Salary Calculation
You are creating a program to input the basic salary of an employee and calculate the gross salary according to the given conditions. Your program should use conditional statements to determine the HRA and DA percentages based on the basic salary and then calculate the gross salary.*/
/*Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.Scanner;
class Gross_Salary 
{
	public static float Gross(int basic_salary)
	{
		float HRA=0,DA=0;
		if((basic_salary<=10000))
		{
			HRA=basic_salary*20/100;
			DA=basic_salary*80/100;
		}
		else if((basic_salary<=20000))
		{
			HRA=basic_salary*25/100;
			DA=basic_salary*90/100;
		}
		else if((basic_salary>20000))
		{
			HRA=basic_salary*30/100;
			DA=basic_salary*95/100;
		}
		float gs;
		gs=basic_salary+HRA+DA;
		return gs;
	}
	public static void main(String args[])
	{
	int basic_salary;
	System.out.println("Enter the basic salary of an employyee");
	Scanner sc=new Scanner(System.in);
	basic_salary=sc.nextInt();
	float Gross_Salary=Gross(basic_salary);
	System.out.println("The Gross Salary is "+Gross_Salary);
	}
	

}
