package basicExercises1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		float m1, m2, mm;
		
		//title
		System.out.println("Programa para calcular la media aritmética de dos notas.");
		System.out.println();
		
		//First mark is asked
		System.out.print("Introduce la nota nº1: ");
		m1 = sc.nextFloat();
		
		//Second mark is asked
		System.out.print("Introduce la nota nº2: ");
		m2 = sc.nextFloat();
		System.out.println();
		
		//Average grade is calculated
		mm = (m1 + m2) / 2;
		
		//Final result is printed
		System.out.println("Su nota media es: " + mm);
		
		sc.close(); //Scanner closes
		
	}

}
