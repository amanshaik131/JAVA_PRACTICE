/*Assignment 3: Positive, Negative, or Zero
You are tasked with creating a program to check whether a number is negative, positive, or zero. Your program should prompt the user to enter a number, and then it should use conditional statements to determine and display whether the number is negative, positive, or zero.*/
import java.util.Scanner;
class Positive_negative_zero
  {
    

      public static void main(String args[])
      {
        int n;
        System.out.println("Enter the value of n is ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       if(n>0)
      {
           System.out.println("Number is Positive");
      }
            else if(n<0)
      {
         System.out.println("Number is Negative");
      }
      else
      {
        System.out.println("Number is Equal to Zero");
      }

    }
    }