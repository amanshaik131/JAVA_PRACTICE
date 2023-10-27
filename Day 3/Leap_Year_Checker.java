import java.util.Scanner;
class Leap_Year_Checker
{
 public static void main(String args[])
    {
  int year;
  System.out.println("Enter the year ");
  Scanner sc=new Scanner(System.in);
  year=sc.nextInt();
  if(year%4==0)
  {
    System.out.println("Leap Year ");
  }
  else
  {
   System.out.println("Not Leap Year");
  }
      }
}	