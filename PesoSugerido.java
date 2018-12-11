import javax.swing.*;

public class PesoSugerido {
	
	public static void main(String[] args) {
		
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Indica tu genero (H / M)");
		}
		while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false); 
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu astatura en cm"));
		
		int pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		}
		else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + " kilos");
		
	}
	
}
