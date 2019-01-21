public class ArrayBidemensionalForEach {
	
	public static void main(String[] args) {
		
		int[][] arregloBidemensional = {
			{10, 20, 30, 40, 50},
			{15, 25, 35, 45, 55},
			{1, 2, 3, 4, 5},
			{-12, -10, -23, 14, 90},
			{23, 45, 90, 56, 34}
		};
		
		for (int[]file: arregloBidemensional) {
			
			System.out.print("Dimensi\u00f3n: ");
			
			for (int z: file) {
				
				System.out.print(z + " ");
				
			}
			
			System.out.println(" ");
		}
	}
	
}
