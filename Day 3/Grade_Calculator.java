/* Grade Calculator: Create an application that takes a student's test scores and 
calculates their final grade. 
Use conditional statements to determine the letter grade (e.g. A, B, C, etc.)
 based on their scores.*/

import java.util.Scanner;
class Grade_Calculator
{
  public static void main(String args[])
  {
       int m1,m2,m3,tot,avg;
       System.out.println("Enter the marks per 100");
       Scanner sc=new Scanner(System.in);
       m1=sc.nextInt();
        m2=sc.nextInt();
       m3=sc.nextInt();
      tot=m1+m2+m3;
      avg=tot/3;
      if((m1>=35)&&(m2>=35)&&(m3>=35))
  {	
    if((avg>=80)&&(avg<=100))
    {
                       System.out.println("A Grade");
    }
    else if((avg>=70)&&(avg<=79))
    {
          System.out.println("B Grade");
    }
    else if((avg>=60)&&(avg<=69))
    {
      System.out.println("C Grade");
    }	
    else if((avg>=50)&&(avg<=59))
    {
       System.out.println("B Grade");
    }
    else if ((avg>=35)&&(avg<=49))
    {
           System.out.println("D Grade");
    }
                 }
  else
  {
   System.out.println("Failed");
  } 


                 }
}