/*Assignment 9: Alphabet, Digit, or Special Character Check
You are tasked with creating a program to check 
whether a character is an alphabet, digit, or special character. 
Your program should prompt the user to enter a character, and then it 
should use conditional statements to check and display whether the character is an 
alphabet, digit, or special character.*/

import java.util.Scanner;
class Alphabet_Digit_or_Special_Character_Check 
{
	public void check(char ch)
	{
		if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z'))
		{
			System.out.println("Entered Character is Alphabet...");
		}
		else if((ch>='0')&&(ch<='9'))
		{
			System.out.println("Entered Character is Digit....");
		}
		else
		{
			System.out.println("Entered Character is Special Character....");
		}
	}
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter the Character to be checked ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		Alphabet_Digit_or_Special_Character_Check m=new Alphabet_Digit_or_Special_Character_Check();
		m.check(ch);
		
	}
}
