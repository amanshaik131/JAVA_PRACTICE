/*Assignment 3: Currency Converter
Write a program to convert currency from one currency to another. Prompt the user to enter the amount in the source currency and the exchange rate. Use appropriate data types for variables and display the converted amount in the target currency.*/
import java.util.Scanner;
class Currency_Converter
  {
    public static void main(String args[])
    {
      int source_currency,target_currency;
      double exchange_rate;
      System.out.println("Enter the value of source_currency ");
      Scanner sc=new Scanner(System.in);
      source_currency=sc.nextInt();
      System.out.println("Enter the value of exchange_rate ");
      exchange_rate=sc.nextInt();
      target_currency=(int)(source_currency*exchange_rate);
      System.out.println("The Target Currency is "+target_currency);
      
      
    }

  }