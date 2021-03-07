package exercicio6;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		String menssagem;
		
		valor = sc.nextDouble();

		if (valor >= 0.00 && valor <= 25.00) {
			menssagem = "Intervalo [0,25]";
		}else if (valor > 25.00 && valor <= 50.00) {
			menssagem = "Intervalo [25,50]";
		}else if (valor > 50.00 && valor <= 75.00) {
			menssagem = "Intervalo [50,75]";
		}else if (valor > 75.00 && valor <= 100.00) {
			menssagem = "Intervalo [75,100]";
		}else {
			menssagem = "Fora de intervalo";
		}
			
		System.out.printf(menssagem);
		
		sc.close();

	}

}
