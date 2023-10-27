/*Assignment 1: Area and Perimeter
Write a program to calculate the area and perimeter of a rectangle. Prompt the user to enter the length and width of the rectangle as inputs. Use appropriate data types for variables and display the calculated area and perimeter.*/
import java.util.Scanner;
class Area_peri_of_Rectangle
  {
    public static void main(String args[])
    {
      int length,breadth,area,perimeter;
      System.out.println("enter the value of length ");
      Scanner sc=new Scanner(System.in);
      length=sc.nextInt();
      System.out.println("enter the value of breadth ");
      breadth=sc.nextInt();
      area=length*breadth;
      System.out.println("The Area of Rectangle is "+area);
      perimeter=2*(length+breadth);
      System.out.println("The perimeter of Rectangle is "+perimeter);

    }
  }