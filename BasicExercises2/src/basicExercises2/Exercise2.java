package basicExercises2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables and constants are declared
		Scanner sc = new Scanner(System.in);
		int age;
		boolean overage;
		
		//age is asked
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		System.out.println();
		
		//if the age introduced is 18 or more, the boolean will be true
		overage = age >= 18;
		
		//final result is printed
		System.out.println("�Es ust�d mayor de edad?: " + overage);
		
		sc.close(); //scanner closes
		
	}

}
