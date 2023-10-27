/*9. Electricity bill app along with GST: create an application that takes previous units and present units, and find number of units, based on numbers of units find the electricity bill along with GST. use conditional statements to determine the unit slabs.


 Electricity bill app along with GST: create an application that takes previous units and present units, and find number of units, based on numbers of units find the electricity bill along with GST. use conditional statements to determine the unit slabs.     
[12:25 PM] Lalitha Ujjaneni
For first 50 units Rs. 0.50/unit

    For next 100 units Rs. 0.75/unit

    For next 100 units Rs. 1.20/unit

     For unit above 250 Rs. 1.50/unit*/
import java.util.Scanner; 
class Electricity_bill
{
    public static void main(String args[]) 
  {
       System.out.println("Enter previous units: ");
        Scanner sc=new Scanner(System.in);
      
        int pUnits = sc.nextInt();
        System.out.println("Enter present units: ");
        int prUnits = sc.nextInt();
        int unitsconsumed = prUnits - pUnits;
        double bill = 0.0;
        if (unitsconsumed <= 50)
        {
            bill = unitsconsumed * 0.50;
        } 
        else if (unitsconsumed <= 150) 
        {
            bill = 50 * 0.50 + (unitsconsumed - 50) * 0.75;
        } 
        else if (unitsconsumed <= 250) 
        {
            bill = 50 * 0.50 + 100 * 0.75 + (unitsconsumed - 150) * 1.20;
        } 
        else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unitsconsumed - 250) * 1.50;
        }
        double gst = (bill * 0.18);
        double totalBill = bill + gst;

      System.out.println("totall bill including Gst " +totalBill );
    }
  }