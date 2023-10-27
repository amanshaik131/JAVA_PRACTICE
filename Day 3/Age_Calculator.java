/*2. Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. 
Use conditional statements to determine if they are a minor or an adult.*/

import java.util.Scanner;
class Age_Calculator
{
  public static void main(String args[])
  {
    int birth_of_year;
     int current_year=2023;
     int age; 
     System.out.println("Enter the birth year");
     Scanner sc=new Scanner(System.in);
     birth_of_year=sc.nextInt();
      age=current_year-birth_of_year;
       System.out.println("Your Age is "+age); 	   
  }
}