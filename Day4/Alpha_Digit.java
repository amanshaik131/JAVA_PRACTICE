/*Assignment 9: Alphabet, Digit, or Special Character Check
You are tasked with creating a program to check whether a character is an alphabet, digit, or special character. Your program should prompt the user to enter a character, and then it should use conditional statements to check and display whether the character is an alphabet, digit, or special character.*/
import java.util.Scanner;
class Alpha_Digit
  {
    
      public static void main(String args[])
       {
          char ch;
         System.out.println("Enter the character  to be checked ");
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
          ch=s.charAt(0);
          if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
         {
            System.out.println("Entered character is Alphabet");
         }
       else if((ch>='0')&&(ch<='9'))
      {
         System.out.println("Entered character is Digit");
       }
       else
      {
          System.out.println("Entered character is Special Character");
      }
       }
    }