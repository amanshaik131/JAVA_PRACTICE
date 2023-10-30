/*Assignment 6: Leap Year Check
You are tasked with creating a program to check whether a year is a leap year or not. Your program should prompt the user to enter a year, and then it should use conditional statements to check and display whether the year is a leap year or not.*/
import java.util.Scanner;
class Leap_year_or_not
  {
  
  public static void main(String args[])
    {
       int year;
       System.out.println("Enter the year to be checked");
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