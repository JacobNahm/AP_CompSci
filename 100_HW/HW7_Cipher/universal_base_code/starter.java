/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Cipher encoder = new Cipher();
        // Your code goes below here
        Scanner sc = new Scanner(System.in);

    System.out.println("Is your problem hard? (y/n)");
        String yn1 = sc.nextLine();
        if(yn1.equals("y")){
            System.out.println("What do you want to decipher?: ");
        int c = 0;
        String CIPHER1 = sc.nextLine();

            while(c<36){
                    String Cipher22 = Cipher.keyedEncode(CIPHER1,c);
            System.out.print("Decoded: ");
            System.out.println(Cipher22);
                c=c+1;

            }

            }

             if(yn1.equals("n")){
                System.out.println("Ok");
            }
            
        System.out.println("What do you want to decipher?");
        String CIPHER = sc.nextLine();
        String Cipher2 = Cipher.encode(CIPHER);
        System.out.println(Cipher2);

        System.out.println("Are you satisfied? (y/yes) (n/no)");
        String yn = sc.nextLine();
        if(yn.equals("y") ||  yn.equals("yes")){
            System.out.println("Ok goodnight");
        }
        else if(yn.equals("n") || yn.equals("no")){
            System.out.println("Ok, lets try this. Re-enter message:");
            String Keyed = sc.nextLine();
            System.out.println("What number was implied to be used? :");
            int num = sc.nextInt();

            String Keyed2 = Cipher.keyedEncode(Keyed,num);
            System.out.print("Your message is: ");
            System.out.println(Keyed2);
        }
        else{
            System.out.println("Answer correctly");
        }

    }
}
