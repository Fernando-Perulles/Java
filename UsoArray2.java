import javax.swing.*;
import java.util.Scanner;

public class UsoArray2 {
	
	public static void main(String[] args) {
		
		System.out.print("Indica el n\u00famero de paises ");
		Scanner scn = new Scanner(System.in);
		int numeroPaises = scn.nextInt();
		
		String [] paises = new String[numeroPaises];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Captura el pais " + (i+1));
		}
		
		for (String elemento:paises){
			System.out.println("Pais " + elemento);
		}
    
	}
	
}
