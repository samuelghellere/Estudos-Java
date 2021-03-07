package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoDolar, quantidadeDolar;
		
		System.out.print("What is the dollar price? ");
		precoDolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		quantidadeDolar = sc.nextDouble();
		System.out.print("Amount to be paid in reais = " + CurrencyConverter.converterDolarReais(precoDolar, quantidadeDolar));
		
		sc.close();

	}

}
