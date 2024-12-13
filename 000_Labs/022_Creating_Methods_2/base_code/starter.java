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

System.out.println("What is your base number?");

int a = sc.nextInt();

System.out.println("What is your exponent number?");
int b = sc.nextInt();

int c;

hello(a, b);
}

public static int hello(int a, int b){
	int c =(int)Math.pow(a,b);
	System.out.println("Your answer is: " + c);
	return c;
}

		
	}

