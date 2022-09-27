package basicExercises1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name, age;
		
		System.out.print("Introcucca su nombre: ");
		name = sc.nextLine();
		System.out.println();
		
		System.out.print("Introduzca su edad: ");
		age = sc.nextLine();
		System.out.println();
		
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");
		
		sc.close();
		
	}

}
