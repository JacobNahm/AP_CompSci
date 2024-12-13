/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lebron is starting his journey to become an apple!");
    System.out.println("What way would you like him to become an apple?");
    System.out.println("1. Stumbles apon a Enchanted Orchad...");
    System.out.println("2. Participates in a Scientific Eperiement...");
    System.out.println("3. Eats a Wizard's Potion...");
    
    int answer = sc.nextLine();
    if(answer == 1){
        System.out.println("LeBron stumbles upon a magical orchard where the trees are said to grant wishes. What should he do?");
        System.out.println("1. He should grant a wish...");
        System.out.println("2. He should walk away...");
        int answer = sc.nextLine(); 
        
        if(answer == 1)
            System.out.println("He chooses to make a wish and become an apple!");
        else if(answer == 2){
            System.out.print("Lebron does not become an apple");
	    
	}
	else if(answer2 == 2){
	    System.out.print("")
	    
	}
	else if (answer == 3){
	    
	}
	else{
	    
	}
	
	
	
	
	
	
	
}