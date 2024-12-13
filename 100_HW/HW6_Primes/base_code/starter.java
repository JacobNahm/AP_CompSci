/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	 Scanner sc = new Scanner(System.in);
    System.out.println("Input a number and ill print every prime until that number is: ");
    int a = sc.nextInt();

    int b;

    nahm(a);

    }

    public static boolean jacob(int b){
        for(int a = 2; a < b; ++a){
            if(b % a == 0){
                return false;
            }
        }

        return true;

    }

    public static void nahm(int b){
        for(int a = 2; a < b + 1; ++a){
            if(jacob(a)){
                System.out.println(a);
            }
        }
    }

}