/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Put in one integer ");
		int a = sc.nextInt();
		
		System.out.print("Put in another integer ");
		int b = sc.nextInt();
		
		if((a) % 2 == 0){
			System.out.println("First integer( " + a + " ) is even.");
		}
		
		else{
			System.out.println("Second integer( " + a + " ) is odd.");
		}
		
		if((b) % 2 == 0){
			System.out.println("First integer( " + b + " ) is even.");
		}
		
		else{
			System.out.println("Second integer( " + b + " ) is odd.");
		}
		
		if((a) % 3 == 0){
			System.out.println(a + " is divisible by 3!");
		}
		else{
			System.out.println(a + " is not divisible by 3!");
		}
		
		if((a) % 4 == 0){
			System.out.println(a + " is divisible by 4!");
		}
		else{
			System.out.println(a + " is not divisible by 4!");
		}
		if((a) % 5 == 0){
		System.out.println(a + " is divisible by 5!");
		}
		else{
			System.out.println(a + " is not divisible by 5!");
		}
		
		if((b) % 3 == 0){
		System.out.println(b + " is divisible by 3!");
		}
		else{
		System.out.println(b + " is not divisible by 3!");
		}
		if((b) % 4 == 0){
		System.out.println(b + " is divisible by 4!");
		}
		else{
		System.out.println(b + " is not divisible by 4!");
		}
		
		if((b) % 5 == 0){
		System.out.println(b + " is divisible by 5!");
		}
		else{
		System.out.println(b + " is not divisible by 5!");
		}
		
		
	}
}
