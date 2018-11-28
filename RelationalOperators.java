import java.util.Scanner;

public class RelationalOperators {

  public static void main(String args[]) {
  
  int numeroUno, numeroDos = 0;
  Scanner scan = new Scanner(System.in);
  System.out.println("Favor de ingresar dos numeros");
  numeroUno = scan.nextInt();
  numeroDos = scan.nextInt();

    if (numeroUno < numeroDos) {
	System.out.println("El numero " + numeroUno + " es menor que " + numeroDos);
    } else if (numeroUno > numeroDos) {
	System.out.println("El numero " + numeroUno + " es mayor que " + numeroDos);
    } else if (numeroUno == numeroDos) {
	System.out.println("El numero " + numeroUno + " es igual que " + numeroDos);
    } else {
	System.out.println("Los datos ingresados son incorrectos");
    }

  }

}
