/*Assignment 2: Distance Calculator
Write a program to calculate the distance between two points (x1, y1) and (x2, y2) in a 2D plane. Prompt the user to enter the coordinates of both points as inputs. Use appropriate data types for variables and display the calculated distance.*/
import java.util.Scanner;
class Distance_Calculator
  {
    public static void main(String args[]) 
    {
      int x1,x2,y1,y2,distance;
      System.out.println("Enter the x1 value ");
      Scanner sc=new Scanner(System.in);
      x1=sc.nextInt();
      System.out.println("Enter the x2 value ");
      x2=sc.nextInt();
      System.out.println("Enter the y1 value ");
      y1=sc.nextInt();
      System.out.println("Enter the y2 value ");
      y2=sc.nextInt();
      //d=root((x2-x1)^2+(y2-y1)^2);
      distance=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
      int dist=(int)Math.sqrt(distance);
      System.out.println("The distance of Two Points is "+dist);     
    }
  }