import java.util.Scanner;
import java.text.NumberFormat;

public class Math_pow {
	
	public static void main(String[] args) {
		
		int numeroBase = 0;
		int numeroExponente = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Proporciona el numero base ");
			numeroBase = scn.nextInt();
		System.out.print("Proporciona el numero exponente ");
			numeroExponente = scn.nextInt();
		
		double potencia = (double)Math.pow(numeroBase, numeroExponente); // Cast o refundición de numeroBase, numeroExponente para evitar perdida de información
		
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println(numeroBase + " elevado a " + numeroExponente + " es igual a " + nf.format(potencia));
		
	}
	
}
