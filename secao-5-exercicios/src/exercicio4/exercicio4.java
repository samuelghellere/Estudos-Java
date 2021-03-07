package exercicio4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int duracao;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a >= b) {
			duracao = 24 - a + b;
		}
		else {
			duracao = b - a;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
