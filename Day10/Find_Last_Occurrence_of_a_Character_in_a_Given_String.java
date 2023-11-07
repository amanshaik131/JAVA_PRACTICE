/*7. Assignment: Find Last Occurrence of a Character in a Given String
Scenario: You are building a log analyzer. The user provides a log file, and
 you need to 
find the last occurrence of a specific character to identify the end of the log.*/
//am
//am
import java.util.Scanner;
class Find_Last_Occurrence_of_a_Character_in_a_Given_String 
{

	public static void main(String[] args) 
	{
		String s;
		System.out.println("enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("Enter the character ");
		char ch=sc.next().charAt(0);
		/*int index=s.lastIndexOf(ch);
		System.out.println(index);*/
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==ch)
			{
				System.out.print("The position of "+ch+" "+"is"+" "+i);
				break;
			}
		}
	}

}
