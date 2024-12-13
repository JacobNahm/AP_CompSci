/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you first name:");
		sc.nextLine();
		
		System.out.println("what is your age?:");
		sc.nextLine();
		
		System.out.println("What is your birthday month:");
		sc.nextLine();
		
		System.out.println("What is your birthday day:");
		sc.nextLine();
		
		System.out.println("What is the year of your birthday:");
		sc.nextLine();
		
		System.out.println("How much is a buck fifty?:");
		sc.nextLine();
		
		System.out.print("Thats correct! Bye now!");
	}
}
