/*4. Assignment: Find Reverse of a String
Scenario: You are creating a string utility function. 
The user provides a string, and 
you need to find its reverse to perform further operations on it.*/

import java.util.Scanner;
class Find_Reverse_of_a_String 
{

	public static void main(String[] args) 
	{
		String s,rev="";
		int i;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char a[]=s.toCharArray();
		for(i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("The Reverse of a String is "+rev);
	}

}
