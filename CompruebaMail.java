import javax.swing.*;

public class CompruebaMail {
	
	public static void main(String[] args) {
		
		int arroba = 0;
		boolean punto = false;
		
		String email = JOptionPane.showInputDialog("Captura tu direcci\u00f3n de email");
		
		for(int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i) == '@') {
				arroba++;
			}
			if (email.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if (arroba == 1 && punto == true) {
			System.out.println("El correo es valido");
		}
		else {
			System.out.println("El correo no es valido");
		}
		
	}
	
}
