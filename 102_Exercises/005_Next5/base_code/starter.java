/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Please pick a number");
	int num = sc.nextInt();
	System.out.println("Here are the next 5 numbers!");
	System.out.println((num +1) + ", " + (num + 2) + ", " + (num + 3) + ", " + (num + 4) + ", " + (num + 5));
	
	
	System.out.println("Here are the next 5 miltiples of " + (num));
	System.out.println((num * 1) + ", " + (num * 2) + ", " + (num * 3) + ", " + (num * 4) + ", " + (num * 5));
	
	
	System.out.println("Here is " + (num) + "divided by 100!");
	System.out.println(num/100.0);
	
	
	System.out.println("Here is " + (num) + "divided by 10!");
	System.out.println(num/10.0);
	
	
	

	
	
	}
}
