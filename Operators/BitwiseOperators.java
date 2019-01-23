public class BitwiseOperators {
	
	public static void main(String[] args) {
		
		int value1 = 25; // Binary 1 1 0 0 1
		int value2 = 15; // Binary 0 1 1 1 1
				// And   0 1 0 0 1
				// Or	 1 1 1 1 1
		int value3 = value1 & value2;
		int value4 = value1 | value2;
		System.out.print("Bitwise AND for " + value1 + " and " + value2 + " is " + value3);
		System.out.print("Bitwise OR for " + value1 + " and " + value2 + " is " + value4);
	}
	
}
