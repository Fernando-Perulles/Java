import java.util.Scanner;
import java.text.NumberFormat;

public class CalcularEdad {
	
	public static void main(String[] args){
		System.out.println("Por favor ingresa tu edad en a\u00F1os");
		Scanner age = new Scanner(System.in);		
		int ageDays = (age.nextInt() * 365);
		long ageMinutes, ageSeconds, ageMilliseconds;
		
		ageSeconds = ageDays * 24 * 60 * 60;
		ageMinutes = ageSeconds / 60;
		ageMilliseconds = ageSeconds * 1000;
		
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println("You are " + nf.format(ageDays) + " days old");
		System.out.println("You are " + nf.format(ageMinutes) + " minutes old");
		System.out.println("You are " + nf.format(ageSeconds) + " seconds old");
		System.out.println("You are " + nf.format(ageMilliseconds) + " milliseconds old");
	}

}
