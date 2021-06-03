package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisca;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch=='i') {
				System.out.print("Gastos saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisca(nome, rendaAnual, gastoSaude));
			}else {
				System.out.print("Número de funcionarios: ");
				int numeroFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS");
		
		double totalImposto = 0.00;
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.toString());
			totalImposto += pessoa.totalImposto();
		}
		
		System.out.println();
		System.out.println("TOTAL IMPOSTO: $ " + String.format("%.2f", totalImposto));
		
		sc.close();
	}

}
