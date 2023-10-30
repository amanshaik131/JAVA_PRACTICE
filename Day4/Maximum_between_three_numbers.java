/*Assignment 2: Maximum Between Three Numbers
You are creating a program to find the maximum between three numbers. Your program should prompt the user to enter three numbers, and then it should use conditional statements to determine and display the maximum of the three numbers.*/
import java.util.Scanner;
class Maximum_between_three_numbers
  {
    
    public static void main(String args[])
      {
        int a,b,c;
        System.out.println("Enter the value of a is ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the value of b is ");
        b=sc.nextInt();
       System.out.println("Enter the value of c is ");
         c=sc.nextInt();
        if((a>=b)&&(a>=c))
      {
          System.out.println("a is big");
      }
             else if((b>a)&&(b>=c))
      {
         System.out.println("b is big");
      }
                 else
      {
        System.out.println("c is big");
      }

      }

    }