/*6. Assignment : Find First Occurrence of a Character in a Given String
Scenario: You are developing a text editor. The user enters a paragraph, and 
you need to find the first occurrence of a particular character to highlight it.*/


import java.util.Scanner;
class Find_First_Occurrence_of_a_Character_in_a_Given_String {

	public static void main(String[] args) 
	{
			String s;
			System.out.println("Enter the String ");
			Scanner sc=new Scanner(System.in);
			s=sc.nextLine();
			System.out.println("Enter the Character ");
			char ch=sc.next().charAt(0);
			/*int index=s.indexOf(ch);
			System.out.println(index);*/
			char a[]=s.toCharArray();
			for(int i=0;i<a.length;i++)
			{
			     if(a[i]==ch)
			     {
			    	 System.out.println("The position of "+ch+" "+"is"+"  "+i);
			    	 break;
			     }
			     
			}
	}

}
