/**
 * Compilation: javac HelloYourName
 * Execution: java HelloYourName
 * This program asks for your name and take it as parameter to print it into the console.
 **/

import java.util.Scanner; // import Scanner class for scan object declaration.

public class HelloYourName { // Class declaration. (public) is the access modifier.
	
	public static void main (String[] args) { // (main) class declaration.

	System.out.print("What is your name? "); // Print message to console
	Scanner scan = new Scanner(System.in); // new Scanner object declaration.
	String name = scan.nextLine(); // String variable declaration. Assign the input to the String variable.
	
		try {
			if (name != "") {
				
				System.out.println("Hello " + name); // Outpunt message to console with the input.
				
			}
		}
		catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
		
	}
	
}
