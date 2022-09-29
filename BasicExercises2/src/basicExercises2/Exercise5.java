package basicExercises2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables
		Scanner sc = new Scanner(System.in);
		int term1, term2, term3, repCard;
		float record;
		
		//title
		System.out.println("CALCULADORA DE NOTAS (BOLETÍN Y EXPEDIENTE)");
		System.out.println();
		
		//First term mark is asked and stored into a variable
		System.out.print("Introduzca la nota del 1er trimestre: ");
		term1 = sc.nextInt();
		
		//Second term mark is asked and stored into a variable
		System.out.print("Introduzca la nota del 2º trimestre: ");
		term2 = sc.nextInt();
		
		//Third term mark is asked and stored into a variable
		System.out.print("Introduzca la nota del 3er trimestre: ");
		term3 = sc.nextInt();
		System.out.println();
		
		//Marks are calculated and the record one transformed into a float variable
		repCard = (term1 + term2 + term3)/3;
		record = (float)(term1 + term2 + term3)/3;
		
		//Final result is printed and record one its reduced to two decimals
		System.out.println("Nota del boletín: " + repCard);
		System.out.printf("Nota del expediente: %.2f", record);
		
		sc.close(); //scanner closes
		
	}

}
