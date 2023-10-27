/*Assignment 4: Type Casting
Write a program to demonstrate type casting in Java. Declare a variable of type double and assign a value to it. Then, convert the double value to an integer and display both the original double value and the converted integer value.
*/
import java.util.Scanner;
class Type_Casting
  {
    public static void main(String args[])
    {
      double n;
      int a;
      System.out.println("Enter the n value ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextDouble();
      a=(int)n;
      System.out.println("The Original Value of n is "+n);
      System.out.println("the int value of a is "+a);
      
    }
  }