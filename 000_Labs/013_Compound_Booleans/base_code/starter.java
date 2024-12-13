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
		System.out.print("Put in your first number ");
		int a = sc.nextInt();
		
		System.out.print("Put in your second number ");
		int b = sc.nextInt();

		System.out.print("Put in your third number ");
		int c = sc.nextInt();
		
		if(a > b){
	}
		if(a > c){
		}		
			if((a > b) && (a > c)){ 
				System.out.print(" " +  a + " is the largest number");
	}
		else if((a < b) && (a < c)){
			System.out.print(" " + a + " is the smallest number" );
		}
	
	
		if(b > a){
	}
		if(b > c){
		}		
			if((b > a) && (b > c)){ 
				System.out.print(b + " is the largest number");
	}
	
	else if((b < a) && (b < c)){
			System.out.print(" " + b + " is the smallest number" );
		}
	
		if(c > a){
	}
		if(c > b){
		}		
			if((c > a) && (c > b)){ 
				System.out.print(c + " is the largest number");
	}
	
	else if((c < a) && (c < b)){
			System.out.print(" " + c + " is the smallest number" );
		}
		
}
}

