/*Assignment 17: Frequency of Digits
You are designing a program to find the frequency of each digit in a given integer. 
The program should prompt the user to enter a positive integer and then use
 a while loop to count and display the frequency of each digit.*/

import java.util.Scanner;
class Frequency_of_Digits 
{
	public static void main(String args[])
	{
		int n,r,digit0=0,digit1=0,digit2=0,digit3=0,digit4=0,digit5=0,digit6=0,digit7=0,digit8=0,digit9=0;
		System.out.println("Enter the n value is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			switch(r)
			{
			case 0:
					
					digit0++;
					break;
			case 1:
					digit1++;
					break;
			case 2:
				
					digit2++;
					break;
			case 3:
					digit3++;
					break;
			case 4:
					digit4++;
					break;
			case 5:
					digit5++;
					break;
			case 6:
					digit6++;
					break;
			case 7:
					digit7++;
					break;
			case 8:
				    digit8++;
				    break;
			case 9:
					digit9++;
					break;
				}
			n=n/10;
		}
		System.out.println("The Zero appearance is "+digit0);
		System.out.println("The One appearance is "+digit1);
		System.out.println("The Two appearance is "+digit2);
		System.out.println("The Three appearance is "+digit3);
		System.out.println("The Four appearance is "+digit4);
		System.out.println("The Five appearance is "+digit5);
		System.out.println("The Six appearance is "+digit6);
		System.out.println("The Seven appearance is "+digit7);
		System.out.println("The Eight appearance is "+digit8);
		System.out.println("The Nine appearance is "+digit9);
			

		
			
		
	}
}
