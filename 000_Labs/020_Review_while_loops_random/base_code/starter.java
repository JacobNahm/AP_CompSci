/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Let's play a game. You need to guess a number between 0 - 1000 and you have infinite amount of tries. GOOD LUCK!");
	int a = (int)Math.random() * 1000;
	
	System.out.print("Whats you first guess? ");
	
	int b = sc.nextInt();
	
	while(b != a){
		System.out.print("Wrong! Please try again "); 
		b = sc.nextInt();
	}
			
	if(b == a){
		System.out.print("thats correct! Thanks for playing my game");
		
	}
		 
	}
	
}
	

	


	
