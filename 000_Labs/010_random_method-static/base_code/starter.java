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
		int a = (int)(Math.random() * 9);
		System.out.println(a);
		
		int b = (int)(Math.random() * 99) + 1;
		System.out.println(b);
		
		double c = (Math.random() * 1.0) + 2.5;
		System.out.println(c);
		
		double d = (Math.random() * 575.0) + 14.0;
		System.out.print(d);
		
	}
}