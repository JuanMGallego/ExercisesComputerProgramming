package basicExercises1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name, address, tlpnum;
		
		System.out.println("Introduzca su nombre: ");
		name = sc.nextLine();
		
		System.out.println("Introduzca su direcci�n: ");
		address = sc.nextLine();
		
		System.out.println("Introduzca su n�mero de tel�fono: ");
		tlpnum = sc.nextLine();
		System.out.println();
		
		System.out.println("Nombre: " + name);
		System.out.println("Direcci�n: " + address);
		System.out.println("Número de tel�fono: " + tlpnum);
		
		sc.close();
		
	}

}
