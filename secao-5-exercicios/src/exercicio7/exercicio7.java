package exercicio7;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		String menssagem;
		
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0.00 && y > 0.00) {
			menssagem = "Q1";
		}else if (x < 0.00 && y > 0.00) {
			menssagem = "Q2";
		}else if (x < 0.00 && y < 0.00) {
			menssagem = "Q3";
		}else if (x > 0.00 && y < 0.00) {
			menssagem = "Q4";
		}else {
			menssagem = "Origem";
		}
			
		System.out.printf(menssagem);
		
		sc.close();

	}

}
