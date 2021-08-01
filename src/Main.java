//Main area for the project
//What it does: 
//Calls on EatingOut and AtHome to get food
//Prints to user/gets info from user

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EatingOut out = new EatingOut();
		AtHome home = new AtHome();		
		Scanner input = new Scanner(System.in);
		int keepGoing = 0;
		
		header();
		while(keepGoing != 1) {
			System.out.println();
			System.out.println("Please enter a number for what you wish to do:");
	        System.out.println("1: Restaurant \n2: Cooking at Home \n3: Exit");
	        int answer = input.nextInt();
	        
	        if(answer == 1) {
	        	System.out.println();
	        	System.out.println("Under construction for getting food");
	        }
	        else if(answer == 2) {
	        	System.out.println();
	        	System.out.println("Under construction for cooking");
	        }
	        else {
	        	System.out.println();
	        	keepGoing = 1;
	        	System.out.println("Thanks for visiting! Come again!");
	        }
		}
		
	}

	public static void header() {
        //The before chart header
        displayDashes(90);
        System.out.println();
        System.out.println("Welcome to What's for Dinner");
        displayDashes(90);
        System.out.println();
    }
	
	public static void displayDashes(int n) {
        for (int i =0; i<n; i++){
            System.out.print("=");
        }  
    }
}
