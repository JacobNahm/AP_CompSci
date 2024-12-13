/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Random;
import java.util.Scanner;

class starter {
   public static void main(String[] num0) {
      Scanner num1 = new Scanner(System.in);
      Random num2 = new Random();
      int num3 = 100;
      boolean num4 = false;
      boolean num5 = false;
      boolean num6 = false;
      boolean num7 = false;
      new String("");
      System.out.println("Slot Machine Rules: ");
      System.out.println("1. Each player starts with $100.");
      System.out.println("2. Input a wager less than your total amount of money.");
      System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
      System.out.println("   a. If two numbers match, you double your money.");
      System.out.println("   b. If three numbers match, you triple your money.");
      System.out.println("   c. If none match, you lose your money.");

      while(true) {
         System.out.println("--------------------------------------------------");
         System.out.println();
         System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
         String num8 = num1.nextLine();
         if (!num8.equals("yes") && !num8.equals("Yes") && !num8.equals("y") && !num8.equals("Y")) {
            if (num8.equals("No") || num8.equals("no") || num8.equals("N") || num8.equals("n")) {
               System.out.println("You still got " + num3 + " left. Come again soon!");
               break;
            }

            System.out.println("Try Again!");
         } else {
            System.out.print("You have $" + num3 + ". How much would you like to gamble!? ");
            int num9 = num1.nextInt();
            num1.nextLine();

            while(num9 > num3 || num9 <= 0) {
               if (num9 <= 0) {
                  System.out.println(" No negative numbers or zero!");
                  System.out.print("Please enter a smaller number : ");
               } else {
                  System.out.print("You only have $" + num3 + "! Please enter a smaller number : ");
               }

               num9 = num1.nextInt();
               num1.nextLine();
            }

            System.out.println();
            System.out.println("Lets gooo!!");
            System.out.println("Your numbers are: ");
            int num10 = num2.nextInt(10) + 1;
            int num11 = num2.nextInt(10) + 1;
            int num12 = num2.nextInt(10) + 1;
            System.out.println("_______________________");
            System.out.println(" | " + num10 + " | " + num11 + " | " + num12 + " |");
            System.out.println("_______________________");
            if (num10 == num11 && num11 == num12) {
               num3 += num9 * 2;
               System.out.println("JACKPOT!!!!!");
               System.out.println("You now have $" + num3 + ".");
            } else if (num10 != num11 && num10 != num12 && num11 != num12) {
               num3 -= num9;
               System.out.println("Never quit keep gambling!");
               System.out.println("You now have $" + num3 + ".");
            } else {
               num3 += num9;
               System.out.println("You won! You're wager has now been doubled!");
               System.out.println("You now have $" + num3 + ".");
            }

            if (num3 == 0) {
               System.out.println("--------------------------------------------------");
               System.out.println();
               System.out.println("You've run out of money! But dont be discouraged!! You win some you lose some!");
               break;
            }

            System.out.println();
         }
      }

   }
}
   
