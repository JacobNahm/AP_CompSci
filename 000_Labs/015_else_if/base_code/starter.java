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
		System.out.println("I am thinking of a number between 1 - 1000. Try to guess my number");
		int number = sc.nextInt();
		
		int random = (int)(Math.random() * 1000);
		
		if(number > random){
			System.out.println("Your number is greater! It is " + random);
			
		}
		else if(number < random){
			System.out.println("Your number was smaller! It is " + random);
		}
}
}