package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		boolean sair = false;
		String mensagem = "";
		
		while(!sair) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x != 0 && y != 0) {
				if (x > 0 && y > 0)
					mensagem = "primeiro";
				else if (x > 0 && y < 0)
					mensagem = "quarto";
				else if (x < 0 && y < 0)
					mensagem = "terceiro";
				else if (x < 0 && y > 0)
					mensagem = "segundo";

				System.out.println(mensagem);
			}else
				sair = true;
		}
		
		sc.close();

	}

}
