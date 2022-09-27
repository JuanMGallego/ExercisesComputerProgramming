package basicExercises1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double r;
		double l;
		double a;
		
		System.out.println("Aplicación para calcular longitud y área de una circunferencia.");
		System.out.println();
		
		System.out.print("Introduzca el radio de la circunferencia: ");
		r = sc.nextDouble();
		System.out.println();
		
		l = 2 * Math.PI * r;
		
		System.out.println("La longitud de su circunferencia es de " + l " u");
		
		
		
	}

}
