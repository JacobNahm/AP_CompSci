/*
 *	Author: Jacob Nahm
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
    int example = 0;
    public String role = new String("");

    public myCharacter(){
        role = "no role";

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


}