import java.util.Scanner;

public class UserInput {

  public static void main(String args[]) {

    Scanner scn = new Scanner(System.in);
    String nombre = "";
    
    System.out.println("Por favor, ingresa tu nombre");
    nombre = scn.nextLine();

    System.out.println("Hola " + nombre + " te saluda Java.");
    
  }
  
}
