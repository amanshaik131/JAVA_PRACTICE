/*Assignment 16: Day of Week Using Switch Case
You are designing a program to print the name of the day of the week using a switch case. Your program should prompt the user to enter a week number (1 to 7), and then it should use a switch case to determine and 
display the respective day of the week.*/
import java.util.Scanner;
class Week_Day
{
  public static void main(String args[])
  {
  int n;
    System.out.println("Enter the Number");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
    if(n==1)
  {
   System.out.println("Sunday");
  }
  else if(n==2)
  {
    System.out.println("Monday");
  }
  else if(n==3)
  {
   System.out.println("Tuesday");
  }
  else if(n==4)
  {
  System.out.println("Wednesday");
  }
  else if(n==5)
  {
   System.out.println("Thursday");
  }
  else if(n==6)
  {
   System.out.println("Friday");
  }
  else if(n==7)
  {
   System.out.println("Saturday");
  }
  else
  {
    System.out.println("Please Enter the Valid Number between 1 and 7");
  }

  }
}


