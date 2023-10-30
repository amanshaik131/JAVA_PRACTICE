/*Assignment 7: Alphabet Check
You are designing a program to check whether a character is an alphabet or not. Your program should prompt the user to enter a character, and then it should use conditional statements to check and display whether the character is an alphabet or not.
*/
import java.util.Scanner;
class Alphabet_Check
  {
    
    public static void main(String args[])
      {
        char ch;
        System.out.println("Enter the String to be Stored ");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         ch=s.charAt(0);
      if((ch>='a')&&(ch<='z')||((ch>='A')&&(ch<='Z')))
      {
        System.out.println("The character is Alphabet");
      }
      else
      {
      System.out.println("The character is not Alphabet");
      }
    }
    }