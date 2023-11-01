/*Assignment 3: Printing Alphabets
You are designing a program to print all the alphabets from 'a' to 'z'. 
To achieve this, your program should 
use a while loop to iterate through the ASCII values of the alphabets from 97 to 122. 
For each value, it should print the corresponding alphabet character.
 */


class Alphabets 
{
	public static void main(String args[])
	{
		int i=97;
		while(i<=122)
		{
			System.out.println((char)i);
			i++;
		}
	}
}
