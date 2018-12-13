public class CarBlueprint {

	// Class variables | Fields
	private String maker;
	private String model;
	
	// Constructur
	public CarBlueprint() {
		maker = "";
		model = "";
	}
	
	// Set and Get methods
	public void setMaker(String selectedMaker) { // Método Getter
		maker = selectedMaker;
	}
	
	public String getMaker() { // Método Setter
		return "El fabricante es " + maker;
	}
	
	public void setModel(String Maker) { // Método Getter

		switch (Maker) {
			
			case "VW":
				model = "Golf";
				break;
			case "FORD": 
				model = "Mustang";
				break;
			case "KIA":
				model = "Sedona";
				break;
			default:
				System.out.println("Modelo no Disponible.");
		}
	}
	
	public String getModel() { // Método Setter
		return " y el modelo disponible es: " + model;
	}	
}
