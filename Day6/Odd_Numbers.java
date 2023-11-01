/*Assignment 5: Printing Odd Numbers
You are designing a program to print all odd numbers between 1 a achieve this, and 100. 
To your program should use a while loop to iterate through all numbers from 1 to 100. 
For each number, it should check if it is odd, and if so, print it on the screen.
 */

class Odd_Numbers 
{
	public static void main(String args[])
	{
		int i=1;
		while(i<=100)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
