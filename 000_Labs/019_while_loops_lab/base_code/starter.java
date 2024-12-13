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
	System.out.println("What is your name?");
	String a = sc.nextLine();
	
	System.out.println("How many times do you want me to print out your name?");
	int b = sc.nextInt();
	
	while(b>0){
		System.out.print(a);
		b--;
	}

		
	}
}
