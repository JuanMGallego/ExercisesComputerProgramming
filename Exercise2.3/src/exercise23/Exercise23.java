package exercise23;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		int byear = sc.nextInt();
		int year = sc.nextInt();
		
		//Born year is asked
		System.out.print("Introduzca su año de nacimiento: ");
		System.out.println();
		
		//Actual year is asked
		System.out.print("Introduzca el año actual: ");
		System.out.println();
		
		//age of user is calculated in two ways	
		int age = year - byear;
		int age2 = year - byear - 1;

		if (age2 <= 0) { //If the result turns illogical, it gives an error
			System.out.println("Ha introducido mal los datos, vuelva a introducirlos");

		} else { //But if everything goes fine, it prints the two results
			System.out.println("Si ya fue su cumpleaños, su edad es de " + age + " años");
			System.out.println("Si todavía no fue su cumpleaños, su edad es de " + age2 + " años");
			
			sc.close(); //scanner closes
		}
	
	}

}
