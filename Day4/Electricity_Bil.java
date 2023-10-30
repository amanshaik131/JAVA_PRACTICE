/*Assignment 15: Electricity Bill Calculation
You are tasked with creating a program to input electricity unit charges and calculate the total electricity bill according to the given conditions. Your program should use conditional statements to calculate the bill 
based on the units consumed and apply additional surcharge accordingly.*/
import java.util.Scanner;
class Electricity_bill
{



public static void main(String[] args) 
{

    Scanner scanner = new Scanner(System.in);

    int unitcharges = scanner.nextInt();

    double totalBill;
    if (unitcharges<=50)
     {
        totalBill =unitcharges*0.50;
        System.out.println("Total Electricity bill is "+ totalBill);
    } else if (unitcharges <=150) {
        totalBill =25+(unitcharges-50)*0.75;
        System.out.println("Total Electricity bill is "+ totalBill);
    } else if (unitcharges <=250) {
        totalBill =100+(unitcharges-150)*1.20;
        System.out.println("Total Electricity bill is "+ totalBill);
    } else {
        totalBill =220+(unitcharges-250)*1.50;
        System.out.println("Total Electricity bill is "+ totalBill);
    } 
    if (totalBill > 400) {
        double surcharge = totalBill * 0.15;
        totalBill =totalBill + surcharge;
        System.out.println("Total Electricity bill is "+ totalBill);

  }

}
}
