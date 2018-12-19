/**
 * Compilación: javac CalculadoraEdad.java
 * Ejecución: java CalculadoraEdad
 * Método nextInt() Almacena el valor capturado por el usuario.
 *
 */
 
import java.util.Scanner; // Para utilizar la clase Scanner es necesario importar java.util.
import java.text.NumberFormat;

public class CalculadoraEdad {	// Definición de la clase.
	
	public static void main(String[] args) { // Declaración de main.
  
		System.out.print("Por favor ingresa tu edad en a\u00F1os: ");
		
		Scanner age = new Scanner(System.in);	// Crear un objeto de tipo Scanner.
		int ageDays = (age.nextInt() * 365);	// Asignación de contenido del objeto Scanner a una variable de tipo Integer.
		long ageMinutes, ageSeconds, ageMilliseconds; // Declaración de variables tipo long.
		
		ageSeconds = ageDays * 24 * 60 * 60;
		ageMinutes = ageSeconds / 60;
		ageMilliseconds = ageSeconds * 1000;
		
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println("Tu tienes " + nf.format(ageDays) + " d\u00edas de edad.");
		System.out.println("Tu tienes " + nf.format(ageMinutes) + " minutes de edad.");
		System.out.println("Tu tienes " + nf.format(ageSeconds) + " segundos de edad.");
		System.out.println("Tu tienes " + nf.format(ageMilliseconds) + " milisegundos de edad.");
    
	}

}
