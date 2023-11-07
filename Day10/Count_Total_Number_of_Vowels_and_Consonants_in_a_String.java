/*2. Assignment: Count Total Number of Vowels and Consonants in a String
Scenario: You are building a word analysis tool. 
The user enters a sentence, and you need to count the total number of vowels and 
consonants present in the sentence to provide insights into its composition.*/

import java.util.Scanner;
class Count_Total_Number_of_Vowels_and_Consonants_in_a_String 
{

	public static void main(String[] args) 
	{
		String s;
		int i,vowel=0,consonants=0;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s=s.toLowerCase();
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='u'))
			{
				vowel++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("The Total number of Vowels are "+vowel);
		System.out.println("The Total number of Consonants are "+consonants);
		

	}

}
