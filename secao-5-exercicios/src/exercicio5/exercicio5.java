package exercicio5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double valor;
		double total;
		
		a = sc.nextDouble();
		b = sc.nextDouble();

		valor = 4.00;
		
		if (a==2) {
			valor = 4.50;
		}else if (a==3) {
			valor = 5.00;
		}else if (a==4) {
			valor = 2.00;
		}else if (a==5) {
			valor = 1.50;
		}
		
		total = valor * b; 
		
		System.out.printf("Total: R$ %.2f", + total);
		
		sc.close();

	}

}
