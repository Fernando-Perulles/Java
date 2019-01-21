import java.util.Scanner;

public class PhoneConfiguration {
	
	public static void main(String[] args){
		
		nokia objN = new nokia();
		iphone objI = new iphone();
		samsung objS = new samsung();
		System.out.println("Select your phone, options are: \n1: Nokia, \n2: Iphone, \n3: Samsung ");
		Scanner scn = new Scanner(System.in);
		String selectedPhone = scn.nextLine();
		int BrandID;

				
		if (isNumeric(selectedPhone)){

			BrandID = Integer.parseInt(selectedPhone);
			
			try {
				if(BrandID != 0){
						
					switch (BrandID) {
						case 1:
							System.out.print("You select Nokia phone, with following characeristics:");
							show(objN);
							break;
						case 2:
							System.out.print("You select Iphone phone, with following characeristics:");
							show(objI);
							break;
						case 3:
							System.out.print("You select Samsung phone, with following characeristics:");
							show(objS);
							break;
						default:
							System.out.print("Its not a valid model, please try again");

					}
				}
			}
			catch (Exception e){
					
				System.out.print("" + e.getMessage());
					
			}
		}
		else{
			System.out.print("Is not a valid option, please confirm.");
		}
			
	}	
	
	public static void show(Phone obj){
		
		obj.showConfig();
		obj.showPrice();
		
	}
	
	
	public static boolean isNumeric(String str) {
		
		return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
		
	}
  
}

abstract class Phone {
	
	public abstract void showConfig();
	public abstract void showPrice();
	
}

class nokia extends Phone{
	
	public void showConfig() {
		System.out.print(" 1 Gb Ram, HoneyComb OS.");
	}
	public void showPrice() {
		System.out.print(" Price is 30 USD");
	}
  
}

class iphone extends Phone{
	
	public void showConfig(){
		System.out.print(" 2 Gb Ram, IOS.");
	}
	public void showPrice() {
		System.out.print(" Price is 80 USD");
	}
	
}

class samsung extends Phone{
	
	public void showConfig(){
		System.out.print(" 3 Gb Ram, Loolipop.");
	}
	public void showPrice() {
		System.out.print(" Price is 40 USD");
	}
  
}
