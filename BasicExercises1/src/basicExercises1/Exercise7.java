package basicExercises1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name, address, tlpnum;
		
		System.out.println("Introduzca su nombre: ");
		name = sc.nextLine();
		
		System.out.println("Introduzca su dirección: ");
		address = sc.nextLine();
		
		System.out.println("Introduzca su número de teléfono: ");
		tlpnum = sc.nextLine();
		System.out.println();
		
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + address);
		System.out.println("NÃºmero de teléfono: " + tlpnum);
		
		sc.close();
		
	}

}
