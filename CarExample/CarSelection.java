import java.util.Scanner;
import javax.swing.*;

public class CarSelection {
	
	public static void main(String[] args) {
		
		Scanner scanText = new Scanner(System.in);
		System.out.println("Select Maker: \n1: VW \n2: FORD \n3: KIA");
		int availableMakers = scanText.nextInt();
		
		switch (availableMakers) {
			
			case 1:
			
				CarBlueprint VWCar = new CarBlueprint();
				VWCar.setMaker("VW");
				VWCar.setModel("VW");
				System.out.println(VWCar.getMaker() + VWCar.getModel());
				break;
				
			case 2:
			
				CarBlueprint FORDCar = new CarBlueprint();
				FORDCar.setMaker("FORD");
				FORDCar.setModel("FORD");
				System.out.println(FORDCar.getMaker() + FORDCar.getModel());
				break;
				
			case 3:
			
				CarBlueprint KIACar = new CarBlueprint();
				KIACar.setMaker("KIA");
				KIACar.setModel("KIA");
				System.out.println(KIACar.getMaker() + KIACar.getModel());
				break;
				
			default:
			
				System.out.println("La opci\u00F3n seleccionada, no es correcta.");
				
		}
		
	}
		
}
