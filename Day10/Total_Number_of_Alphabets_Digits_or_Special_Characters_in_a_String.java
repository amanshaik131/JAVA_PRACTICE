/*1. Assignment: Find Total Number of Alphabets, Digits, or Special Characters in a String
Scenario: You are developing a program for a password strength checker. 
The user inputs a password, and you need to count the total number of alphabets, digits, and
 special characters present in the password to assess its strength.*/



import java.util.Scanner;
class Total_Number_of_Alphabets_Digits_or_Special_Characters_in_a_String 
{

	public static void main(String[] args) 
	{
		
		String s;
		int i,alphabet=0,digit=0,special_character=0;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s=s.toLowerCase();
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a')&&(s.charAt(i)<='z'))
			{
				alphabet++;
			}
			else if((s.charAt(i)>='0')&&(s.charAt(i)<'9'))
			{
				digit++;
			}
			else
			{
				special_character++;
			}
		}
		System.out.println("The Total number of  Alphabets "+alphabet);
		System.out.println("The Total number of Digits "+digit);
		System.out.println("The Total number of Special Characters "+special_character);

	}

}
