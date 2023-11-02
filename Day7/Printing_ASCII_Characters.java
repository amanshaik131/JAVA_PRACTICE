/*Assignment 19: Printing ASCII Characters
You are designing a program to print all ASCII characters along with their values.
 ASCII is a standard for representing characters using integers. 
 Your program should use a while loop to iterate through all possible ASCII values from 0 to 127. 
 For each value, it should print the corresponding character 
 using the 'char' data type and its ASCII value.*/



class Printing_ASCII_Characters 
{
	public static void print()
	{
		int i=0;
		while(i<=127)
		{
			System.out.println(i+" "+(char)i);
			i++;
		}
	}
	public static void main(String args[])
	{
		print();
	}

}
