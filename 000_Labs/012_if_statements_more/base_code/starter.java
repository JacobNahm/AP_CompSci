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
		System.out.println("Please enter a number");
		int number1 = sc.nextInt();
		
		System.out.println("Please enter another number");
		int number2 = sc.nextInt();
		
		if(number1 > number2){
			System.out.println(number1 + " is greater than the number " + number2);
		}
		else if(number1 < number2){
			System.out.println(number1 + " is less than the number " + number2);
		}
		else{
			System.out.println(number1 + " is equal to " + number2);
			
		}
	}
}
