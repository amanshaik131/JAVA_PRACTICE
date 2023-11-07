/*5. Assignment: Check Whether a String is Palindrome or Not
Scenario: You are implementing a word game. The player enters a word, 
and you need to check whether it is a palindrome 
(reads the same forward and backward) to determine their score.*/


import java.util.Scanner;
public class Check_Whether_a_String_is_Palindrome_or_Not 
{

	public static void main(String[] args) 
	{
		 String s,rev="";
		 System.out.println("Enter the String ");
		 Scanner sc=new Scanner(System.in);
		 s=sc.nextLine();
		 String s1=s;
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(s1+" "+rev);
		if(s1.equals(rev))
		{
			System.out.println("Palindrome String ");
		}
		else
		{
			System.out.println("Not Palindrome String ");
		}
	}

}
