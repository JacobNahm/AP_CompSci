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
System.out.println("Write a sentence");
String a = sc.nextLine();

System.out.println("Write another one");
String b = sc.nextLine();

toString(a);
toString(a, b);

}

public static void toString(Stringhell a){
	System.out.println(a);
}
public static void toString(String a, String b){
	System.out.println(a + " " + b);
}
		
	}

