package basicExercises1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		String name, address, tlpnum;
		
		//Name is asked
		System.out.println("Introduzca su nombre: ");
		name = sc.nextLine();
		
		//Address is asked
		System.out.println("Introduzca su direcci�n: ");
		address = sc.nextLine();
		
		//telephone number is asked
		System.out.println("Introduzca su n�mero de tel�fono: ");
		tlpnum = sc.nextLine();
		System.out.println();
		
		//final result is printed
		System.out.println("Nombre: " + name);
		System.out.println("Direcci�n: " + address);
		System.out.println("Número de tel�fono: " + tlpnum);
		
		sc.close(); //Scanner closes
		
	}

}
