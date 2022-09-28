package basicExercises1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables and constants are declared
		Scanner sc = new Scanner(System.in);
		float pts, eur;
		final double PTA = 0.006;
		
		//title
		System.out.println("CONVERSOR DE PESETAS A EUROS");
		System.out.println();
		
		//pesetas amount is asked
		System.out.print("Introduzca una cantidad en pesetas: ");
		pts = sc.nextFloat();
		System.out.println();
		
		//pesetas are converted to euros using the constant
		eur = (float)(pts*PTA);
		
		//final result is printed
		System.out.println(pts + " pesetas = " + eur + " euros.");
		
		sc.close(); //scanner closes
		
	}

}
