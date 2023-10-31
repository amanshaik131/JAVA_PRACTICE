/*Assignment 15: Electricity Bill Calculation
You are tasked with creating a program to input electricity unit charges and calculate the total electricity bill according to the given conditions. Your program should use conditional statements to calculate the bill 
based on the units consumed and apply additional surcharge accordingly.
/*<=50 ->0.50;
 * <=150->0.75;
 * <=250->1.20;
 * >250->1.50;
 */



import java.util.Scanner;
class Electricity_Bill 
{
	public static float bill(int units)
	{
		float bill;
		if(units<=50)
		{
			
			bill=units*0.5f;
		}
		else if((units>=51)&&(units<=150))
		{
			bill=50*0.5f+((units-50)*0.75f);
		}
		else if((units>=151)&&(units<=250))
		{
			
			bill=50*0.5f+(100*0.75f)+((units-150)*1.20f);
		}
		else 
		{
			
			bill=(50*0.50f)+(100*0.75f)+(100*1.20f)+((units-250)*1.50f);
		}
		return bill;
	}
	public static void main(String args[])
	{
		int units;
		System.out.println("Enter the number of units ");
		Scanner sc=new Scanner(System.in);
		units=sc.nextInt();
		float total_Bill=bill(units);
		System.out.println("The Total bill is "+total_Bill);
	}
}
