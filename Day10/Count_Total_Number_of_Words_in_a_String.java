/*3. Assignment: Count Total Number of Words in a String
Scenario: You are developing a word count application.
 The user inputs a paragraph, and you need to count 
the total number of words in the paragraph to help them with their writing.*/
import java.util.Scanner;
class Count_Total_Number_of_Words_in_a_String
{

	public static void main(String[] args) 
	{
		String s;
		int i,count=1;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' '))
			{
				count++;
			}
		}
		System.out.println("The Total Number of Words in a String "+count);
	}

}
