/*
Assignment 6: Relational Operators
Write a program to compare two numbers using relational operators. Prompt the user to enter two numbers as inputs. Implement checks for equality, greater than, less than, greater than or equal to, and less than or equal to using relational operators and display the results as boolean values*/
import java.util.Scanner;
class Relational_ops
  {
    public static void main(String args[])
    {
      int a,b;
      System.out.println("Enter the value of a is ");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      System.out.println("Enter the value of b is ");
      b=sc.nextInt();
      /*if((a==b)||(a>=b)||(a!=b))
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);
      }*/
      if((a==b))
      {
        System.out.println(true);
      }
      else if(a!=b)
      {
        System.out.println(true);
      }
      else if(a>=b)
      {
        System.out.println(true);
      }
      else if(a<=b)
      {
        System.out.println(false);
      }
     else if(a<b)
      {
          System.out.println(true);
      }
       else if(a>b)
       {
         System.out.println(true);
       }
      else 
      {
        System.out.println("Please Enter valid Numbers");
      }
      
    }
  }