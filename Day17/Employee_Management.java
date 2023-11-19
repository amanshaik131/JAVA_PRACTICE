/*Employee Management

Create a class called Employee with properties like employeeId, name, and salary. 
Use a HashSet to store multiple employee objects. Implement methods to:
Add new employees to the HashSet.
Remove employees from the HashSet based on employee ID.
Search for an employee by employee ID and display their details.
Display the details of all employees.
 */

import java.util.HashSet;
import java.util.Scanner;
class Employee
{
	int employeeId;
	String name;
	int salary;
	Employee(int employeeId,String name,int salary)
	{
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
}
public class Employee_Management 
{
	HashSet<Employee>employee=new HashSet<Employee>();
	public void add(Employee e)
	{
		employee.add(e);
	}
	public void remove(int id)
	{
		int flag=0;
		for(Employee e:employee)
		{
			if(e.employeeId==id)
			{
				
				employee.remove(e);
				flag=1;
				System.out.println("Removed Employee Details SuccessFully ....");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Not Removed Any Employee ID");
		}
		display();
	
	}
	public void Search(int id)
	{
		int flag=0;
		for(Employee e:employee)
		{
			if(e.employeeId==id)
			{
				flag=1;
				System.out.println("Employee Details Found ");
				System.out.println("The Employee Id is "+e.employeeId);
				System.out.println("The Employee Name is "+e.name);
				System.out.println("The Employee Salary is "+e.salary);
			}
		}
		if(flag==0)
		{
			System.out.println("Employee Details Not Found ");
		}
			
	}
	public void display()
	{
		for(Employee e:employee)
		{
			System.out.println(e.employeeId+" "+e.name+" "+e.salary);
		}
	}
	

	public static void main(String[] args) 
	{
		Employee_Management e1=new Employee_Management();
		System.out.println("Enter the Number of Employees");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)//0<2
		{
			System.out.println("Enter the Employee Id ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Employee Name ");
			String name=sc.nextLine();
			System.out.println("Enter the Employee Salary ");
			int sal=sc.nextInt();
			Employee e=new Employee(id,name,sal);
			e1.add(e);
		}
		System.out.println("Enter the Employee Id to be Deleted ");
		int id=sc.nextInt();
		
		System.out.println("Employeee Details .......");
		e1.display();
		e1.remove(id);
		System.out.println("Enter the Employee Id to be Searched ");
		Scanner sc1=new Scanner(System.in);
		int number=sc.nextInt();
		e1.Search(number);
		
		
	}

}
