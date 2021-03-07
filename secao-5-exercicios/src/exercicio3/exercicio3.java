package exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (Math.floorMod(a, b) == 0 || Math.floorMod(b, a) == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao Multiplos");
		}
		
		sc.close();

	}

}
