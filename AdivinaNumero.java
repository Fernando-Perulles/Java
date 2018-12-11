import java.util.Scanner;

public class AdivinaNumero {
	
	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random() * 100);
		
		//System.out.print(aleatorio); Para mostrar en pantall el numero generado.
		
		Scanner scn = new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		while (numero != aleatorio) {
			
			intentos ++;
			
			System.out.print("Introduce un n\u00famero por favor: ");
			numero = scn.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("El n\u00famero debe ser menor.");
			}
			else if (aleatorio > numero) {
				System.out.println("El n\u00famero debe ser mayor.");
			}
		}
		
		System.out.println("Adivinaste! El n\u00famero es " + aleatorio + " lo lograste en " + intentos + " intentos");
	}
	
}
