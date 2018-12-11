/*******************************************************
* Para declarar la matriz puede utilizarse la notación:
*	int [] arraySimple = new int[5];
*		arraySimple[0] = 5;
*		arraySimple[1] = -10;
*		arraySimple[2] = 120;
*		arraySimple[3] = -43;
*		arraySimple[4] = 78;
*******************************************************/

public class UsoArray {
	
	public static void main(String[] args) {

		int [] arraySimple = {5, -10, 120, 43, 78};
		
		for (int i = 0; i < arraySimple.length; i++) {
			System.out.println("Valor del indice " + i + " = "+ arraySimple[i]);
		}
    
	}
  
}
