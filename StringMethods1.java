import java.util.Scanner;

public class StringMethods1 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Captura tu nombre: ");
		String textoCapturado = scn.nextLine();
		
		System.out.println("La longitud de tu nombre es de: " + textoCapturado.length() + " caracteres.");
		System.out.println("La primera letra de tu nombre es: " + textoCapturado.charAt(0) + " y la ultima es " + textoCapturado.charAt(textoCapturado.length() - 1));
		
	}
	
}
