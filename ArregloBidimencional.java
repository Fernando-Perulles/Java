public class ArregloBidimencional {
	
	public static void main(String[] args) {
		
		int[][] matrizDosDimensiones = new int[4][5];
		
			matrizDosDimensiones[0][0] = 5;
			matrizDosDimensiones[0][1] = 10;
			matrizDosDimensiones[0][2] = 15;
			matrizDosDimensiones[0][3] = 20;
			matrizDosDimensiones[0][4] = 25;
			
			matrizDosDimensiones[1][0] = 10;
			matrizDosDimensiones[1][1] = 20;
			matrizDosDimensiones[1][2] = 30;
			matrizDosDimensiones[1][3] = 40;
			matrizDosDimensiones[1][4] = 50;
			
			matrizDosDimensiones[2][0] = 15;
			matrizDosDimensiones[2][1] = 25;
			matrizDosDimensiones[2][2] = 35;
			matrizDosDimensiones[2][3] = 45;
			matrizDosDimensiones[2][4] = 60;
			
			matrizDosDimensiones[3][0] = 20;
			matrizDosDimensiones[3][1] = 50;
			matrizDosDimensiones[3][2] = 70;
			matrizDosDimensiones[3][3] = 90;
			matrizDosDimensiones[3][4] = 120;
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print("Dimensi\u00f3n " + i + ": ");
			
			for (int j = 0; j < 5; j++) {
				
				System.out.print(matrizDosDimensiones[i][j] + (" "));

			}
			
			System.out.println(" ");
		}
		
	}
	
}
