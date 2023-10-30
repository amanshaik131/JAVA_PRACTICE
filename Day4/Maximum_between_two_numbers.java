/*"Assignment 1: Maximum Between Two Numbers
You are designing a program to find the maximum between two numbers. Your program should prompt the user to enter two numbers, and then it should use conditional statements to determine and display the maximum of the two numbers.*/
import java.util.Scanner;
class Maximum_between_two_numbers
  {
    
    public static void main(String args[])
      {
         int a,b;
         System.out.println("Enter the value of a is ");
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
         b=sc.nextInt();
         if(a>b)
         {
           System.out.println("a is Maximum");
         }
      else
      {
          System.out.println("b is Maximum");	
      }	
      }
    }