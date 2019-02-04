/**
 * Compilation: javac HelloYourName
 * Execution: java HelloYourName
 * This program asks for your name and take it as parameter to print it into the console.
 **/
import java.util.Scanner; // import Scanner class for scan object declaration.

public class HelloYourName { // public is the access modifier.
	
	public static void main (String[] args) {

	System.out.print("What is your name? ");
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	
		try {
			if (name != "") {
				
				System.out.println("Hello " + name);
				
			}
		}
		catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
		
	}
	
}
