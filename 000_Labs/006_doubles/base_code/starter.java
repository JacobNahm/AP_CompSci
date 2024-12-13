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
		System.out.println("Please enter a number in Fahrenheit: ");
		int number = sc.nextInt();
		System.out.println("The converison to celcius is: ");
		System.out.print((number -32)*(5.0/9.0));
		
	}
}
