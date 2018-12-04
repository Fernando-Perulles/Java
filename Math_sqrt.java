import java.util.Scanner;

public class Math_sqrt {
	
	public static void main(String[] args) {
		
		System.out.println("Proporciona un numero ");
		int numeroUsuario = 0;
		
		Scanner scn = new Scanner(System.in);
		numeroUsuario = scn.nextInt();
		
		double raiz = (double)Math.sqrt(numeroUsuario); // Cast o refundición de numeroUsuario para evitar perdida de información
		
		System.out.println("La raiz cuadrada de " + numeroUsuario + " es " + raiz);
		
	}
	
}
