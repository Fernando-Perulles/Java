/********************************************************************************
 * Programa para calcular el área de: Cuadrado, Rectángulo, Triángulo o Círculo.
 ********************************************************************************/
 
import java.util.Scanner; // Importar util para tener acceso a Scanner.
import javax.swing.*; // Importar swing para tener acceso a JOptionPane.

public class CalcularAreas {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Elije una opci\u00F3n: \n1: Cuadrado \n2: Rect\u00E1ngulo \n3: Tri\u00E1ngulo \n4: C\u00EDrculo");
		
		int formaSeleccionada = scn.nextInt();
		
		switch(formaSeleccionada) {
			
			case 1:
			
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
        			System.out.println("El \u00E1rea del Cuadrado es: " + Math.pow(lado, 2));        
				break;
				
			case 2:
			
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El \u00E1rea del Rect\u00E1ngulo es: " + (base * altura));
				break;
				
			case 3:
			
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El \u00E1rea del Tri\u00E1ngulo es: " + ((base * altura) / 2));
				break;
				
			case 4:
			
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
				System.out.print("El \u00E1rea del C\u00EDrculo es: ");
				System.out.printf("%1.5f", Math.PI * Math.pow(radio, 2) );
				break;
				
			default:
			
				System.out.println("La opci\u00F3n seleccionada, no es correcta.");
				
		}
		
	}
	
}
