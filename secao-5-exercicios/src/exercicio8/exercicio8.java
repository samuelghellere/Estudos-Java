package exercicio8;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base;
		double salario;
		double irrf;
		
		salario = sc.nextDouble();
		irrf = 0.00;
		
		if (salario > 4500.00) {
			base = salario - 4500.00;
			salario = salario - base;  
			irrf = base * 0.28;  
		}
		
		if (salario > 3000.00 ) {
			base = salario - 3000.01;
			salario = salario - base;  
			irrf = irrf + (base * 0.18);
		}
		
		if (salario > 2000.00 ) {
			base = salario - 2000.01;
			salario = salario - base;  
			irrf = irrf + (base * 0.08);
		}
		
		if (irrf == 0) {
			System.out.println("Insento");
		}else {
			System.out.printf("R$ %.2f", irrf);
		}
		
		sc.close();

	}

}
