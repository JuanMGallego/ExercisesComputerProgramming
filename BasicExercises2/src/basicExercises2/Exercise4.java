package basicExercises2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is started to introduce data into variables, then variables are declared
		Scanner sc = new Scanner(System.in);
		boolean rain, homew, lib, strt;
		
		//Raining situation is asked and it will be stored
		System.out.print("¿Está lloveindo?: ");
		rain = sc.nextBoolean();
		
		//Homework situation is asked and it will be stored
		System.out.print("¿Ha terminado los deberes?: ");
		homew = sc.nextBoolean();
		
		//Necessity to go library to situation is asked and it will be stored
		System.out.print("¿Tienes que ir a la biblioteca?: ");
		lib = sc.nextBoolean();
		System.out.println();
		
		/*if its raining it will turn false and the operation will be 
		always false unless there is the need of going to the library*/
		strt = (!rain && homew) || lib;
		
		//It will show you if exists the possibility of going outside
		System.out.print("Posibilidad de salir de casa: " + strt);
		
		sc.close(); //Scanner closes
		
	}

}
