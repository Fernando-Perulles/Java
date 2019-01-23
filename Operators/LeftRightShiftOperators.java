public class LeftRightShiftOperators {
	
	public static void main(String[] args){
		
		int value_1 = 8; // 1 0 0 0
		int value_2 = value_1 << 2; // 1 0 0 0 0 0 -> 32
		int value_3 = value_1 >> 2; // 1 0
		
		System.out.println("Shift Left operator for " + value_1 + " is " + value_2);
		System.out.println("Shift Right operator for " + value_1 + " is " + value_3);
	}
	
}
