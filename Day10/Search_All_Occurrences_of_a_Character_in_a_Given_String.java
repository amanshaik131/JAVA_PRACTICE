/*8. Assignment:
Search All Occurrences of a Character in a Given String
Scenario: You are creating a find-and-replace tool. 
The user inputs a paragraph and a search character, and 
you need to find all occurrences of that character to replace them with another character.
*/

import java.util.Scanner;
class Search_All_Occurrences_of_a_Character_in_a_Given_String 
{

	public static void main(String[] args) 
	{
		String s;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char a[]=s.toCharArray();
		System.out.println("Enter the Character ");
		char ch=sc.next().charAt(0);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ch)
			{
				System.out.println("All Occurences of a character is "+" "+i+"   ");
			}
		}
	}

}
