/*14. WAP to input  of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.Scanner;
class Gross_Salary
{
	public static void main(String args[])
	{
	  int basic_salary;
	float HRA=0f,DA=0f;
	  System.out.println("Enter the Salary");
	 Scanner sc=new Scanner(System.in);
	basic_salary=sc.nextInt();
	 if(basic_salary<=10000)
	{
	    HRA=basic_salary*20/100;
	     DA=basic_salary*80/100;
	}
	else if(basic_salary<=20000)
	{
	 HRA=basic_salary*25/100;
	 DA=basic_salary*90/100;
	}
	else if(basic_salary>20000)
	{
	   HRA=basic_salary*30/100;
	    DA=basic_salary *95/100;
	}
	float Gross_Salary=(float)basic_salary+HRA+DA;
	  System.out.println("The Gross Salary is "+Gross_Salary);
	}
}
