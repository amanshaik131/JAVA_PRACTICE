/*5. Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa*/
import java.util.Scanner;
class Temperature_Converter
{
 public static void main(String args[])
  {
     System.out.println("1.Enter the number  to convert from celsius to farenheit");
     System.out.println("2.Enter the number to convert from farenheit to celsius");
      Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();   
   int temp;
      temp=sc.nextInt();

      switch(num)
      {
             case 1:
             int farenheit;
                 farenheit=(int)(temp*9/5)+32;
                System.out.println("the temperature in farenheit is"+farenheit+" "+"F");
                break;
       case 2:
                int celsius;
                celsius=(int)(temp-32)*5/9;
                System.out.println("the temperature in celsius is "+celsius+" "+"C");
                 break;
      default :
                System.out.println("Enter Valid Input");
       }	    
  } 
}