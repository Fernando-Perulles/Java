import javax.swing.*;

public class FormatearNumero {
	
	public static void main(String[] args) {
		
		String numeroCapturado = JOptionPane.showInputDialog("Introduce un numero, por favor");
		double numeroDouble = Double.parseDouble(numeroCapturado);
		
		System.out.print("La raiz de " + numeroCapturado + " es ");
		System.out.printf("%1.5f", Math.sqrt(numeroDouble));
		
	}
	
}
