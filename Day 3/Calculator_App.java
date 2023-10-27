/*8. Calculator App : create an application that takes a two values along with operator and 
find the value based on operator.*/
import java.util.Scanner;
class Calculator_App
{
 public static void main(String args[])
    {
  int a,b;
  String c;
  System.out.println("Enter the a and b values ");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.next();
  char ch=c.charAt(0);
  switch(ch)
  {
   case '+' :
    System.out.println("the sum of a and b is "+(a+b));
    break;
  case '-' :
    System.out.println("The sub of a and b is "+(a-b));
    break;
  case '*' :
    System.out.println("The mul of a and b is "+(a*b));
    break;
  case '/' :
    System.out.println("The division of a and b is "+(a/b));
      break; 
  case '%':
    System.out.println("The remanider of a and b is "+(a%b));
    break;
  default :
    System.out.println("Enter the Valid Operator");

  }	
    }
} 