/* 1. Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.*/
import java.util.Scanner;
class Rock_Paper_Scissors
{
       public static void main(String args[])
       {
          String player1,player2;
         System.out.println("Player1 starts with ");
         Scanner sc=new Scanner(System.in);
         player1=sc.nextLine();
         Scanner sc1=new Scanner(System.in);
         System.out.println("Player2 starts with ");
         player2=sc1.nextLine();
         //rock,paper,scissor

             if((player1.equalsIgnoreCase("rock"))&&(player2.equalsIgnoreCase("scissor")))
             {
                  System.out.println("Player1 has Won");
             }   
           else if((player1.equalsIgnoreCase("rock"))&&(player2.equalsIgnoreCase("paper")))
            {
                    System.out.println("Player2 has Won");
             }
            else if((player1.equalsIgnoreCase("rock"))&&(player2.equalsIgnoreCase("rock")))
            {
  System.out.println("Draw..!");
            }
           else if((player1.equalsIgnoreCase("paper"))&&(player2.equalsIgnoreCase("scissor")))
            {
    System.out.println("Player2 has Won");
            }
           else if((player1.equalsIgnoreCase("paper"))&&(player2.equalsIgnoreCase("rock")))
            {
  System.out.println("Player1 has Won");
            }
           else if((player1.equalsIgnoreCase("paper"))&&(player2.equalsIgnoreCase("paper")))
          {
  System.out.println("Draw...!");
          }
          else if((player1.equalsIgnoreCase("scissor"))&&(player2.equalsIgnoreCase("paper")))
            {
   System.out.println("player1 has Won");
            }
               else if((player1.equalsIgnoreCase("scissor"))&&(player2.equalsIgnoreCase("rock")))
            {
   System.out.println("player2 has Won");
            }

           else if((player1.equalsIgnoreCase("scissor"))&&(player2.equalsIgnoreCase("scissor")))
                {
       System.out.println("Draw..!");
  }
         else 
         {
           System.out.println("Please Enter among rock,paper,scissor   ");
         }
        }
}