/*Assignment 10: Uppercase or Lowercase Alphabet Check
You are designing a program to check whether a character is an uppercase or lowercase alphabet.
 Your program should prompt the user to enter a character, and
  then it should use conditional statements to check and 
  display whether the character is an uppercase or lowercase alphabet.*/

import java.util.Scanner;
class Uppercase_or_Lowercase_Alphabet_Check 
{
	public String check(char ch)
	{
		 if((ch>='a')&&(ch<='z'))
		 {
			String s="Lower_Case";
			return s;
		 }
		 else
		 {
			 String s="Upper_Case";
			 return s;
		 }
	}
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter the character ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		Uppercase_or_Lowercase_Alphabet_Check m=new Uppercase_or_Lowercase_Alphabet_Check();
		String s=m.check(ch);
		System.out.println(s);
	}
	
}
