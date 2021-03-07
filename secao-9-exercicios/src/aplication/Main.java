package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char opcao = sc.nextLine().charAt(0);
		
		double saldo = 0.00;

		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
		}
		
		Conta conta = new Conta(numero, nome, saldo);

		System.out.println("");
		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		conta.deposito(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(conta);
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
