/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter 2 numbers to create a range for your random number");
		
		System.out.print("Please enter an integer: ");
		int number1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Now please enter another integer(must be bigger than the first integer): ");
		int number2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Your range is " + (number1) + " to " + (number2));
		System.out.println("Here are 5 numbers generated in this range.");
		
		int a = (int)(Math.random()* (number2 - number1))+number1;
		System.out.println(a);
		
		int b = (int)(Math.random()* (number2 - number1))+number1;
		System.out.println(b);
		
		int c = (int)(Math.random()* (number2 - number1))+number1;
		System.out.println(c);
		
		int d = (int)(Math.random()* (number2 - number1))+number1;
		System.out.println(d);
		
		int e = (int)(Math.random()* (number2 - number1))+number1;
		System.out.println(e);
		
	
	}
}
