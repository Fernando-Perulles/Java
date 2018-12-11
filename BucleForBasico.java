import java.util.Scanner;

public class BucleForBasico {
	
	public static void main(String[] args) {
		
		System.out.print("Que texto deseas imprimir? ");
		Scanner scn = new Scanner(System.in);
		String texto = scn.nextLine();
		int contador = 0;
		
		for (int i = 0; i < 10; i++) {
			contador++;
			System.out.println("Imprime " + texto + " " + contador);
		}
		
	}
	
}
