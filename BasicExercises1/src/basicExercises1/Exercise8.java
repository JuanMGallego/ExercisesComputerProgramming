package basicExercises1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		String name, age;
		
		//Name is asked
		System.out.print("Introcucca su nombre: ");
		name = sc.nextLine();
		System.out.println();
		
		//Age is asked
		System.out.print("Introduzca su edad: ");
		age = sc.nextLine();
		System.out.println();
		
		//final result is printed
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");
		
		sc.close(); //Scanner closes
		
	}

}
