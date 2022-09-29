package basicExercises2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		double num;
		boolean  evenNum;
		
		//age is asked
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println();
		
		//if the rest is 0, the boolean will be true
		evenNum = num%2 == 0;
		
		//final result is printed
		System.out.println("¿Es el número par?: " + evenNum);
		
		sc.close(); //scanner closes
		
	}

}
