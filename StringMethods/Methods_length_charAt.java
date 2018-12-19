/**
 * Compilación: javac Methods_length_charAt.java
 * Ejecución: java Methods_length_charAt
 * Método length() muestra la cantidad de caracteres que forman la cadena capturada.
 * Método charAt() muestra el carácter de la cadena capturada en una posición selecionada.
 */

import java.util.Scanner; // Para utilizar la clase Scanner es necesario importar java.util.

public class Methods_length_charAt { // Definición de la clase.
	
	public static void main(String[] args) { // Declaración de main.

		Scanner scn = new Scanner(System.in); // Crear un objeto de tipo Scanner.
		System.out.print("Captura tu nombre: "); // Llamado a metodo Print para mostrar texto en pantalla.
		String textoCapturado = scn.nextLine();  // Asignación de contenido del objeto Scanner a una variable de tipo String.

		System.out.println("La longitud de tu nombre es de: " + textoCapturado.length() + " caracteres.");
		System.out.println("La primera letra de tu nombre es: " + textoCapturado.charAt(0) + " y la ultima es " + textoCapturado.charAt(textoCapturado.length() - 1));
		
	}
	
}
