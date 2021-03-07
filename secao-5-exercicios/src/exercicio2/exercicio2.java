package exercicio2;

import java.util.Scanner;

public class exercicio2 {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (Math.floorMod(numero, 2) == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
