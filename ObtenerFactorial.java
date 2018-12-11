import javax.swing.*;

public class ObtenerFactorial {
	
	public static void main(String[] args) {
		
		Long resultado = 1L;
		int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un n\u00famero"));
		
		for (int i = numeroUsuario; i > 0; i--) {
			resultado = resultado * i;
		}
    
		System.out.println("El factorial de " + numeroUsuario + " es " + resultado);
	}
	
}
