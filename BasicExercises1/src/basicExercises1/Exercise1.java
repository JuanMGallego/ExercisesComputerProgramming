package basicExercises1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner is started to introduce data into variables, then the variable is declared
		Scanner sc = new Scanner(System.in);
		int n;
		
		//Number is asked
		System.out.print("Introduzca un n�mero: ");
		n = sc.nextInt();
		System.out.println();
		
		//The final result is printed
		System.out.println("Su n�mero es: " + n);
		
		sc.close(); //scanner closes
		
	}

}
