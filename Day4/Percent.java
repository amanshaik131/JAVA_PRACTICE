/*Assignment 13: Percentage and Grade Calculation
You are designing a program to input marks of five subjects: Physics, Chemistry, Biology, Mathematics, and Computer. Your program should calculate the percentage and grade according to the given criteria and display the result.*/
import java.util.Scanner;
class Percent
  {
public static void main(String args[])
	{
	   int n;
	   System.out.println("1. Sunday");
	   System.out.println("2. Monday ");
	   System.out.println("3. Tuesday");
	   System.out.println("4. Wednesday");
	  System.out.println("5. Thursday");
	   System.out.println("6. Friday");
	   System.out.println("7. Saturday");
	  System.out.println(" Enter your choice ");
	  Scanner sc=new Scanner(System.in);
	   n=sc.nextInt();
	   switch(n)
	{
	  case 1 :
	               System.out.println("The day is Sunday");
		break;
	 case 2 :
	              System.out.println("The day is Monday");
	 	break;
	 case 3 :
	 	System.out.println("The day is Tuesday ");
	                break;
	 case 4 : 
	              System.out.println("The day is Wednesday");
	   	break;
	case 5 :
	               System.out.println("The day is Thursday ");
	  	break;
	case 6 :
	 	System.out.println("The day is Friday ");
	 	break;
	case 7:
	   	System.out.println("The day is Saturday");
		break;
	default :
		System.out.println("please enter the valid number between 1 to 7");
		break;
		
	
	
	}
		
	}

}