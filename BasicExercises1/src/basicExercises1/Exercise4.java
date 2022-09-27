package basicExercises1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float m1, m2, mm;
		
		System.out.println("Programa para calcular la media aritmética de dos notas.");
		System.out.println();
		
		System.out.print("Introduce la nota nº1: ");
		m1 = sc.nextFloat();
		
		System.out.print("Introduce la nota nº2: ");
		m2 = sc.nextFloat();
		System.out.println();
		
		mm = (m1 + m2) / 2;
		System.out.println("Su nota media es: " + mm);
		
		sc.close();
		
	}

}
