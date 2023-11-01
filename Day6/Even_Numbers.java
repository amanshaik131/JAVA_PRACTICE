/*Assignment 4: Printing Even Numbers
You are creating a program to print all even numbers between 1 and 100. 
To achieve this, your program should 
use a while loop to iterate through all numbers from 1 to 100.
 For each number, it should check if it is even, and if so, print it on the screen.*/

class Even_Numbers 
{
	public static void main(String args[])
	{
		int i=0;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
			
		}
	}
}
