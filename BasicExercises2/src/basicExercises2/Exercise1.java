package basicExercises2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float apples, pears, a_eur, p_eur;
		final float A_PRICE = 2.35f, P_PRICE = 1.95f;
		
		System.out.println("CONVERSOR DE PESO A PRECIO (MANZANAS/PERAS)");
		System.out.println();
		
		System.out.print("Introduzca los kg de manzanas: ");
		apples = sc.nextFloat();
		
		System.out.print("Introduzca los kg de peras: ");
		pears = sc.nextFloat();
		System.out.println();
		
		a_eur = apples*A_PRICE;
		p_eur = pears*P_PRICE;
		
		System.out.println(apples + " kg de manzanas son " + a_eur + " eur");
		System.out.println(pears + " kg de peras son " + p_eur + " eur");
		
		sc.close();
		
	}

}
