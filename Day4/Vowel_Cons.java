/*Assignment 8: Vowel or Consonant Check
You are creating a program to check whether a given alphabet is a vowel or a consonant. Your program should prompt the user to enter an alphabet, and then it should use conditional statements to check and display whether the alphabet is a vowel or a consonant.*/
import java.util.Scanner;
class Vowel_Cons
  {
    
    public static void main(String args[])
      {
       char ch;
       System.out.println("Enter the String to be stored ");
      Scanner sc=new Scanner(System.in);
      String s=sc.next(charAt(0));
      if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
      {
         System.out.println("The alphabet is Vowel");
      }
      else
      {
       System.out.println("The alphabet is Consonant");
      }
      }
    }