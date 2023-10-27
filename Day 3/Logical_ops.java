/*Assignment 7: Logical Operators
Write a program to implement logical operations on boolean values. Prompt the user to enter two boolean values (true or false) as inputs. Implement logical AND, OR, and NOT operations using appropriate logical operators and display the results as boolean values.*/
import java.util.Scanner;
class Logical_ops
  {
    public static void main(String args[])
    {
      boolean a,b;
      System.out.println("Enter the boolean value of a is ");
      Scanner sc=new Scanner(System.in);
      a=sc.nextBoolean();
      System.out.println("Enter the boolean value of b is ");
      b=sc.nextBoolean();
      System.out.println("The and operator of a and b is "+(a&&b));
      System.out.println("The or operator of a and b  is "+(a||b));
      System.out.println("The Not equal operator of a is "+(!a));
      System.out.println("The Not equal operator of b is "+(!b));
      
    }
  }