public class UsoArray3 {
	
	public static void main(String[] args) {
		
		int[] matrizNumeros = new int[150];
		
		for (int i = 0; i < matrizNumeros.length; i++) {
			
			matrizNumeros[i] = (int)(Math.random() * 100);
			
		}
		
		for (int elemento:matrizNumeros) {
			System.out.print(elemento + " ");
		}
    
	}
	
}
