package basicExercises2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double num;
		boolean  even_num;
		
		//age is asked
		System.out.print("Introduzca su edad: ");
		num = sc.nextInt();
		System.out.println();
		
		//if the rests, the boolean will be true
		even_num = num%2 == 0;
		
		//final result is printed
		System.out.println("¿Es ustéd mayor de edad?: " + even_num);
		
		sc.close(); //scanner closes
		
	}

}
