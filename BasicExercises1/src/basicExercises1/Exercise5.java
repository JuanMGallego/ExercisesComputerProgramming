package basicExercises1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		double r, l, a;
		
		//title
		System.out.println("Aplicación para calcular longitud y área de una circunferencia.");
		System.out.println();
		
		//radius is asked
		System.out.print("Introduzca el radio de la circunferencia: ");
		r = sc.nextFloat();
		System.out.println();
		
		//area and perimeter is calculated
		l = 2 * Math.PI * r;
		a = Math.PI*r*r;
		
		//Final result is printed
		System.out.println("La longitud de su circunferencia es de " + l + " u");
		System.out.println("El área de su circunferencia es de " + a + " u^2");
		
		sc.close(); //Scanner is closed
		
	}

}
