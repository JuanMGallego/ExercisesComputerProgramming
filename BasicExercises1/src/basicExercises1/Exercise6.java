package basicExercises1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		double n1, n2, add, sub1, sub2, mul, div1, div2;

		//title
		System.out.println("Aplicación para muestra de operaciones de DOS números");
		System.out.println();
		
		//first number is asked
		System.out.print("Introduzca un número: ");
		n1 = sc.nextDouble();
		
		//second number is asked
		System.out.print("Introduzca otro número: ");
		n2 = sc.nextDouble();
		System.out.println();
		
		//Operations are calculated
		add = n1 + n2;
		sub1 = n1 - n2;
		sub2 = n2 - n1;
		mul = n1 * n2;
		div1 = n1 / n2;
		div2 = n2 / n1;
		
		//Final result is printed
		System.out.println(n1 + " + " + n2 + " = " + add);
		System.out.println(n1 + " - " + n2 + " = " + sub1 + " y " + n2 + " - " + n1 + " = " + sub2);
		System.out.println(n1 + " x " + n2 + " = " + mul);
		System.out.println(n1 + " / " + n2 + " = " + div1 + " y " + n2 + " / " + n1 + " = " + div2);
		
		sc.close(); //Scanner closes
		
	}

}
