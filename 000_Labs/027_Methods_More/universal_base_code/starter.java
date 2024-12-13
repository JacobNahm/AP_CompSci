/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("What calss would you like to be?");
		Scanner sc = new Scanner(System.in); 
		String c = sc.nextLine();
		
		MyCharacter jacob = new MyCharacter(c);
		jacob.hello();


		
	}
}
