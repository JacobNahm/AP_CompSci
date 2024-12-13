/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;


import java.util.Scanner;
import java.util.Random;


class starter{
    public static void main(String args[]){
        
        String player1 = "Messi"; 
        String player2 = "Ronaldo"; 
        String UserPlayer = "";
        String CpuPlayer = ""; 
        
        int userWin = 0; 
        int cpuWin = 0; 
        
    System.out.println("First one to 5 wins, wins the whole game!!");
        
        Scanner sc = new Scanner(System.in);
        
    while (userWin < 5 && cpuWin < 5){
        System.out.println("Choose your player: Type 1 for Messi / Type 2 for Ronaldo"); 
        int choice = sc.nextInt();
        if(choice == 1){
            UserPlayer = player1; 
            CpuPlayer = player2;
    
        }
        else if(choice == 2){
            UserPlayer = player2; 
            CpuPlayer = player1; 
        }
        else{ 
            System.out.println("Choice not valid, please try again.");
            continue;
        }
        
        System.out.println("You are " + UserPlayer + ". You are going up against " + CpuPlayer); 
        
        double jacob = (Math.random());
        if (jacob < 0.5){ 
            System.out.println("You have beat " + CpuPlayer + " in a 1v1. You WINNNN!"); 
            userWin++; 
        } 
        else {
            System.out.println( CpuPlayer + " has beat you in a 1v1. You LOSTT!"); 
            cpuWin++;
        }
        System.out.println("The current score is " + userWin + ":" + cpuWin);

        
        
        
        
        } 
        if(userWin == 5){
            System.out.println("You have 5 Winsssss. You won the whole game. Thanks for playing!"); 
        }
        else{ 
            System.out.println("The Cpu has 5 Winssss. " + CpuPlayer + " has won the whole game. Better luck next time!");
        }
    }
}   

