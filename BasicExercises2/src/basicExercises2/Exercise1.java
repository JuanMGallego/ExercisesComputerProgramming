package basicExercises2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables and constants are declared
		Scanner sc = new Scanner(System.in);
		float apples, pears, aEur, pEur;
		final float A_PRICE = 2.35f, P_PRICE = 1.95f;
		
		//title
		System.out.println("CONVERSOR DE PESO A PRECIO (MANZANAS/PERAS)");
		System.out.println();
		
		//apples kg are asked
		System.out.print("Introduzca los kg de manzanas: ");
		apples = sc.nextFloat();
		
		//pears kg are asked
		System.out.print("Introduzca los kg de peras: ");
		pears = sc.nextFloat();
		System.out.println();
		
		//Prices are calculated
		aEur = apples*A_PRICE;
		pEur = pears*P_PRICE;
		
		//final result is printed
		System.out.println(apples + " kg de manzanas son " + aEur + " eur");
		System.out.println(pears + " kg de peras son " + pEur + " eur");
		
		sc.close(); //scanner closes
		
	}

}
