/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
String role;
int Strength; 
int Dexterity; 
int Intelligence;
int Constitution;
int Charisma;

	public MyCharacter() {
		role = " no role";
		Strenth = 0;
		Dexterity = 0;
		Intelligence = 0;
		Constitution = 0;
		Charisma = 0;
		
		
	}

	 public myCharacter(String inputRole) {
        if(inputRole.equals("Wizard")) {
            role = "Wizard";
        }
        else if(inputRole.equals("Warrior")) {
            role = "Warrior";
        }
        else if(inputRole.equals("Rogue")){
            role = "Rogue";

    }
    else{
    role = "no role";
}
}
public void hello(){
	System.out.println("--------------------------------------");
	System.out.println("Your role is " + role);
	System.out.println("Your Strength trait is " + Strength);
	System.out.println("Your Dexterity trait is " + Dexterity);
	System.out.println("Your Intelligence trait is " + Intelligence);
	System.out.println("Your Constitution trait is " + Constitution);
	System.out.println("Your Charisma trait is " + Charisma);
	
}
}

