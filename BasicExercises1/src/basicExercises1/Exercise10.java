package basicExercises1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables and constants are declared
		Scanner sc = new Scanner(System.in);
		float gross, net;
		final double IVA = 0.79;
		
		//title
		System.out.println("CONVERSOR DE PRECIO BRUTO A NETO");
		System.out.println();
		
		//gross price
		System.out.print("Introduzca su precio bruto: ");
		gross = sc.nextFloat();
		System.out.println();
		
		//net price is calculated using the constant IVA
		net = (float)(gross*IVA);
		
		//final result is printed
		System.out.println("El precio neto es de " + net + " euros");
		
		sc.close(); //scanner closes
		
	}

}
