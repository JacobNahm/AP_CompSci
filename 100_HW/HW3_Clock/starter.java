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
		System.out.println("What day of the week is it tm?");
		System.out.println(" 0 = Sun, 1 = Mon, 2 = Tues,3 = Wed, 4 = Thurs, 5 = Fri, 6=  Sat");
		int x = sc.nextInt();
		if(x == 0 || x == 6){
			System.out.println("Alarm is set for 10:00 AM");
	
		}
		
		else{
			System.out.print("Alram is set for 7:00 AM");
		}
		
	}
}
