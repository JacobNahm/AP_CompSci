/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = new String(sc.nextLine() + " ");
		int a = sentence.length();
		boolean b = false; 
		String space = new String(""); 
		
		for(int i = 0; i < sentence.length(); ++i){
			if(sentence.substring(i, i + 1).compareTo(" ") == 0){ 
				String c = sentence.substring(0,i);
				space = c + " " + space; 
				sentence = sentence.substring(i + 1, sentence.length()); 
				i = 0;
		}
		
	}
System.out.println(space); 
} 
}

