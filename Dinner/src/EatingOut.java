//File associated with this class: Going Out

import java.io.*;
import java.util.*;

public class EatingOut {
	/* The Plan:
	 * Get info from file and save into an string array
	 * Choose random number
	 * Send whatever number corresponds with that place to Main 
	 */
	private ArrayList<String> foodArray;
	private int randomNumber;
	private String answer;
	private int size;
	
	//Puts into from file into foodArray and gets the size of the file and puts it into size
	public EatingOut(){ 
		//Gets info from file
		//Get size of file
		File file = new File(".\\src\\GoingOut");
        Scanner inputStream = null;
        foodArray = new ArrayList<String>();
        
		try {
			inputStream = new Scanner(new FileInputStream(file));
        }
        catch(FileNotFoundException e) {
            System.out.println("The file you entered was not found");
            System.out.println("or could not be opened.");
            System.exit(0);
        }
		
		String line = null;
        
        //Counts the number of lines, words, and characters
        while(inputStream.hasNextLine()) {
            try {
                line = inputStream.nextLine();
                foodArray.add(line);
                size++;
            }
            catch(InputMismatchException e) {
                System.out.println("There is a problem.");
            }
        }
        inputStream.close();
	}
	
//	public void testingArray() {
//		for(int i = 0; i < size; i++) {
//			System.out.println(foodArray.get(i));
//		}
//	}
	
	//Generates random number
	public void generator() {
		//Gets random number
		Random ran = new Random();
		randomNumber = ran.nextInt(size);
	}
	
	//Returns a place to main
	public void forMain() {
		generator(); //To get the random number
		
		//Find the place that goes with the number
		answer = foodArray.get(randomNumber);
		
		//Prints answer
		System.out.println(answer);
	}
}
