/* 
Assignment 4: Divisibility Check
You are designing a program to check whether a number is divisible by 5 and 11 or not. Your program should prompt the user to enter a number, and then it should use conditional statements to check and display whether the number is divisible by both 5 and 11.*/
/*5  10   15    20     25    30    35    40    45    50    55    60    65    70    75   80    85    90   95 100   105 110  115 120 125 130 135 140 145  150 155 160 165
11  22  33    44     55    66    77    88     99   110   121   132  143  154  165  176  187 198 209 220
-------------------------- 
5 and 7 are 55,110,165..........
---------------------------
*/
import java.util.Scanner;
class Divisibility_check
  {
    
    public static void main(String args[])
      {
        int n;
        System.out.println("Enter the value of n is ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      if((n%5==0)&&(n%11==0))
      {
        System.out.println("n is divisible by 5 and 11");
      }
      else
      {
        System.out.println("n is  not divisible by 5 and 11");
      }

    }
    }
