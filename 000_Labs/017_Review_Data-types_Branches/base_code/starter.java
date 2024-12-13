/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name"); 
		String name = sc.nextLine();
		
		System.out.println("what is you title? For example: Slayer of Dragons: ");
		String title = sc.nextLine();
		
		System.out.println("Whould you like to be a Wizard, Warrior, or Rogue?");
		String a = sc.nextLine();
		
		if (a.equals("warrior") || a.equals("Warrior")){
			System.out.print("Congrats you are a Warrior!");
		}
		
		if (a.equals("wizard") || a.equals("Wizard")){
			System.out.print("Congrats you are a Wizard!");
		}	
		if (a.equals("rogue") || a.equals("Rogue")){
			System.out.print("Congrats you are a Rogue!");
		}
		System.out.println("You have 20 skill poitns to spend in the follwing: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		System.out.println("Strength (1-10): ");
		int Strength = sc.nextInt();
		
		if(Strength >= 0 && Strength <= 10){
			System.out.println("You have " + (20-Strength) + "points left");
		}
		
		else if(Strength < 0 || Strength >= 10){
			System.out.println("You need to put a lower number: ");
			Strength = sc.nextInt();
			System.out.println("You have " + ((20-Strength)) + " points left");
		}
		
		System.out.println("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		
		if(Dexterity >= 0 && Dexterity <= 10){
			System.out.println("You have " + ((20-Strength)-Dexterity) + " points left");
		}
		
		else if(Dexterity < 0 || Dexterity >= 10){
			System.out.println("You need to put a lower number: ");
			Dexterity = sc.nextInt();
			System.out.println("You have " + ((20-Strength)-Dexterity) + " points left");
		}
		
		System.out.println("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		if(Intelligence >= 0 && Intelligence <= 10){
			System.out.println("You have " + (((20-Strength)-Dexterity)-Intelligence) + " points left");
		}
		
		else if(Intelligence < 0 || Intelligence >= 10){
			System.out.println("You need to put a lower number: ");
			Intelligence = sc.nextInt();
			System.out.println("You have " + (((20-Strength)-Dexterity)-Intelligence) + " points left");
		}
		
			System.out.print("Charisma (1-10): ");
		int Charisma = sc.nextInt();
		if(Charisma >= 0 && Charisma <= 10){
			System.out.println("You have " + ((((20-Strength)-Dexterity)-Intelligence)-Charisma) + " points left");
		}
		
		else if(Charisma < 0 || Charisma >= 10){
			System.out.println("You need to put a lower number: ");
			Charisma = sc.nextInt();
			System.out.println("You have " + ((((20-Strength)-Dexterity)-Intelligence)-Charisma) + " points left");
		}
		
		System.out.println("____________________________________________________________");
		System.out.println("You are " + name + " the " + title + " of CVHS!!!!");
		System.out.println("You are a " + a + " with the follwign statistics!");
		System.out.println("Strength: " + Strength);
		System.out.println("Dexterity: " + Dexterity);
		System.out.println("Intelligence: " + Intelligence);
		System.out.println("Charisma: " + Charisma);
		
		
		
	}
	
}
