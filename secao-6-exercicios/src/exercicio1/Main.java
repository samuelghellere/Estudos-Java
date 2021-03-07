package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		boolean senhaValida = false;
		
		while(!senhaValida) {
			senha = sc.nextInt();
			if (senha == 2002) {
				senhaValida = true;
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha invalida");
			}
		}
		
		sc.close();

	}

}
