/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;


	class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Warrior[] warriors1 = new Warrior[100];
	
	Wizard[] wizards1 = new Wizard[100];
	
	for(int i = 0; i<100; i++){
		warriors1[i] = new Warrior();
		wizards1[i] = new Wizard();
	}
	
	int deadWarriors = 0;
	int deadWizards = 0;
	
	for(int i = 0; i<100; i++){
		Warrior currentWarrior = warriors1[i];
		Wizard currentWizard = wizards1[i];
		currentWizard.attack(currentWarrior);
		if(currentWarrior.isDead()){
			deadWarriors++;
			System.out.println("Current warrior is dead! unto the next round");
			continue;
		}
		currentWarrior.attack(currentWizard);
		if(currentWizard.isDead()){
			deadWizards++;
			System.out.println("Current wizard is dead! unto the next round");
		}
	}
	
	int remainingWarriors = 100-deadWarriors;
	int remainingWizards = 100-deadWizards;
	
	if(remainingWarriors>remainingWizards){
		System.out.println("Warriors won with " + remainingWarriors + " left!");
	}
	else if(remainingWarriors<remainingWizards){
		System.out.println("Wizards won with " + remainingWizards + " left!");
	}
	else{
		System.out.println("It was a tie!");
	}
	
	}
}




