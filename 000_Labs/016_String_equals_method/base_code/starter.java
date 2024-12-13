/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a character. Wizard, Warrior, or Rogue");
		String a = sc.nextLine();
		
		if (a.equals("warrior") || a.equals("Warrior")){
			System.out.print("Congrats you are a Warrior!");
		}
		
		if (a.equals("Wizard") || a.equals("Wizard")){
			System.out.print("Congrats you are a Wizard!");
		}	
		if (a.equals("Rogue") || a.equals("Rogue")){
			System.out.print("Congrats you are a Rogue!");
		}	
	}
}
