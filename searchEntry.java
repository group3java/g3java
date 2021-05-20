package softwareEngineering;

import java.util.Scanner;

public class searchEntry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// Creates a scanner to get user input
		System.out.println("Enter Entry Here: "); // Outputs message to user and asks for their input
		String userInput = in.nextLine(); // Grabs input entered by user
		System.out.println("Results: "); // Displays the user their results which that can click on and get their information
		System.out.println(userInput);
		
		System.out.println("Would you like to search for another entry?"); // Asks user if they want to enter another line of text in 
		System.out.println("Enter 'Yes' or 'No': "); // Asks user for input
		Scanner in2 = new Scanner(System.in); // Creates scanner for user input
		String userInput2 = in.nextLine(); // Catches the user input
		if (userInput.equals("Yes")){ // Checks to see if user wants to enter another input
			main(null);} // Loops program again 
		else if (userInput2.equals("yes")){ // Checks to see if user wants to enter another input
			main(null);} // Loops program again 
		if (userInput2.equals("Y")){ // Checks to see if user wants to enter another input
			main(null);} // Loops program again 
		if (userInput2.equals("y")){ // Checks to see if user wants to enter another input
			main(null);} // Loops program again 
		else if ((userInput2.equals("No"))){ // Checks to see if user wants to end the program 
			 System.exit(0);}
		else if ((userInput2.equals("no"))){ // Checks to see if user wants to end the program 
			 System.exit(0);}
		else if ((userInput2.equals("n"))){ // Checks to see if user wants to end the program 
			 System.exit(0);}
		else if ((userInput2.equals("N"))){ // Checks to see if user wants to end the program 
			 System.exit(0);}

	}

}
