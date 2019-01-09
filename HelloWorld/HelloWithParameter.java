import java.util.Scanner;   // Import Scanner class.

public class HelloWithParameter {   // Class declaration.
	
	public static void main(String[] args) {    // Main class declaration.
		
		String Nombre;    // String variable declaration.
		Scanner scn = new Scanner(System.in);   // Scanner new object declaration.
		
    System.out.print("Por favor, ingresa tu nombre: ");   // Outpunt message to console 
		Nombre = scn.nextLine();    // Assign input to the String variable.
		System.out.println("Hola " + Nombre);   // Outpunt message to console with input parameter.
		
	}
	
}
