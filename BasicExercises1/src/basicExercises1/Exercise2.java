package basicExercises1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		int age, age2;
		
		//Age is asked
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		System.out.println();
		
		//Age a year later is calculated
		age2 = age + 1;
		
		//Final result is printed
		System.out.println("El a�o que viene el mismo d�a su edad ser�: " + age2 + " a�os");
		
		//Scanner closes
		sc.close();
		
	}

}
