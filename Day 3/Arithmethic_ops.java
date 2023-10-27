/*Assignment 5: Arithmetic Operators
Write a program to perform arithmetic operations on two numbers. Prompt the user to enter two numbers as inputs. Implement addition, subtraction, multiplication, and division operations using appropriate arithmetic operators and display the results.*/
import java.util.Scanner;
class Arithmethic_ops
  {
  public static void main(String args[]) {
    int a, b;
    System.out.println("enter the value of a ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    System.out.println("enter the value of b ");
    b = sc.nextInt();
    // Arithmethic operations +,-,*,/,%
    System.out.println("The Addition of a and b is " + (a + b));
    System.out.println("The Subtraction of a and b is " + (a - b));
    System.out.println("The Multiplication of a and b is " + (a * b));
    System.out.println("The Quotient or division of a and b is " + (a / b));
    System.out.println("The Remainder of a and b is " + (a % b));

  }
}