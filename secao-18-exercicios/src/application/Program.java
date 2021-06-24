package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.services.JurosParcelaService;
import entities.services.ParcelarService;
import modal.entities.Contract;
import modal.entities.Installment;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract cr = new Contract(number, data, totalValue);
		
		System.out.print("Enter number of installments: ");
		int numberInstallments = sc.nextInt();
		
		
		ParcelarService parcelarService = new ParcelarService(numberInstallments, new JurosParcelaService());
		parcelarService.processaParcelas(cr);
		
		System.out.println("Installments:");
		
		for(Installment i : cr.getInstallmets()) {
			System.out.println(sdf.format(i.getDueDate()) + " - " + String.format("%.2f", i.getAmount()));
		}
		
		sc.close();
	}

}
