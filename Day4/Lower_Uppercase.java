/*Assignment 10: Uppercase or Lowercase Alphabet Check
You are designing a program to check whether a character is an uppercase or lowercase alphabet. Your program should prompt the user to enter a character, and then it should use conditional statements to check and display whether the character is an uppercase or lowercase alphabet.*/
import java.util.Scanner;
class Lower_Uppercase
  {
    

      public static void main(String args[])
                   {
       char ch;
        System.out.println("Enter the character to be checked ");
       Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ch=s.charAt(0);
        if((ch>='a')&&(ch<='z'))
      {
        System.out.println("Entered character is in Lower Case");
      } 
      else if((ch>='A')&&(ch<='Z'))
       {
          System.out.println("Entered character is in UpperCase");
        }
      else
      {
        System.out.println("Please enter Valid Character");
      }
                   }
    }