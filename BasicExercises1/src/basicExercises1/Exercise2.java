package basicExercises1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduzca su edad: ");
		Scanner age = new Scanner(System.in);
		int ageint = age.nextInt();
		int age2 = ageint + 1;
		System.out.println();
		System.out.println("El año que viene el mismo día su edad será: " + age2 + " años");
		age.close();
	}

}
