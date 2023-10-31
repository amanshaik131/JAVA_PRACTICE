/*Assignment 8: Vowel or Consonant Check
You are creating a program to check whether a given alphabet is a vowel or a consonant. 
Your program should prompt the user to enter an alphabet, and 
then it should use conditional statements to check and
 display whether the alphabet is a vowel or a consonant.*/

import java.util.Scanner;
class Vowel_or_Consonant_Check
{
	public void check(char ch)
	{
		if((ch=='a')||(ch=='e')||(ch=='o')||(ch=='u')||(ch=='i')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			System.out.println("Entered character is Vowel ");
		}
		else
		{
			System.out.println("Entered Character is Consonant ");
		}
	}
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter the  Character ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		Vowel_or_Consonant_Check m=new Vowel_or_Consonant_Check();
		m.check(ch);
	}
}
