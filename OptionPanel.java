import javax.swing.*;

public class OptionPanel {
	
	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edadUsuario = JOptionPane.showInputDialog("Introduce tu edad");
		int edadNumerica = Integer.parseInt(edadUsuario);
		edadNumerica++;
		
		System.out.println("Tu nombre es " + nombreUsuario + " el proximo a\u00f1o tendras " + edadNumerica);
		
	}
}
