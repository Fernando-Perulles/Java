/************************************************************************
 * Compilación: javac EuclideanDistance.java
 * Ejecución: java EuclideanDistance x y
 * Imprime la distancia desde (x, y) al origen, donde x y y son enteros.
 * Ejemplos:
 *  java Distance 3 4
 *  distance from (3, 4) to (0, 0) = 5.0
 *
 *  % java Distance 2 1
 *  distance from (2, 1) to (0, 0) = 2.23606797749979
 ************************************************************************/

import java.util.Scanner;

public class EuclideanDistance {
	
	public static void main(String[] args){
		int numX = Integer.parseInt(args[0]);
		int numY = Integer.parseInt(args[1]);
		
		double dist = Math.sqrt(numX*numX + numY*numY);
		
		System.out.println("distance from (" + numX + ", " + numY +") to (0, 0) = " + dist);
		
	}
	
}
