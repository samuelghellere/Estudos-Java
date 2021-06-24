package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amont: ");
		double amount = sc.nextDouble();
		System.out.print("Month: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double paymant = is.payment(amount, months);
		
		System.out.println("Paymant after " + months + " months: ");
		System.out.print(String.format("%.2f", paymant));
		
		sc.close();

	}

}
