import java.util.Scanner;
public class Employee_Salary_Calculator 
{
    public static void main(String args[]) 
  {
    int month_salary,annual_salary;
    System.out.println("Enter the monthly salary");
    Scanner sc=new Scanner(System.in);
     month_salary=sc.nextInt();
     annual_salary=month_salary*12;
      double  tax_rate;
      if(annual_salary<=50000)
      {
       tax_rate =0.05;
      }
      else if(annual_salary<=10000)
      {
            tax_rate =0.10;
      }
      else 
      {
             tax_rate =0.20; 
      }
     double tax =annual_salary*tax_rate;
     double net_salary = annual_salary -tax;
     System.out.println("Annual Salary of an Employee is :" + annual_salary);
     System.out.println("Tax is :" +tax);
     System.out.println("Net Salary of an Employee is :" + net_salary);
    }
}