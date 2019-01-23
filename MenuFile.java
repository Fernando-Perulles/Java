import java.util.Scanner;

public class MenuFile {
	
	public static void main(String[] args) {
				
		boolean fileHighlighted = fileMenuHighlighted();
		boolean fileActivated = fileMenuActivated();
		boolean newMenuOptionHighlighted = newOptionHighlighted();
		boolean newMenuOptionActivated = newOptionActivated();
		int collector = 0;
		int yesAnswers;
		
		if (fileHighlighted == true){	//System.out.println("File is Highlighted");
			yesAnswers = 1;
			collector += yesAnswers;
		} else {
			System.out.println("File is not Highlighted");
		}
		if (fileActivated == true) {	//System.out.println("File is Activated");
			yesAnswers = 1;
			collector += yesAnswers;
		} else {
			System.out.println("File is not Activated");
		}
		if (newMenuOptionHighlighted == true) {	//System.out.println("Option New is Highlighted");
			yesAnswers = 1;
			collector += yesAnswers;
		} else {
			System.out.println("Option New is not Highlighted");
		}
		if (newMenuOptionActivated == true) {	//System.out.println("Option New is Activated");
			yesAnswers = 1;
			collector += yesAnswers;
		} else {
			System.out.println("Option New is not Activated");
		}

		System.out.println("Total of Yes answers is: " + collector);
	}
	
	public static boolean fileMenuHighlighted() {
		
		Scanner scn = new Scanner(System.in);
		String answer;
		
		System.out.print("Is file Highlighted? (Y/N):");
		
		while(true) {
			answer = scn.nextLine().trim().toLowerCase();
			if (answer.equals("y")){
				return true;
			} else if (answer.equals("n")){
				return false;
			} else {
				System.out.print("Please enter your answer");
			}				
		}		
		
	}
	
	public static boolean fileMenuActivated() {
		
		Scanner scn = new Scanner(System.in);
		String answer;
		
		System.out.print("Is file Activated? (Y/N):");
		
		while(true) {
			answer = scn.nextLine().trim().toLowerCase();
			if (answer.equals("y")){
				return true;
			} else if (answer.equals("n")){
				return false;
			} else {
				System.out.print("Please enter your answer Y/N");
			}				
		}
	}

	public static boolean newOptionHighlighted() {
		
		Scanner scn = new Scanner(System.in);
		String answer;
		
		System.out.print("Is New option Highlighted? (Y/N):");
		
		while(true) {
			answer = scn.nextLine().trim().toLowerCase();
			if (answer.equals("y")){
				return true;
			} else if (answer.equals("n")){
				return false;
			} else {
				System.out.print("Please enter your answer Y/N");
			}
		}
	}
	
	public static boolean newOptionActivated() {
		
		Scanner scn = new Scanner(System.in);
		String answer;
		
		System.out.print("Is file Activated? (Y/N):");
		
		while(true) {
			answer = scn.nextLine().trim().toLowerCase();
			if (answer.equals("y")){
				return true;
			} else if (answer.equals("n")){
				return false;
			} else {
				System.out.print("Please enter your answer Y/N");
			}				
		}
	}
}
