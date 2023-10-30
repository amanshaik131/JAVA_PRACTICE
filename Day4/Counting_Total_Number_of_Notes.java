import java.util.Scanner;
public class Counting_Total_Number_of_Notes
{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount");
     int amount = scanner.nextInt();
    int note2000 = 0,note500 = 0,note200 = 0,note100 = 0,note50 = 0,note20 = 0,note10=0;
     if (amount >= 2000) {
              note2000 = amount / 2000;
              amount = amount%2000;
             
              System.out.println(note2000);
          }
          if (amount >= 500) {
              note500=amount / 500;
              amount =amount%500;
            
              System.out.println(note500);
          }
          if (amount >= 200) {
              note200=amount / 200;
              amount =amount%200;
              System.out.println(note200);
          }
          if (amount >= 100) {
              note100 =amount / 100;
              amount =amount%100;
         
              System.out.println(note100);
          }
          if (amount >= 50) {
              note50=amount / 50;
              amount=amount%50;
           
              System.out.println(note50);
          }
          if (amount >= 20) {
              note20=amount / 20;
              amount=amount%20;
       
              System.out.println(note20);
          }
          if (amount >= 10) {
              note10=amount / 10;
              amount=amount%10;
           
              System.out.println(note10);
          }

  }

}