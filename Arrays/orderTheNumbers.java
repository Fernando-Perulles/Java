import java.util.*;

public class orderTheNumbers {
	
	public static void main(String[] args){
		
		int [] arrayNumbers = {2, 8, 7, 6, 3, 4, 5, 9, 1};
		int tempNumber = 0;
		
		System.out.println("First order is: " + Arrays.toString(arrayNumbers));
			
		for(int i = 0; i < arrayNumbers.length; i++){
			
			if (arrayNumbers[8] < arrayNumbers[7]){
				tempNumber = arrayNumbers[7];
				arrayNumbers[7] = arrayNumbers[8];
				arrayNumbers[8] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[7] < arrayNumbers[6]){
				tempNumber = arrayNumbers[6];
				arrayNumbers[6] = arrayNumbers[7];
				arrayNumbers[7] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[6] < arrayNumbers[5]){
				tempNumber = arrayNumbers[5];
				arrayNumbers[5] = arrayNumbers[6];
				arrayNumbers[6] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[5] < arrayNumbers[4]){
				tempNumber = arrayNumbers[4];
				arrayNumbers[4] = arrayNumbers[5];
				arrayNumbers[5] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[4] < arrayNumbers[3]){
				tempNumber = arrayNumbers[3];
				arrayNumbers[3] = arrayNumbers[4];
				arrayNumbers[4] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[3] < arrayNumbers[2]){
				tempNumber = arrayNumbers[2];
				arrayNumbers[2] = arrayNumbers[3];
				arrayNumbers[3] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[2] < arrayNumbers[1]){
				tempNumber = arrayNumbers[1];
				arrayNumbers[1] = arrayNumbers[2];
				arrayNumbers[2] = tempNumber;
				tempNumber = 0;
			}
			if (arrayNumbers[1] < arrayNumbers[0]){
				tempNumber = arrayNumbers[0];
				arrayNumbers[0] = arrayNumbers[1];
				arrayNumbers[1] = tempNumber;
				tempNumber = 0;
			}
			
		}
		
		System.out.print("New order is: " 
			+ arrayNumbers[0] + " " + arrayNumbers[1] + " " + arrayNumbers[2] + " " + arrayNumbers[3] + " " + arrayNumbers[4] + " " 
			+ arrayNumbers[5] + " " + arrayNumbers[6] + " " + arrayNumbers[7] + " " + arrayNumbers[8]);
		
	}
	
}
