package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Employee: " + funcionario);
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		funcionario.IncreaseSalary(sc.nextDouble());
		
		System.out.println("");
		System.out.println("Updated data: " + funcionario);
		
		sc.close();
	}

}
